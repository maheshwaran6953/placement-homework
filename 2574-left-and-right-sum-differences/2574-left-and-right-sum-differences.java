class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length, total = 0;
        int[] leftSum = new int[n], rightSum = new int[n];
        for(int i = 0; i < n; i++) {
            total += nums[i];
        }
        int subTotal = total;
        for(int i = 0; i < n; i++){
            rightSum[i] = total - nums[i];
            leftSum[n - 1 - i] = subTotal - nums[n - i - 1];
            total -= nums[i];
            subTotal -= nums[n - 1 - i];
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;
    }
}