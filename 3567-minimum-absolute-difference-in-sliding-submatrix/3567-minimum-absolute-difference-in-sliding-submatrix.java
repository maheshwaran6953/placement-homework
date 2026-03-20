class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] arr = new int[m - k + 1][n - k + 1];
        for(int i = 0; i <= m - k; i++) {
            for(int j = 0; j <= n - k; j++) {
                if (k == 1) {
                    arr[i][j] = 0;
                    continue;
                }
                int[] temp = new int[k * k];
                int ind = 0;
                for(int r = 0; r < k; r++) {
                    for(int c = 0; c < k; c++){
                        temp[ind] = grid[i + r][j + c];
                        ind++;  
                    }
                }
                Arrays.sort(temp);
                int min = Integer.MAX_VALUE;
                for(int x = 1; x < temp.length; x++) {
                    if (temp[x] != temp[x - 1]) {
                        min = Math.min(min, temp[x] - temp[x - 1]);
                    }
                }
                if(min == Integer.MAX_VALUE)
                    min = 0;
                arr[i][j] = min;
            }
        }
        return arr;
    }
}