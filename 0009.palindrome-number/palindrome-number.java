class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int re = 0;
        while (x > re)
        {
            re = re * 10 + x % 10;
            x /= 10;
        }
        if (re > x) re /= 10;
        return x == re;
    }
}