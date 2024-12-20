package com.neoteric.jpaconnection.jpaconnection.jpainhertance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "restrictedstock" ,schema = "stock")
public class RestrictedStockEntity extends StockEntity{

    private int lockInPeriod;

    public int getLockInPeriod() {
        return lockInPeriod;
    }

    public void setLockInPeriod(int lockInPeriod) {
        this.lockInPeriod = lockInPeriod;
    }
}
