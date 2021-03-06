package Grokking.Ch1_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {
    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("aabccbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abbbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abccde"));
    }
    public static int findLength(String str) {


        int windowStart =0;
        int maxLength =0;
        Map<Character,Integer> map = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);

            if (map.containsKey(rightChar)) {
                // this is tricky; in the current window, we will not have any 'rightChar' after its previous index
                // and if 'windowStart' is already ahead of the last index of 'rightChar', we'll keep 'windowStart'
                windowStart = Math.max(windowStart, map.get(rightChar) + 1);
            }

            
            map.put(rightChar, windowEnd); // insert the 'rightChar' into the map

            maxLength = Math.max(maxLength, windowEnd-windowStart+1);

        }





        return maxLength;



    }
}
