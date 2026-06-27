class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
        return binary(nums, target, 0, nums.length - 1);
    }

    public static int binary(int[] nums, int k, int s, int e) {
        if(s > e) return -1;
        int mid = (s + (e - s) / 2);
        if(nums[mid] == k) 
            return mid;
        else if(nums[mid] > k) 
            return binary(nums, k, s, mid - 1);
        else
            return binary(nums, k, mid + 1, e);
    }
}