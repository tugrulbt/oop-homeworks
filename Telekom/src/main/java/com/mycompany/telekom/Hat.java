package com.mycompany.telekom;

import java.util.ArrayList;
import java.util.*;

public abstract class Hat {
    
    private String numara;
    private ArrayList<Konusma> konusmalar;

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public ArrayList<Konusma> getKonusmalar() {
        return konusmalar;
    }

    public void setKonusmalar(ArrayList<Konusma> konusmalar) {
        this.konusmalar = konusmalar;
    }
    
    public Hat(String numara) {
        this.numara = numara;
        this.konusmalar = new ArrayList<>();
    }

    public abstract void AramaYap(String arananNumara, int konusmaSuresi);
    public abstract void GelenArama(String arayanNumara, int konusmaSuresi);

    public Konusma EnUzunKonusma() {
        if (konusmalar.isEmpty()) {
            return null;
        }
        
        Konusma enUzun = konusmalar.get(0);
        
        for (Konusma k : konusmalar) {
            if (k.getAramaSuresi() > enUzun.getAramaSuresi()) {
                enUzun = k;
            }
        }
        return enUzun;
    }
    public ArrayList<String> AramaSikliginaGoreSirala() {
        HashMap<String, Integer> frekans = new HashMap<>();

        for (Konusma k : konusmalar) {
            String karsiNumara = k.getArayanNumara().equals(this.numara) ? k.getArananNumara() : k.getArayanNumara();
            
            frekans.put(karsiNumara, frekans.getOrDefault(karsiNumara, 0) + 1);
        }

        ArrayList<Map.Entry<String, Integer>> liste = new ArrayList<>(frekans.entrySet());

        liste.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            } else {
                return b.getKey().compareTo(a.getKey());
            }
        });

        ArrayList<String> sonuc = new ArrayList<>();
        for (Map.Entry<String, Integer> eleman : liste) {
            sonuc.add(eleman.getKey());
        }

        return sonuc;
    }
    
    public String toString() {
        return numara;
    }
}
