class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        // char c1[] = new char[126];
        // for(char c : s1.toCharArray()){
        //     c1[c - 'a']++;
        // }
        // for(int i = 0; i <= m - n; i++){
        //     String temp = s2.substring(i, i + n);
        //     char c2[] = new char[126];
        //     for(char c : temp.toCharArray()){
        //         c2[c - 'a']++;
        //     }
        //     if(Arrays.equals(c1, c2)){
        //         return true;
        //     }
        // }
        // return false;

        if(n > m) return false;

        int c1[] = new int[26];
        int c2[] = new int[26];
        for(int i = 0; i < n; i++){
            c1[s1.charAt(i) - 'a']++;
            c2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(c1, c2)) return true;
        for(int i = n; i < m; i++){
            c2[s2.charAt(i) - 'a']++;
            c2[s2.charAt(i - n) - 'a']--;
            if(Arrays.equals(c1, c2)) return true;
        }
        return false;
    }
}