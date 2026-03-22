class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray())
            freq[ch - 'a']++;
        int oddMax = 0, evenMax = Integer.MAX_VALUE;
        for(int f : freq) {
            if (f > 0) {
                if (f % 2 == 0) {
                    evenMax = Math.min(evenMax, f);
                } else {
                    oddMax = Math.max(oddMax, f);
                }
            }
        }
        if(evenMax == Integer.MAX_VALUE)
            evenMax = 0;
        return oddMax - evenMax;
    }
}