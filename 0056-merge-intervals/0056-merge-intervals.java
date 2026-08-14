class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> l1 = new ArrayList<>();
        int curr[] = arr[0];
        l1.add(curr);

        for(int[] nums : arr){
            int cend = curr[1];
            int nstart = nums[0];
            int nend = nums[1];

            if(cend >= nstart){
                curr[1] = Math.max(cend, nend);
            } else {
                curr = nums;
                l1.add(curr);
            }
        }
        return l1.toArray(new int[l1.size()][]);
    }
}