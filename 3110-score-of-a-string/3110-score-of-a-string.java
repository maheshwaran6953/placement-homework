class Solution {
    public int scoreOfString(String s) {
        char[] arr = new char[26];
        int total = 0;
        for (int i = 1; i < s.length(); i++) {
            total += Math.abs((int)s.charAt(i - 1) - (int)s.charAt(i));
        }
        return total;
    }
}