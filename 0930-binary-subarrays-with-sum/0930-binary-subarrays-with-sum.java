class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        // for(int i = 0; i < n; i++){
        //     int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum += nums[j];
        //         if(sum == goal){
        //             count++;
        //         }
        //     }
        // }
        return fun(nums, goal, n) - fun(nums, goal - 1, n);
    }
    public static int fun(int[] nums, int goal, int n){
        if(goal < 0) return 0;
        int left = 0, count = 0, sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            count += i - left + 1;
        }
        return count;
    }
}