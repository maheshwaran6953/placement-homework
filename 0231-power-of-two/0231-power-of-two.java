class Solution {
    public boolean isPowerOfTwo(int n) {
        return recursion(n);
    }

    public static boolean recursion(int n){
        if( n == 1) return true;
        return n > 0 && n % 2 == 0 && recursion(n / 2);
    }
}