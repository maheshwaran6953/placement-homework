class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int res[] = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for(int i = temp.length - 1; i >= 0; i--){
            while(!st.isEmpty() && temp[i] >= temp[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                res[i] = st.peek() - i;
            }
            st.push(i);
        }
        return res;
    }
}