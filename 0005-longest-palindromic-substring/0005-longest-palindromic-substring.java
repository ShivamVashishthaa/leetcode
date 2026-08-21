class Solution {
    public String longestPalindrome(String s) {
       if (s.length() <= 1) return s;
        String maxSub = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > maxSub.length())
                maxSub = odd;
            if (even.length() > maxSub.length())
                maxSub = even;
        }
       return maxSub;
    }

    private static String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
    
}