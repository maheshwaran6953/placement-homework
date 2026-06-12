class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        if(nums.length < k) return -1;
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static int atMost(int[] nums, int k){
        int left = 0, count = 0, odd = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 == 1){
                odd++;
            }
            while(odd > k){
                if(nums[left] % 2 == 1) odd--;
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}