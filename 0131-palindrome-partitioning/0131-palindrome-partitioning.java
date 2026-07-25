class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtracking(s, 0, new ArrayList<>(), res); 
        return res;
    }

    public void backtracking(String s, int ind, List<String> currentList, List<List<String>> res) {
        if (ind == s.length()) {
            res.add(new ArrayList<>(currentList));
            return;
        }
        
        for (int i = ind; i < s.length(); i++) {
            String substring = s.substring(ind, i + 1);
            
            if (isPalindrome(substring)) {
                currentList.add(substring);              
                backtracking(s, i + 1, currentList, res);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}