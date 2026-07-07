package com.mycompany.telekom;

public class Konusma implements Comparable {
    
    private String arayanNumara;
    private String arananNumara;
    private int aramaSuresi;
    private String tarih;

    public String getArayanNumara() {
        return arayanNumara;
    }

    public void setArayanNumara(String arayanNumara) {
        this.arayanNumara = arayanNumara;
    }

    public String getArananNumara() {
        return arananNumara;
    }

    public void setArananNumara(String arananNumara) {
        this.arananNumara = arananNumara;
    }

    public int getAramaSuresi() {
        return aramaSuresi;
    }

    public void setAramaSuresi(int aramaSuresi) {
        this.aramaSuresi = aramaSuresi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
   
    public Konusma(String arayanNumara, String arananNumara, int aramaSuresi) {
        this.arayanNumara = arayanNumara;
        this.arananNumara = arananNumara;
        this.aramaSuresi = aramaSuresi;
        this.tarih = "2026";
    }
    public String toString() {
        return "Arayan: " + arayanNumara + " | Aranan: " + arananNumara + " | Süre: " + aramaSuresi + " sn";
    }
    public int compareTo(Object o) {
        Konusma digerKonusma = (Konusma) o;
        
        return Integer.compare(this.aramaSuresi, digerKonusma.getAramaSuresi());
    }
}
