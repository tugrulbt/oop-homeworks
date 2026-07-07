package com.mycompany.telekom;

public class Telekom {

    public static void main(String[] args) {

    FaturaliHat faturali = new FaturaliHat("5051112233", 100, 50); 

    FaturasizHat faturasiz = new FaturasizHat("5329998877", 5); 

    System.out.println("--- TELEKOM SİSTEM TESTİ BAŞLIYOR ---");

    System.out.println("\n[Faturalı Hat İşlemleri]");
    faturali.AramaYap("5550001122", 130);
    faturali.AramaYap("5550001122", 20);
    faturali.GelenArama("5329998877", 45);
    
    System.out.println("\n[Faturasız Hat İşlemleri]");
    faturasiz.AramaYap("5051112233", 150); 

    System.out.println("\n--- FATURALI HAT RAPORU ---");
    System.out.println("En Uzun Konuşma -> " + faturali.EnUzunKonusma());
    System.out.println("Arama Sıklığı Sıralaması -> " + faturali.AramaSikliginaGoreSirala());
    System.out.println("Güncel Fatura Tutarı -> " + faturali.FaturaHesapla() + " TL (Beklenen: 52.0 TL)");

    System.out.println("\n--- FATURASIZ HAT RAPORU ---");
    System.out.println("En Uzun Konuşma -> " + faturasiz.EnUzunKonusma() + " (Beklenen süre 100 sn olmalı)");
}
}
