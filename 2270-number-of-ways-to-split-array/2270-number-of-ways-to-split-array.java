class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        long total = 0;
        for(int i : nums) {
            total += i;
        }
        long left = 0;
        for(int i = 0; i < nums.length - 1;i++) {
            left += nums[i];
            total -= nums[i];
            if(left >= total)
                count++;
        }
        return count;
    }
}