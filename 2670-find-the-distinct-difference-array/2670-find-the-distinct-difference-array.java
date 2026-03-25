class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int suff[] = new int[n + 1];
        Set<Integer> h = new HashSet<>();
        for(int i = n - 1; i >= 0; i--) {
            h.add(nums[i]);
            suff[i] = h.size();
        }
        int diff[] = new int[n];
        h.clear();
        for(int i = 0; i < n; i++) {
            h.add(nums[i]);
            int preff = h.size();
            int suffi = (i + 1 < n) ? suff[i + 1] : 0;
            diff[i] = preff - suffi;
        }
        return diff;
    }
}