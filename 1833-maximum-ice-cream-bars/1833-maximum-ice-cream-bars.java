class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        if(costs[0] > coins) return 0;
        int count = 0;
        for(int i : costs){
            if(coins < i){
                break;
            }
            coins -= i;
            count++;
        }
        return count;
    }
}