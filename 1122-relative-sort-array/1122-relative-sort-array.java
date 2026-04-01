class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n : arr1) 
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        List<Integer> l1 = new ArrayList<>();
        for(int n : arr2) {
            if(freq.containsKey(n)) {
                int count = freq.get(n);
                for(int i = 0; i < count; i++) {
                    l1.add(n);
                }
                freq.remove(n);
            }
        }
        List<Integer> l2 = new ArrayList<>();
        for(int n : freq.keySet()) {
            int count = freq.get(n);
            for(int i = 0; i < count; i++) {
                l2.add(n);
            }
        }
        Collections.sort(l2);
        l1.addAll(l2);
        int[] res = new int[l1.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = l1.get(i);
        }
        return res;
    }
}