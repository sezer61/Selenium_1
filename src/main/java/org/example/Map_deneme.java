package org.example;

import java.util.HashMap;
import java.util.Map;

public class Map_deneme {
    /*
    mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
    mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
    mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */
    public static Map<String,String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b","aaa");
        map.put("c","cake");


        return map;
    }

    public static void main(String[] args) {
        Map<String, String> maps = Map_deneme.map();
        System.out.println(maps);

        if (maps.containsKey("a") && maps.containsKey("b")) {
            String a = maps.get("a");
            String b = maps.get("b");
            if (a.length() > b.length())
                maps.put("c", a);
            else if (b.length() > a.length())
                maps.put("c", b);
            else{
                maps.put("a", "");
                maps.put("b", "");

            }
            System.out.println(maps);

        }

    }


}
