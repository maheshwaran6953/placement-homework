class Solution {
    public int totalFruit(int[] nums) {
        return atMost(nums, 2);
    }

    public static int atMost(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length, left = 0, count = 0;
        for(int right = 0; right < n; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(map.size() > k){
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0) map.remove(nums[left]);
                left++;
            }
            count = Math.max(count, right - left + 1);
        }
        return count;
    }
}