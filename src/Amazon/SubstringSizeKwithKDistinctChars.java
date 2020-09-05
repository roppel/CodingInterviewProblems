package Amazon;

import java.util.*;

public class SubstringSizeKwithKDistinctChars {
    public static void main(String[] args) {
        new SubstringSizeKwithKDistinctChars().count("abcabc", 3).forEach(k-> System.out.println(k));
    }
    public List<String> count(String s , int k ){
        Set<String> result = new HashSet<>();

        Map<Character, Integer> map = new HashMap<>();
        int start = -k+1;
        for(int end = 0;end < s.length();end++ ) {
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end), 0)+1);

            if(map.size()==k && end - start+1 == k){
                result.add(s.substring(start, end+1));
            }

            if(start >=0) {
                map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
                if (map.get(s.charAt(start)) == 0) {
                    map.remove(s.charAt(start));
                }
            }
            start++;

        }

        return new ArrayList<>(result);
    }
}
