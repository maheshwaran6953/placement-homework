class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0, max = 0;
        char freq[] = new char[26];
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            freq[c - 'a']++;

            while(freq[c - 'a'] > 2){
                char ch = s.charAt(l);
                freq[ch - 'a']--;
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}