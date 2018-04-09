package com.tutorialspoint.mockito01;

public class Stock {
    private String stockId;
    private String name;
    private int quantity;

    // Konstruktor mit Parameter
    public Stock(String stockId, String name, int quantity) {
        this.stockId = stockId;
        this.name = name;
        this.quantity = quantity;
    }

    // Getter und Setter für Id, Getter für Quantity und Ticker

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTicker() {
        return name;
    }
}
