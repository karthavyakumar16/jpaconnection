package com.neoteric.jpaconnection.jpaconnection.jpainhertance;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="stock1",schema = "stock")
public class StockEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;

    private int duration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
