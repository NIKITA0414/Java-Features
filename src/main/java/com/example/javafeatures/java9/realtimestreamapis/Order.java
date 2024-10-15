package com.example.javafeatures.java9.realtimestreamapis;

class Order {
    private String customerName;
    private double totalAmount;

    public Order(String customerName, double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}