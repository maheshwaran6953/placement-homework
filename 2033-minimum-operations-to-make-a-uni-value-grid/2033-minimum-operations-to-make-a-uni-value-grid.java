class Solution {
    public int minOperations(int[][] grid, int x) {
        int arr[] = new int[grid.length * grid[0].length], ind = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                arr[ind++] = grid[i][j];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if((arr[i] - arr[0]) % x != 0)
                return -1;
        }
        Arrays.sort(arr);
        int med = arr[arr.length / 2], count = 0;
        for(int i : arr) {
            count += Math.abs(i - med) / x;
        }
        return count;
    }
}