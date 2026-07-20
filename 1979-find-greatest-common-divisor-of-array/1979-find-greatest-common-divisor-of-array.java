class Solution {
    public int findGCD(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int maxNum = 0;
        for(int i = 1; i <= max; i++){
            if(max % i == 0 && min % i == 0){
                maxNum = Math.max(maxNum, i);
            }
        }
        return maxNum;
    }
}