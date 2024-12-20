package com.neoteric.jpaconnection.jpaconnection.jpainhertance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "futurestocks",schema = "stock")
public class FutureStocksEntity  extends StockEntity{

    private Date deliveryDate;

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
