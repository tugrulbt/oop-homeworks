package com.mycompany.pizzasiparisi;

import java.util.ArrayList;

public class Sepet {
    private ArrayList<Siparis> siparisListesi;

    public Sepet() {
        this.siparisListesi = new ArrayList<>();
    }

    public void siparisEkle(Siparis s) {
        this.siparisListesi.add(s);
    }

    public void sepetiTemizle() {
        this.siparisListesi.clear();
    }

    public double genelToplamiHesapla() {
        double genelToplam = 0;
        for (Siparis s : siparisListesi) {
            genelToplam += s.getToplamSiparisFiyati();
        }
        return genelToplam;
    }

    public ArrayList<Siparis> getSiparisListesi() {
        return siparisListesi;
    }
}