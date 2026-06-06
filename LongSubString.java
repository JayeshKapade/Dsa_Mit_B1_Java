import java.util.*;
public class LongSubString {
    public static void main(String[] args) {
        String s = "aabcbad";
        int k = 2;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;
        for (int r=0;r<s.length();r++) {
            char curr = s.charAt(r);
            map.put(s.charAt(r), map.getOrDefault(curr , 0) + 1);

            if (map.size() <= k) {
                max = max<(r-l+1) ? (r-l+1) : max;
                
           }
           while (map.size() > k) {
                if (map.get(s.charAt(l)) == 1) {
                    map.remove(s.charAt(l));
                } 
                else {
                    map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                }
            }
            l++;

        }

    }

}
