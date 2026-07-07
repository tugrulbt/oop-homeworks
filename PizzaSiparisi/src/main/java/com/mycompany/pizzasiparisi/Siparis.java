package com.mycompany.pizzasiparisi;

import java.util.ArrayList;

public class Siparis {
    private Pizza pizza; 
    private ArrayList<String> ekstralar; 
    private double ekstraFiyatTutari;
    private double toplamSiparisFiyati;

    public Siparis(Pizza pizza) {
        this.pizza = pizza;
        this.ekstralar = new ArrayList<>();
        this.ekstraFiyatTutari = 0.0;
        this.toplamSiparisFiyati = 0.0;
    }

    public void ekstraEkle(String ekstraIsmi, double fiyat) {
        this.ekstralar.add(ekstraIsmi);
        this.ekstraFiyatTutari += fiyat;
    }

    public void siparisFiyatiniHesapla() {
        this.pizza.fiyatHesapla();
        this.toplamSiparisFiyati = this.pizza.getFiyat() + this.ekstraFiyatTutari;
    }

    @Override
    public String toString() {
        String metin = pizza.getIsim() + " (" + pizza.getBoyut() + ") ";
        if (!ekstralar.isEmpty()) {
            metin += "+ Ekstralar ";
        }
        metin += "-> " + toplamSiparisFiyati + " TL";
        return metin;
    }

    public Pizza getPizza() { return pizza; }
    public void setPizza(Pizza pizza) { this.pizza = pizza; }
    public ArrayList<String> getEkstralar() { return ekstralar; }
    public double getToplamSiparisFiyati() { return toplamSiparisFiyati; }
}