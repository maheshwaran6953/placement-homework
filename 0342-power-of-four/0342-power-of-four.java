class Solution {
    public boolean isPowerOfFour(int n) {
        return recursion(n);
    }
    
    public static boolean recursion(int n) {
        if(n == 1) return true;
        return n > 0 && n % 4 == 0 && recursion(n / 4);
    }
}