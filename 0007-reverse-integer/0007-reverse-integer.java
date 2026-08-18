class Solution {
    public int reverse(int x) {
       int num = 0;
        long reverse = 0;
        while (x != 0) {
            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10) return 0;
            reverse *= 10;
            num = x % 10;
            reverse += num;
            x /= 10;
        }
        System.out.println(reverse);
        return (int) reverse;
    }
}