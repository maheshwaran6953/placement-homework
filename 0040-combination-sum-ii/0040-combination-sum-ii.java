class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        Arrays.sort(c);
        recursion(c, t, 0, l1, res);
        return res;
    }

    public static void recursion(int[] c, int t, int ind, List<Integer> l1, List<List<Integer>> res){

        if(t == 0){
            res.add(new ArrayList<>(l1));
            return;
        }

        for(int i = ind; i < c.length; i++){
            if(i > ind && c[i] == c[i - 1]) continue;

            if(c[i] > t) break;

            l1.add(c[i]);
            recursion(c, t - c[i], i + 1, l1, res);
            l1.remove(l1.size() - 1);
        }
    }

    public static int sum(List<Integer> l1){
        int sum = 0;
        for(int i : l1)
            sum += i;
        return sum;
    }
}