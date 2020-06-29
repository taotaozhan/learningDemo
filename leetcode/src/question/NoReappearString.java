package question;

import java.util.HashMap;
import java.util.Map;

/**
 * 无重复字符的最长的子串
 */

public class NoReappearString {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String  s = "PWWKEW";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
