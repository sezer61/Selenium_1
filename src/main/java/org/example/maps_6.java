package org.example;

import java.util.Map;
import java.util.Set;

public class maps_6 {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMapi=Map_Depo.Map_olustur();
        ogrenciMapi.put(109,"Adem-demier-11-d-soz");

        Set<String>siraliogrencilistesi=Map_Depo.siraliOgrencilistesi(ogrenciMapi);
        System.out.println(siraliogrencilistesi);
    }
}