class Solution {
    public int candy(int[] nums) {
        int n = nums.length, l[] = new int[n], r[] = new int[n];
        l[0] = 1;
        r[n - 1] = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                l[i] = l[i -1] + 1;
            } else{
                l[i] = 1;
            }
        }
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] > nums[i + 1]){
                r[i] = r[i + 1] + 1;
            } else{
                r[i] = 1;
            }
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            max += Math.max(l[i], r[i]);
        }
        for(int i : l){
            System.out.print(i);
        }
        return max;
    }
}