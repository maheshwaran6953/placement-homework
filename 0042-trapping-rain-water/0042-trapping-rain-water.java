class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n], right = new int[n];
        left[0] = height[0];
        right[height.length - 1] = height[height.length - 1];
        for(int i  = 1; i < height.length; i++){
            left[i] = Math.max(left[i - 1], height[i]);
        }
        for(int i  = height.length - 2; i >= 0; i--){
            right[i] = Math.max(right[i + 1], height[i]);
        }
        int w = 0;
        for(int i = 0; i < height.length; i++){
            int l = Math.min(left[i], right[i]);
            w += l - height[i];
        }
        return w;
    }
}