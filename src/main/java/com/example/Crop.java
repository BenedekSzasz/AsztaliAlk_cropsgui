package com.example;

public class Crop {
    int id;
    String name;
    int forage;
    int quantity;

    public Crop() {
    }

    public Crop(String name, int forage, int quantity) {
        this.name = name;
        this.forage = forage;
        this.quantity = quantity;
    }

    public Crop(int id, String name, int forage, int quantity) {
        this.id = id;
        this.name = name;
        this.forage = forage;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Crop [id=" + id + ", name=" + name + ", forage=" + forage + ", quantity=" + quantity + "]";
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

    public int getForage() {
        return forage;
    }

    public void setForage(int forage) {
        this.forage = forage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
}
