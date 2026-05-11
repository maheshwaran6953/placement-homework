class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        for(int i : nums){
            String s = String.valueOf(i);
            for(char c : s.toCharArray())
                l1.add(c - '0');
        }
        int res[] = new int[l1.size()];
        for(int i = 0; i < l1.size(); i++)
            res[i] = l1.get(i);
        return res;
    }
}