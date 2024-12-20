package com.neoteric.jpaconnection.jpaconnection.jpainhertance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "optionalstock",schema = "stock")
public class OptionalStockEntity extends StockEntity {

    private double strikePrice;


    public double getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(double strikePrice) {
        this.strikePrice = strikePrice;
    }
}
