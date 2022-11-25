package org.example;

import java.util.Map;

public class map_dene3 {
        public static void main(String[] args) {
            Map<String, String> maps = Map_Dene.map();
            System.out.println(maps);

            if (maps.containsKey("a")) {
                maps.put("b", "bbb");
                maps.put("a", "aaa");
                maps.put("c", "cake");//
                maps.remove("c");
                System.out.println(maps);
            }
    }
}
