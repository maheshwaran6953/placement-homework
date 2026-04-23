class Solution {
    public long[] distance(int[] nums) {
        long arr[] = new long[nums.length];
        Map<Integer, List<Integer>> m = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            m.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for(List<Integer> l : m.values()){
            int size = l.size();
            long[] prefix = new long[size + 1];
            for (int i = 0; i < size; i++) {
                prefix[i+1] = prefix[i] + l.get(i);
            }
            for (int i = 0; i < size; i++) {
                int idx = l.get(i);
                long left = (long)idx * i - prefix[i];
                long right = (prefix[size] - prefix[i+1]) - (long)idx * (size - i - 1);
                arr[idx] = left + right;
            }
        }
        return arr;
    }
}