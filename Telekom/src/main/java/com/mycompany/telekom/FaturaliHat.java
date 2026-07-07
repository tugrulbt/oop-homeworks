package com.mycompany.telekom;

import java.util.ArrayList;

public class FaturaliHat extends Hat {
    
    private int bedavaSure;
    private int faturaTutari;
    private int kullanilanSure;

    public int getBedavaSure() {
        return bedavaSure;
    }

    public void setBedavaSure(int bedavaSure) {
        this.bedavaSure = bedavaSure;
    }

    public int getFaturaTutari() {
        return faturaTutari;
    }

    public void setFaturaTutari(int faturaTutari) {
        this.faturaTutari = faturaTutari;
    }

    public int getKullanilanSure() {
        return kullanilanSure;
    }

    public void setKullanilanSure(int kullanilanSure) {
        this.kullanilanSure = kullanilanSure;
    }

    public FaturaliHat(String numara, int bedavaSure, int faturaTutari) {
        super(numara);
        this.bedavaSure = bedavaSure;
        this.faturaTutari = faturaTutari;
        this.kullanilanSure = 0;
    }

    public void AramaYap(String arananNumara, int konusmaSuresi) {
        Konusma yeniKonusma = new Konusma(this.getNumara(), arananNumara, konusmaSuresi);
        
        this.getKonusmalar().add(yeniKonusma);
        
        this.kullanilanSure += konusmaSuresi;
    }

    public void GelenArama(String arayanNumara, int konusmaSuresi) {
        Konusma yeniKonusma = new Konusma(arayanNumara, this.getNumara(), konusmaSuresi);
        
        this.getKonusmalar().add(yeniKonusma);
    }
    
    public double FaturaHesapla() {
        double toplamFatura = faturaTutari;
        
        if (kullanilanSure > bedavaSure) {
            int asim = kullanilanSure - bedavaSure;
            
            int eklenecekBlok = (int) Math.ceil((double) asim / 60);
            toplamFatura += eklenecekBlok * 2;
        }
        
        return toplamFatura;
    }

}
