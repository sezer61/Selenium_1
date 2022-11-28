package org.example;


import java.util.HashMap;
import java.util.Map;
public class   Urunler {
 String urunler_isim;
 double fiyat;
 Urunler (String urunler_isim,double fiyat){
     this.urunler_isim=urunler_isim;
     this.fiyat=fiyat;
     Map<String,Double>UrunLis=new HashMap<>();
     UrunLis.put(urunler_isim,fiyat);
     System.out.println(urunler_isim);
 }

    public double getFiyat() {
        return fiyat;
    }
}
