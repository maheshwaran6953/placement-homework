class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        if(nums == null || nums.length == 0 || k < 0 || p == 0) 
            return 0;
        int n = nums.length;
        Set<String> h = new HashSet<>();
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            int divisibleCount = 0;
            for(int j = i; j < n; j++){
                sb.append(nums[j]).append(",");
                if(nums[j] % p == 0) divisibleCount++;
                if(divisibleCount > k){
                    break;
                }
                h.add(sb.toString());
            }
        }
        return h.size();
    }
}