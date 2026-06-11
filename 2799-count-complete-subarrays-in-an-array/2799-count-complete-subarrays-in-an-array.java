class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int k = map.size();
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    public static int atMost(int[] nums, int k){
        int left = 0, count = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            m.put(nums[right], m.getOrDefault(nums[right], 0) + 1);
            while(m.size() > k){
                m.put(nums[left], m.get(nums[left]) - 1);
                if(m.get(nums[left]) == 0){
                    m.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}