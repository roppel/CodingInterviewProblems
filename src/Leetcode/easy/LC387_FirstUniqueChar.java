package Leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class LC387_FirstUniqueChar {

    public static void main(String[] args) {
        LC387_FirstUniqueChar lc387 = new LC387_FirstUniqueChar();
        System.out.println(lc387.firstUniquChar("leetcode"));
        System.out.println(lc387.firstUniquChar("loveleetcode"));
    }
    public static int firstUniquChar(String s) {

        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {


                map.put(s.charAt(i), -1);

            } else {
                map.put(s.charAt(i), i);

            }
        }


        int min = Integer.MAX_VALUE;

        for (Character c : map.keySet()) {
            if (map.get(c) > -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }


        return min == Integer.MAX_VALUE ? -1 : min;
    }

}
