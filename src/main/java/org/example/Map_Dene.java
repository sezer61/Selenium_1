package org.example;

import java.util.HashMap;
import java.util.Map;

public class Map_Dene {

    public static Map<String,String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b","dirt");


        return map;
    }

    public static void main(String[] args) {
        Map<String,String> maps=Map_Dene.map();
        System.out.println(maps);

        if (maps.containsKey("a")){
            maps.put("b",maps.get("a"));
            maps.put("a","");
            maps.put("c","meh");//
            System.out.println(maps);
        }



       /* maps.put(1,"a-'' ");
        maps.put(2,"b-candy");
        System.out.println(maps);

        maps.put(1,"a-'' ");
        maps.put(2,"b-candy");
        maps.put(3,"c-meh");
        System.out.println(maps);

        */

    }









        /*}
    public static  String mapDonDur(Map<Integer,String> degMap,String mapKey){
        String mapvalue=degMap.get(mapKey);
        String[]valueArr=mapvalue.split("-");
        String map_=valueArr[0]+" "+ valueArr[1];
        return map_;
    }
    public static Map<Integer,String>mapyeni(Map<Integer,String>Map , Integer m_Key,String yenidegis) {
        if (Map.containsKey(m_Key)) {
            String istenenDonValue=Map.get(m_Key);
            String[]istenenArr=istenenDonValue.split("-");
            istenenArr[1]=yenidegis;

            String istenenMapYeniValu=istenenArr[0] + "-"+
                    istenenArr[1];
            Map.put(m_Key,istenenMapYeniValu);

        }
        return Map;
    }

     */

}
