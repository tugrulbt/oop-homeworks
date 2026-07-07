package com.mycompany._2d_geometry_primitives;

public class _2d_geometry_primitives {

    public static void main(String[] args) {
        
        System.out.println("--- 1. POINT (NOKTA) TESTI ---");
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        System.out.println("Nokta 1: " + p1.toString());
        System.out.println("Nokta 2: " + p2.toString());
        System.out.println("Iki nokta arasindaki mesafe (3-4-5 ucgeninden 5 olmali): " + p1.distanceFromPoint(p2));

        System.out.println("\n--- 2. LINE (CIZGI) TESTI ---");
        Line line1 = new Line(p1, p2);
        System.out.println("Cizgi 1: " + line1.toString());
        System.out.println("Cizgi 1 Uzunlugu: " + line1.getLength());

        System.out.println("\n--- 3. POLYLINE (COKLU CIZGI) TESTI ---");
        PolyLine polyLine = new PolyLine();
        
        polyLine.appendPoint(1, 1);
        polyLine.appendPoint(1, 4); 
        polyLine.appendPoint(5, 4); 
        
        System.out.println("PolyLine Ciktisi: " + polyLine.toString());
        System.out.println("PolyLine Toplam Uzunlugu: " + polyLine.getLength());
        
        System.out.println("\nTum testler basariyla tamamlandi!");
    }
}
