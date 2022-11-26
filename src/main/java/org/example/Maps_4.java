package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_4 {
    public static void main(String[] args) {

    }
    public static String[] firstSwap(String[] strings) {
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < strings.length; ++i) {
            char cur=strings[i].charAt(0);
            if (tm.containsKey(cur)){
                int mapping = tm.get(cur);
                if(mapping == -1){
                    continue;
                }
                else{
                    String tmp=strings[mapping];
                    strings[mapping] =strings[i];
                    strings[i]=tmp;
                    tm.replace(cur,-1);
                }
            }
            else{
                tm.put(cur,i);
            }
        }
        return strings;
    }
}
