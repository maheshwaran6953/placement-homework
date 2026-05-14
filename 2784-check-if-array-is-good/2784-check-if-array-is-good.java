class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1, max = 0;
        for(int i : nums)
            if(i > max)
                max = i;
        if(max != n) return false;
        int count[]  = new int[n + 1];
        for(int i : nums)
            count[i]++;
        for (int i = 1; i < n; i++)
            if(count[i] != 1)
                return false;
        return count[n] == 2;
    }
}