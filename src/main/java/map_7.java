import org.example.Map_Depo;
import org.example.Maps_4;

import java.util.HashMap;
import java.util.Map;

public class map_7 {
    public static String[] allSwap(final String[] strings) {
        // map of first characters, and the index where they were last seen
        final Map<Character, Integer> potentialSwap = new HashMap<>();

        for (int thisIndex = 0; thisIndex < strings.length; thisIndex++) {
            if (strings[thisIndex].isEmpty()) {
                continue; // skip empty strings
            }

            final Character firstChar = strings[thisIndex].charAt(0); // box charAt(0)
            // remove firstChar from the map. If it's not found, returns null
            final Integer potentialIndex = potentialSwap.remove(firstChar);

            if (potentialIndex != null) {
                final int thatIndex = potentialIndex; // unbox potentialIndex
                // swap values at thisIndex and thatIndex
                final String temp = strings[thatIndex];
                strings[thatIndex] = strings[thisIndex];
                strings[thisIndex] = temp;
            } else {
                // save the index for possible swapping later
                potentialSwap.put(firstChar, thisIndex); // box thisIndex
            }
        }

        return strings;
    }
}
