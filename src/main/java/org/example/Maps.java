package org.example;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap=Map_Depo.Map_olustur();
        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.get(103));
        int ogrenciKey=103;

        String isimSinifDon_maps=Map_Depo.isimSinifDon(ogrenciMap,ogrenciKey);
        System.out.println(ogrenciKey + " nolu ogrenci isim ve sinif: " + isimSinifDon_maps);
        ogrenciMap=Map_Depo.ogrenciYeniSube(ogrenciMap,105,"T");
        }
    }

