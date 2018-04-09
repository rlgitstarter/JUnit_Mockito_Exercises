package com.tutorialspoint.mockito01;

import java.util.List;

public class Portfolio {
    private StockService stockService;
    private List<Stock> stocks;

    // Getter und Setter für StockService und Stock-Liste
    public StockService getStockService() {
        return stockService;
    }

    public void setStockService(StockService stockService) {
        this.stockService = stockService;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    // Berechnung aufgr. des Stock-Einzelpreises und der Menge
    public double getMarketValue() {
        double marketValue = 0.0;

        for(Stock stock: stocks) {
            marketValue = marketValue + stockService.getPrice(stock) * stock.getQuantity();
        }
        return marketValue;
    }
}
