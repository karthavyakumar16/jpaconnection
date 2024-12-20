package com.neoteric.jpaconnection.jpaconnection.jpainhertance;

import java.util.Date;

public  abstract class StockTest {

    public static void main(String[] args) {
        StockService stockService = new StockService();

        RestrictedStockEntity restrictedStock = new RestrictedStockEntity();
        restrictedStock.setPrice(300.5);
        restrictedStock.setDuration(24);
        restrictedStock.setLockInPeriod(11);

        OptionalStockEntity optionalStock = new OptionalStockEntity();
        optionalStock.setPrice(400.75);
        optionalStock.setDuration(36);
        optionalStock.setStrikePrice(150.5);

        FutureStocksEntity futureStock = new FutureStocksEntity();
        futureStock.setPrice(1500.25);
        futureStock.setDuration(18);
        futureStock.setDeliveryDate(new Date());

        stockService.saveStock(restrictedStock);
        stockService.saveStock(optionalStock);
        stockService.saveStock(futureStock);
    }
}


