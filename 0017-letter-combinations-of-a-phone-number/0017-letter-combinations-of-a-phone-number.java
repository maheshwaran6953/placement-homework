class Solution {

    private static String[] words = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) return res;
        backtracking(digits, new StringBuilder(), 0, res);
        return res;
    }

    public static void backtracking(String digits, StringBuilder sb, int ind, List<String> res){
        if(ind == digits.length()){
            res.add(sb.toString());
            return;
        }

        char charDigit = digits.charAt(ind);

        int intDigit = (int)(charDigit - '0');

        String keys = words[intDigit];

        for(int i = 0; i < keys.length(); i++){

            sb.append(keys.charAt(i));

            backtracking(digits, sb, ind + 1, res);

            sb.deleteCharAt(sb.length() - 1);
        }
    }
}