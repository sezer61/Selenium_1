package org.example;

import java.util.*;

public class benzersiz_goster {
    public static void main(String args[]) {
        String[] benzersiz = { "10", "31", "15", "7", "15", "7", "7" };
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < benzersiz.length; i++)
            set.add(benzersiz[i]);
        System.out.println(set.size());
    }
}
