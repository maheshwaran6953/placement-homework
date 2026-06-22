class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // Arrays.sort(costs);
        // if(costs[0] > coins) return 0;
        // int count = 0;
        // for(int i : costs){
        //     if(coins < i){
        //         break;
        //     }
        //     coins -= i;
        //     count++;
        // }
        // return count;

        int max = 0, count = 0;
        for(int i : costs) if(i > max) max = i;
        int freq[] = new int[max + 1];
        for(int i : costs) freq[i]++;
        for(int i = 1; i <= max; i++){
            while(coins >= i && freq[i] > 0){
                coins -= i;
                freq[i]--;
                count++;
            }
        }
        return count;
    }
}