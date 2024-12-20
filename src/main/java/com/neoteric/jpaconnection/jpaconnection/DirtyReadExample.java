package com.neoteric.jpaconnection.jpaconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DirtyReadExample {

        public static void main(String[] args) {
            try {
                Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "sonar", "sonar");
                Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/sonar", "sonar", "sonar");
                connection2.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);

                connection1.setAutoCommit(false);
                connection2.setAutoCommit(false);

                PreparedStatement updateStmt = connection1.prepareStatement("update sonar.emp set salary=? where empid=?");
                updateStmt.setDouble(1, 100.00);
                updateStmt.setInt(2, 1);
                updateStmt.executeUpdate();

                PreparedStatement selectStmt = connection2.prepareStatement("select salary from sonar.emp where empid=?");
                selectStmt.setInt(1, 1);
                ResultSet resultSet = selectStmt.executeQuery();
                if (resultSet.next()) {
                    System.out.println("T2 before balance: " + resultSet.getDouble("salary"));
                }

                connection1.rollback();
                System.out.println("T1 rollback");

                resultSet = selectStmt.executeQuery();
                if (resultSet.next()) {
                    System.out.println("T2 after rollback: " + resultSet.getDouble("salary")); // Correct value
                }

                connection1.close();
                connection2.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}