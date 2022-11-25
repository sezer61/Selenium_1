package org.example;

import java.util.List;
import java.util.Map;

public class MapKeyy {
    public static void main(String[] args) {
        Map<Integer,String>ogrencMap=Map_Depo.Map_olustur();

        ogrencMap.put(107,"Tugay-Cil-12-K-MF");
        ogrencMap.put(103,"Hikmet-Saglam-11-M-Soz");
        int baslaNo=102;
        int bitNo=120;
        List<String> isimlistesi=Map_Depo.numaradegerinegorelisteolustur(ogrencMap,baslaNo,bitNo);
        System.out.println(isimlistesi);

    }
}
