class Solution {
    public void reverseString(char[] s) {
        rev(s, 0);
    }
    public static void rev(char[] s, int ind){
        if(ind >= s.length / 2) return;
        // if(ind / 2 <= s.length) return;

        char temp = s[ind];
        s[ind] = s[s.length - ind - 1];
        s[s.length - ind - 1] = temp;
        rev(s, ind + 1);
    }
}