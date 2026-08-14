class Solution {
    public boolean findSubarrays(int[] nums) {
        int l = 0, r = 1;
        Set<Integer> h = new HashSet<>();
        for(int i = 0; i < nums.length - 1; i++){
            if(h.contains(nums[l] + nums[r])){
                return true;
            } else {
                h.add(nums[l] + nums[r]);
            }
            l++; r++;
        }
        return false;
    }
}