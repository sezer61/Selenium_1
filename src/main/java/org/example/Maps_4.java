package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_4 {


    public static String[] allSwap(String[] strings) {
        String[] result = new String[strings.length];
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(0);
            if (map.containsKey(c)) {
                int p = map.get(c);
                map.remove(c);
                ;
                result[i] = result[p];
                result[p] = strings[i];
            } else {
                result[i] = strings[i];
                map.put(c, i);
            }
        }
        return result;
    }
}
