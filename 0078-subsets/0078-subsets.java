class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> l1 = new ArrayList<>();
        // l1.add(new ArrayList<>());
        // for(int i : nums){
        //     int size = l1.size();
        //     for(int j = 0; j < size; j++){
        //         List<Integer> l2 = new ArrayList<>(l1.get(j));
        //         l2.add(i);
        //         l1.add(l2);
        //     }
        // }
        // return l1;
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(nums, 0, l1, temp);
        return l1;
    }
    
    public static void backtrack(int nums[], int start, List<List<Integer>> l1, List<Integer> temp){
        l1.add(new ArrayList<>(temp));
        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            backtrack(nums, i + 1, l1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}