package com.mycompany.consoleapp;

public abstract class Consoles {
    private String deviceType;
    private String storeName;
    private int totalSales;

    public Consoles(String deviceType, String storeName, int totalSales) {
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getStoreName() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSales;
    }
    
}
