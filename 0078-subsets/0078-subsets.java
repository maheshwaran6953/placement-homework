class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l1 = new ArrayList<>();
        l1.add(new ArrayList<>());
        for(int i : nums){
            int size = l1.size();
            for(int j = 0; j < size; j++){
                List<Integer> l2 = new ArrayList<>(l1.get(j));
                l2.add(i);
                l1.add(l2);
            }
        }
        return l1;
    }
}