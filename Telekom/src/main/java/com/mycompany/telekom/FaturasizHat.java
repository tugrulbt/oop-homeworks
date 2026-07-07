package com.mycompany.telekom;

import java.util.ArrayList;

public class FaturasizHat extends Hat {
    
    private double bakiye;

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public FaturasizHat(String numara, int Bakiye) {
        super(numara);
        this.bakiye = Bakiye;
    }
        
    public void AramaYap(String arananNumara, int konusmaSuresi) {
        if (bakiye <= 0) {
            System.out.println("Bakiyeniz yetersiz. Arama yapılamıyor.");
            return;
        }
        
        double saniyeUcreti = 0.05;
        int yapilabilecekMaxSure = (int) (bakiye / saniyeUcreti);
        
        int gercekSure;
        
        if (konusmaSuresi > yapilabilecekMaxSure) {
            gercekSure = yapilabilecekMaxSure;
        } else {
            gercekSure = konusmaSuresi;
        }
        
        bakiye -= (gercekSure * saniyeUcreti);
        
        Konusma yeniKonusma = new Konusma(this.getNumara(), arananNumara, gercekSure);
        this.getKonusmalar().add(yeniKonusma);
    }
    
    public void GelenArama(String arayanNumara, int konusmaSuresi) {
        Konusma yeniKonusma = new Konusma(arayanNumara, this.getNumara(), konusmaSuresi);
        this.getKonusmalar().add(yeniKonusma);
    }
        
        public void BakiyeYukle(double miktar) {
        this.bakiye += miktar;
    }

    }
