class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtracking("", res, 0, 0, n);
        return res;
    }

    void backtracking(String s, List<String> res, int open, int close, int max){
        if(s.length() == max * 2){
            res.add(s);
            return;
        }

        if(open < max) backtracking(s + '(', res, open + 1, close, max);
        if(close < open) backtracking(s + ')', res, open, close + 1, max);
    }
}