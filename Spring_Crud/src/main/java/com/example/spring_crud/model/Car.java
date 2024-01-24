package com.example.spring_crud.model;

public class Car {
    private int id;
    private String name;
    private String details;
    private int price;
    private String manufacturer;
    private boolean status;

    public Car() {
    }

    public Car(int id, String name, String details, int price, String manufacturer, boolean status) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.price = price;
        this.manufacturer = manufacturer;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", status=" + status +
                '}';
    }
}