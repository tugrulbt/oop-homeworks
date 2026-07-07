package com.mycompany.student_grade_management_system;

import java.util.Scanner;

public class NesneyeYonelikProgramlamaDersiOgrenciNotYonetimSistemi {

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);

        System.out.print("Sisteme girilecek ogrenci sayisini giriniz: ");
        int n = tarayici.nextInt();

        // Ogrenci Bilgileri
        int[] numaralar = new int[n];
        String[] isimler = new String[n];
        double[] vizeNotlari = new double[n];
        double[] finalNotlari = new double[n];

        int secim = 0;
        
        // Menu dongusu
        while (secim != 9) {
            System.out.println("\n --- NESNEYE YONELIK PROGRAMLAMA DERSI NOT YONETIM SISTEMI ---");
            System.out.println("(1) Ogrenci Bilgilerini Gir");
            System.out.println("(2) Sistemdeki Ogrencileri Giris Sirasina Gore Goruntule");
            System.out.println("(3) Sinav Sonucu 60'tan Kucuk Olanlari Goruntule");
            System.out.println("(4) Sinav Sonucu Ortalamanin Ustunde Olanlari Goruntule");
            System.out.println("(5) Sinav Sonucu 60'tan Kucuk Olanlarin Sayisini Bul");
            System.out.println("(6) En Yuksek Sinav Sonucunu Goruntule");
            System.out.println("(7) En Dusuk Sinav Sonucunu Goruntule");
            System.out.println("(8) Sistemdeki Ogrencileri Notlara Gore Sirala ve Goruntule");
            System.out.println("(9) Cikis");
            System.out.print("Lutfen bir islem seciniz: ");
            
            secim = tarayici.nextInt();

            switch (secim) {
                case 1:
                    ogrenciBilgileriniAl(numaralar, isimler, vizeNotlari, finalNotlari, tarayici);
                    break;
                case 2:
                    bilgileriGoruntule(numaralar, isimler, vizeNotlari, finalNotlari);
                    break;
                case 3:
                    altmisinAltindakileriGoruntule(numaralar, isimler, vizeNotlari, finalNotlari);
                    break;
                case 4:
                    ortalamaUstuAlanlariGoruntule(numaralar, isimler, vizeNotlari, finalNotlari);
                    break;
                case 5:
                    altmisinAltindakilerinSayisi(isimler, vizeNotlari, finalNotlari);
                    break;
                case 6:
                    enYuksekNotuBul(isimler, vizeNotlari, finalNotlari);
                    break;
                case 7:
                    enDusukNotuBul(isimler, vizeNotlari, finalNotlari);
                    break;
                case 8:
                    siraliGoruntule(numaralar, isimler, vizeNotlari, finalNotlari);
                    break;
                case 9:
                    System.out.println("Sistemden cikiliyor. Iyi gunler!");
                    break;
                default:
                    System.out.println("Hatali secim yaptiniz, lutfen tekrar deneyin.");
            }
        }
    }
    
    // --- YARDIMCI METOTLAR ---
    
    // Sinav sonuc ortalamasini bulan metot (vize %40, final %60)
    public static double ortalamaHesapla(double vizeNotu, double finalNotu) {
        return (vizeNotu * 0.4) + (finalNotu * 0.6);
    }

    //Henuz veri girilmemisse programin cokmesini onleyen hata kontrolu yapan metot
    public static boolean kayitYokMu(String[] isimler) {
        if (isimler[0] == null) {
            System.out.println("Uyari: Henuz sisteme ogrenci girilmemis! Lutfen once (1) numarali menuden kayit yapin.");
            return true;
        }
        return false;
    }

    // 1. Secenek: Ogrenci bilgilerini kullanicidan isteyen metot
    public static void ogrenciBilgileriniAl(int[] numaralar, String[] isimler, double[] vizeNotlari, double[] finalNotlari, Scanner tarayici) {
        System.out.println("\n --- Sisteme Ogrenci Bilgileri Girisi ---");
        tarayici.nextLine(); 
        
        for (int i = 0; i < isimler.length; i++) {
            System.out.println("\n" + (i + 1) + ". Ogrencinin Bilgileri:");
            
            System.out.print("Ismi: ");
            isimler[i] = tarayici.nextLine();
            
            System.out.print("Numarasi: ");
            numaralar[i] = tarayici.nextInt();
            
            System.out.print("Vize Notu: ");
            vizeNotlari[i] = tarayici.nextDouble();
            
            System.out.print("Final Notu: ");
            finalNotlari[i] = tarayici.nextDouble();

            if (i < isimler.length - 1) {
                 tarayici.nextLine(); 
            }
        }
        System.out.println("\n Tum ogrencilerin bilgileri basariyla kaydedildi!");
    }

    // 2. Secenek: Okunan bu bilgileri sisteme giris sirasina gore goruntuleyen metot
    public static void bilgileriGoruntule(int[] numaralar, String[] isimler, double[] vizeNotlari, double[] finalNotlari) {
        if (kayitYokMu(isimler)) return;
        
        System.out.println("\n --- Sisteme Giris Sirasina Gore Sirali Liste ---");
        for (int i = 0; i < isimler.length; i++) {
            System.out.println("Numara: " + numaralar[i] + " | Isim: " + isimler[i] + " | Vize: " + vizeNotlari[i] + " | Final: " + finalNotlari[i]);
        }
    }
    
    // 3. Secenek: 60'tan kucuk sinav sonuclarini ve bu sonuclara ait ogrenci numaralarini ve isimlerini goruntuleyen metot
    public static void altmisinAltindakileriGoruntule(int[] numaralar, String[] isimler, double[] vizeNotlari, double[] finalNotlari) {
        if (kayitYokMu(isimler)) return;
        
        System.out.println("\n --- Sinav Sonucu 60'tan Kucuk Olan Ogrenciler ---");
        boolean kalanVarMi = false;

        for (int i = 0; i < isimler.length; i++) {
            double ortalama = ortalamaHesapla(vizeNotlari[i], finalNotlari[i]);
            if (ortalama < 60) {
                System.out.println("Numara: " + numaralar[i] + " | Isim: " + isimler[i] + " | Sinav Sonucu: " + ortalama);
                kalanVarMi = true;
            }
        }

        if (!kalanVarMi) {
            System.out.println("Sinav sonucu 60'tan kucuk olan ogrenci yok!");
        }
    }
   
    // 4. Secenek: Ortalamanin ustunde not alan ogrenci numaralari ve notlari goruntuleyen metot
    public static void ortalamaUstuAlanlariGoruntule(int[] numaralar, String[] isimler, double[] vizeNotlari, double[] finalNotlari) {
        if (kayitYokMu(isimler)) return;
        
        System.out.println("\n --- Sinav Sonucu Ortalamanin Ustunde Olan Ogrenciler ---");

        double toplamNot = 0;
        for (int i = 0; i < isimler.length; i++) {
            toplamNot += ortalamaHesapla(vizeNotlari[i], finalNotlari[i]);
        }
        double sinifOrtalamasi = toplamNot / isimler.length;

        boolean ustundeAlanVarMi = false;
        for (int i = 0; i < isimler.length; i++) {
            double ortalama = ortalamaHesapla(vizeNotlari[i], finalNotlari[i]);
            if (ortalama > sinifOrtalamasi) {
                System.out.println("Numara: " + numaralar[i] + " | Notu: " + ortalama);
                ustundeAlanVarMi = true;
            }
        }
        
        if (!ustundeAlanVarMi) {
             System.out.println("Sinav sonucu ortalamanin ustunde olan ogrenci yok!");
        }
    }

    // 5. Secenek: 60'tan kucuk sinav sonuc degerlerinin sayisini veren metot
    public static void altmisinAltindakilerinSayisi(String[] isimler, double[] vizeNotlari, double[] finalNotlari) {
        if (kayitYokMu(isimler)) return;
        
        int kalanSayisi = 0;
        for (int i = 0; i < isimler.length; i++) {
            if (ortalamaHesapla(vizeNotlari[i], finalNotlari[i]) < 60) {
                kalanSayisi++;
            }
        }
        System.out.println("\n Sinav sonucu 60'tan kucuk olan toplam ogrenci sayisi: " + kalanSayisi);
    }
    
    // 6. Secenek: En yuksek sinav sonucunu veren metot
    public static void enYuksekNotuBul(String[] isimler, double[] vizeNotlari, double[] finalNotlari) {
        if (kayitYokMu(isimler)) return;
        
        double enYuksek = ortalamaHesapla(vizeNotlari[0], finalNotlari[0]);
        for (int i = 1; i < isimler.length; i++) {
            double anlikOrtalama = ortalamaHesapla(vizeNotlari[i], finalNotlari[i]);
            if (anlikOrtalama > enYuksek) {
                enYuksek = anlikOrtalama;
            }
        }
        System.out.println("\n En Yuksek Sinav Sonucu: " + enYuksek);
    }

    // 7. Secenek: En dusuk sinav sonucunu veren metot
    public static void enDusukNotuBul(String[] isimler, double[] vizeNotlari, double[] finalNotlari) {
        if (kayitYokMu(isimler)) return;
        
        double enDusuk = ortalamaHesapla(vizeNotlari[0], finalNotlari[0]);
        for (int i = 1; i < isimler.length; i++) {
            double anlikOrtalama = ortalamaHesapla(vizeNotlari[i], finalNotlari[i]);
            if (anlikOrtalama < enDusuk) {
                enDusuk = anlikOrtalama;
            }
        }
        System.out.println("\n En Dusuk Sinav Sonucu: " + enDusuk);
    }

    // 8. Secenek: Sinav sonuclarina gore kucukten buyuge sirali olarak numaralari, isimleri ve sonuclari goruntuleyen metot
    public static void siraliGoruntule(int[] numaralar, String[] isimler, double[] vizeNotlari, double[] finalNotlari) {
        if (kayitYokMu(isimler)) return;

        // Dizinin bir kopyasini olusturma kismi(copyArray)
        int n = isimler.length;
        int[] kopyaNumaralar = new int[n];
        String[] kopyaIsimler = new String[n];
        double[] kopyaVize = new double[n];
        double[] kopyaFinal = new double[n];

        for (int i = 0; i < n; i++) {
            kopyaNumaralar[i] = numaralar[i];
            kopyaIsimler[i] = isimler[i];
            kopyaVize[i] = vizeNotlari[i];
            kopyaFinal[i] = finalNotlari[i];
        }

        // Bubble Sort ile kucukten buyuge siralama
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                double ort1 = ortalamaHesapla(kopyaVize[j], kopyaFinal[j]);
                double ort2 = ortalamaHesapla(kopyaVize[j + 1], kopyaFinal[j + 1]);

                if (ort1 > ort2) {
                    int tempNum = kopyaNumaralar[j];
                    kopyaNumaralar[j] = kopyaNumaralar[j + 1];
                    kopyaNumaralar[j + 1] = tempNum;

                    String tempIsim = kopyaIsimler[j];
                    kopyaIsimler[j] = kopyaIsimler[j + 1];
                    kopyaIsimler[j + 1] = tempIsim;

                    double tempVize = kopyaVize[j];
                    kopyaVize[j] = kopyaVize[j + 1];
                    kopyaVize[j + 1] = tempVize;

                    double tempFinal = kopyaFinal[j];
                    kopyaFinal[j] = kopyaFinal[j + 1];
                    kopyaFinal[j + 1] = tempFinal;
                }
            }
        }

        System.out.println("\n --- Kucukten Buyuge Sinav Sonuclarina Gore Sirali Liste ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Numara: " + kopyaNumaralar[i] + " | Isim: " + kopyaIsimler[i] + " | Sinav Sonucu: " + ortalamaHesapla(kopyaVize[i], kopyaFinal[i]));
        }
    }
}