class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int res[] = new int[nums1.length];
       Stack<Integer> st = new Stack<>();
       Map<Integer, Integer> m = new HashMap<>();
       for(int i : nums2){
        while(!st.isEmpty() && st.peek() < i){
            m.put(st.pop(), i);
        }
        st.push(i);
       }
       for(int i = 0; i < res.length; i++){
        res[i] = m.getOrDefault(nums1[i], -1);
       }
       return res;
    }
}