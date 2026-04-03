class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> m = new HashMap();
        for(int i : arr) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        int max = -1;
        for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if(num == count)
                max = Math.max(max, num);
        }
        return max;
    }
}