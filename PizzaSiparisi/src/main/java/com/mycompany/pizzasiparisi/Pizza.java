package com.mycompany.pizzasiparisi;

import java.util.ArrayList;

public class Pizza {
    private String isim;        
    private String boyut;       
    private String hamurTipi;   
    private ArrayList<String> malzemeler; 
    private double fiyat;
    private double ozelMalzemelerFiyati;

    public Pizza(String isim, String boyut, String hamurTipi) {
        this.isim = isim;
        this.boyut = boyut;
        this.hamurTipi = hamurTipi;
        this.malzemeler = new ArrayList<>(); 
        this.fiyat = 0.0;
        this.ozelMalzemelerFiyati = 0.0;
    }

    public void malzemeEkle(String malzeme) {
        this.malzemeler.add(malzeme);
    }
    
    public void setOzelMalzemelerFiyati(double fiyat) {
        this.ozelMalzemelerFiyati = fiyat;
    }

    public void fiyatHesapla() {
        double toplam = 0;

        if (this.boyut.contains("Küçük")) toplam += 250.0;
        else if (this.boyut.contains("Orta")) toplam += 350.0;
        else if (this.boyut.contains("Büyük")) toplam += 450.0;
        if (this.hamurTipi.contains("Dublex")) toplam += 60.0;
        if (this.isim.contains("Extravaganza")) toplam += 150.0;
        else if (this.isim.contains("Karışık")) toplam += 130.0;
        else if (this.isim.contains("Mexicano")) toplam += 140.0;
        else if (this.isim.contains("İtaliano")) toplam += 140.0;
        else if (this.isim.contains("Turkish")) toplam += 160.0;
        else if (this.isim.contains("Favorite")) toplam += 140.0;
        else if (this.isim.contains("Kendi Pizzanı Oluştur")) {
            toplam += this.ozelMalzemelerFiyati;
        }

        this.fiyat = toplam;
    }

    @Override
    public String toString() {
        return isim + " [" + boyut + ", " + hamurTipi + "] -> " + fiyat + " TL";
    }

    public String getIsim() { return isim; }
    public void setIsim(String isim) { this.isim = isim; }
    public String getBoyut() { return boyut; }
    public void setBoyut(String boyut) { this.boyut = boyut; }
    public String getHamurTipi() { return hamurTipi; }
    public void setHamurTipi(String hamurTipi) { this.hamurTipi = hamurTipi; }
    public ArrayList<String> getMalzemeler() { return malzemeler; }
    public void setMalzemeler(ArrayList<String> malzemeler) { this.malzemeler = malzemeler; }
    public double getFiyat() { return fiyat; }
    public void setFiyat(double fiyat) { this.fiyat = fiyat; }
}