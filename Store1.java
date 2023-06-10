package com.kamal.classes.ui;

import java.util.Objects;
public class Store {
    private String stockName;
    private Double stockPrice;
    private Integer quantity;


    public Store(String stockName, Double stockPrice, Integer quantity){
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.quantity = quantity;
    }

    public String getStockName(){
        return stockName;
    }
    public Double getStockPrice(){
        return stockPrice;
    }
    public Integer getQuantity(){
        return quantity;
    }

    @Override
    public String toString() {
        return "Store{" +
                "stockName='" + stockName + '\'' +
                ", stockPrice='" + stockPrice + '\'' +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(stockName, store.stockName) && quantity == store.quantity && Double.compare(store.stockPrice, stockPrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockName, stockPrice, quantity);
    }
}

