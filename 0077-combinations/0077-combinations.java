class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        backtracking(n, k, res, l1, 1);

        return res;
    }

    public static void backtracking(int n, int k, List<List<Integer>> res, List<Integer> l1, int ind){

        if(l1.size() == k){
            res.add(new ArrayList<>(l1));
            return;
        }

        for(int i = ind; i <= n; i++){
            l1.add(i);
            backtracking(n, k, res, l1, i + 1);
            l1.remove(l1.size() - 1);
        }
    }
}