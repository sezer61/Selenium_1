import org.example.Map_Depo;
import org.example.Maps_4;

import java.util.HashMap;
import java.util.Map;

public class map_7 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

    }
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
