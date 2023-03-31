package model;

import controller.ConvertToIncome;

public class Product implements ConvertToIncome {
    private String id, name;
    private int stock, performanceRate;
    private float grossPrice;

    public Product(String id, String name, int stock, int performanceRate, float grossPrice) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.performanceRate = performanceRate;
        this.grossPrice = grossPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPerformanceRate() {
        return performanceRate;
    }

    public void setPerformanceRate(int performanceRate) {
        this.performanceRate = performanceRate;
    }

    public float getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(float grossPrice) {
        this.grossPrice = grossPrice;
    }


    @Override
    public float calculatePrice() {
        float percentage = (performanceRate / 100f);
        return (grossPrice + (grossPrice * percentage));
    }
}
