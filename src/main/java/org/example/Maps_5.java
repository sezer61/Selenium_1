package org.example;

import java.util.Map;
import java.util.Set;

public class Maps_5 {
    public static void main(String[] args) {


        Map<Integer, String> ogrenciMap = Map_Depo.Map_olustur();
        System.out.println(ogrenciMap);
        Set<Map.Entry<Integer,String>> ogrencientryset= ogrenciMap.entrySet();
        System.out.println(ogrencientryset);

        int sirano=1;
        for (Map.Entry<Integer,String>eachEntry:ogrencientryset){
            System.out.println(sirano + "- "+eachEntry);
            sirano++;
        }
        for (Map.Entry<Integer,String> eachEntry:ogrencientryset
             ) {
            System.out.println(eachEntry.getKey());

        }
        String entrValue;
        String[]entryValueArr;
        for (Map.Entry<Integer,String>eachEntr:ogrencientryset
             ) {
            entrValue=eachEntr.getValue();
            entryValueArr=entrValue.split("-");
            if (entryValueArr[2].equals("12")){
                eachEntr.setValue("Mezun");


            }else{
                int sinif=Integer.parseInt(entryValueArr[2]);
                sinif++;
                entryValueArr[2]=sinif+"";
                eachEntr.setValue(entryValueArr[0]+"-"+
                                entryValueArr[1]+"-"+
                                entryValueArr[2]+"-"+
                                entryValueArr[3]+"-"+
                                entryValueArr[4]);



            }
        }
        System.out.println(ogrenciMap);
    }

}
