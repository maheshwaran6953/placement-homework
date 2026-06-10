class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, max = 0;
        Set<Character> h = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            while(h.contains(s.charAt(i))){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(s.charAt(i));
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}