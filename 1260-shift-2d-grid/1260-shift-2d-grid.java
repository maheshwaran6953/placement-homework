class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length, ind = 0;
        List<List<Integer>> res = new ArrayList<>();
        int arr[] = new int[n * m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[ind++] = grid[i][j];
            }
        }
        for(int i = 0; i < k; i++){
            for(int j = n*m - 1; j > 0; j--){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        List<Integer> l1 = new ArrayList<>();
        for(int i : arr){
            l1.add(i);
            if(l1.size() == m){
                res.add(new ArrayList<>(l1));
                l1.clear();
            }
        }
        return res;
    }
}