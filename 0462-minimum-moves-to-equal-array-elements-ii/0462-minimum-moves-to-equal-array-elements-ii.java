class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
       int med = nums[nums.length / 2], count = 0;
       for(int i : nums){
            count += Math.abs(i - med);
       }
       return count;
    }
}