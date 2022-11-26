import org.example.Map_Depo;

import java.util.Map;

public class map_7 {
    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap= Map_Depo.Map_olustur();
        ogrenciMap.put(109,"adem-demir-11-d-soz");

        ogrenciMap=Map_Depo.soyisimlerbuyuk(ogrenciMap);
    }
}
