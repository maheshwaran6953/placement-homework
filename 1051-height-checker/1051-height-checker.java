class Solution {
    public int heightChecker(int[] h) {
        int[] exp = Arrays.copyOf(h, h.length);
        int count = 0;
        Arrays.sort(exp);
        for(int i = 0; i < h.length; i++) {
            if(h[i] != exp[i]) 
                count++;
        }
        return count;
    }
}