class Solution {
    public int minimumAverageDifference(int[] nums) {
        long total = 0;
        int n = nums.length;
        for(int i : nums) {
            total += i;
        }
        long left = 0;
        int minIndex = -1;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            left += nums[i];
            long right = total - left;
            long leftAvg = left / (i + 1);
            long rightAvg = (i == n - 1) ? 0 : right / (n - i - 1);
            int diff = (int)Math.abs(leftAvg - rightAvg);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }
}