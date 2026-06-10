class Solution {
    public boolean canConstruct(String r, String m) {
        int freq1[] = new int[26];
        for(int i = 0; i < m.length(); i++){
            freq1[m.charAt(i) - 'a']++;
        }
        for(char c : r.toCharArray()){
            if(freq1[c - 'a'] == 0){
                return false;
            }
            freq1[c - 'a']--;
        }
        return true;
    }
}