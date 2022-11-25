package org.example;

import java.util.HashMap;

public class map_s {
    public static void main(String []args) {
        String tekr = "abcabcbb";
        System.out.println("dizin: " + tekr);
        int uzunc = dizin_hasm(tekr);
        System.out.println("tekrar dizin sayisi: " + uzunc);
    }
    static int dizin_hasm(String tekrar) {
        HashMap<Character, Integer> harf = new HashMap<>();
        int uzu = 0;
        int index = 0;
        for(int i = 0; i < tekrar.length(); i++) {
            if(harf.containsKey(tekrar.charAt(i))) {
                index = Math.max(index, harf.get(tekrar.charAt(i)) + 1);
            }
            harf.put(tekrar.charAt(i), i);
            uzu = Math.max(uzu, i-index + 1);
        }
        return uzu;
    }
}

