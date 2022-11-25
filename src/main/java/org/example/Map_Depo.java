package org.example;

import java.util.HashMap;
import java.util.Map;

public class Map_Depo {
    public static Map<Integer,String> Map_olustur(){
        Map<Integer,String>ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Ayse-Cem-11-M-TM");
        ogrenciMap.put(106,"Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }
    public static  String isimSinifDon(Map<Integer,String> ogrenciMap,int ogrenciKey){
        String ogrenciValue=ogrenciMap.get(ogrenciKey);
        String[]valueArr=ogrenciValue.split("-");
        String isimSinif=valueArr[0]+" "+ valueArr[2];

        return isimSinif;
    }
    public static Map<Integer,String>ogrenciYeniSube(Map<Integer,String>ogrenciMap,int ogrenciKey,String yeniSube){
        if (ogrenciMap.containsKey(ogrenciKey)){
            String istenenKeyValue= ogrenciMap.get(ogrenciKey);
            String[]istenenKeyValueArr=istenenKeyValue.split("-");
            istenenKeyValueArr[3]=yeniSube;
            String isteneKeyYeniValue=istenenKeyValueArr+ "-" +
                    istenenKeyValueArr[1]+ "-"+
                    istenenKeyValueArr[2]+ "-"+
                    istenenKeyValueArr[3]+ "-"+
                    istenenKeyValueArr[4];
            ogrenciMap.put(ogrenciKey,isteneKeyYeniValue);
        }
        return ogrenciMap;
    }

}