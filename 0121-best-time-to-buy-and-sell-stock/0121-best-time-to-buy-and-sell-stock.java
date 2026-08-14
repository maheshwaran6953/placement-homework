class Solution {
    public int maxProfit(int[] p) {
        int min = Integer.MAX_VALUE, max = 0;
        for(int i : p){
            if(i < min) min = i;

            else if(i - min >= max) max = i - min;
        }
        return max;
    }
}