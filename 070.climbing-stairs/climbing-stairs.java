class Solution {
    public int climbStairs(int n) {
        int a = 0, b = 1, temp = 0;
        while (n-- > 0)
        {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}