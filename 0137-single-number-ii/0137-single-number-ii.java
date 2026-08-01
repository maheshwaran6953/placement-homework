class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 32; i >= 0; i--){
            int sum = 0;
            for(int n : nums){
                sum += ((n >> i) & 1);
            }
            if(sum % 3 != 0) res = res | (1 << i);
        }
        return res;
    }
}