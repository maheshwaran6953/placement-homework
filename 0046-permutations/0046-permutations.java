class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> l = new ArrayList<>();
        backtrack(nums, 0, l);
        return l;
    }

    static void backtrack(int[] nums, int idx, List<List<Integer>> l){
        if(idx == nums.length){
            ArrayList<Integer> l2 = new ArrayList<>();
            for(int i : nums)
                l2.add(i);
            l.add(l2);
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(nums, idx, i);
            backtrack(nums, idx + 1, l);
            swap(nums, idx, i);
        }
    }

    static void swap(int[] nums, int idx, int i){
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;
    }
}