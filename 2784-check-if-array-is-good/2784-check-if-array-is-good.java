class Solution {
    public boolean isGood(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        for(int i : nums){
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        for(int i = 1; i < nums.length - 1; i++){
            if(m.getOrDefault(i, 0) != 1)
                return false;
        }
        return m.getOrDefault(nums.length - 1, 0) == 2;
    }
}