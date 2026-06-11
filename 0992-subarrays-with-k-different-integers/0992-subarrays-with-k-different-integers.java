class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + k; j <= nums.length; j++){
        //         int sub[] = Arrays.copyOfRange(nums, i , j);
        //         if(fun(sub, k)){
        //             count++;
        //         }
        //     }
        // }
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    // public static boolean fun(int[] sub, int k){
    //     Set<Integer> h = new HashSet<>();
    //     for(int i : sub){
    //         h.add(i);
    //     }
    //     return h.size() == k;
    // }

    public static int atMost(int[] nums, int k){
        int left = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(map.size() > k){
                map.put(nums[left], map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}