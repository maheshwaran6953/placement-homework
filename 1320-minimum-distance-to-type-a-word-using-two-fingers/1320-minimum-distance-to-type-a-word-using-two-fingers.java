import java.util.*;

class Solution {
    public int minimumDistance(String word) {
        Map<String, Integer> memo = new HashMap<>();
        return dfs(word, 0, -1, -1, memo);
    }

    private int dfs(String word, int index, int f1, int f2, Map<String, Integer> memo) {
        if (index == word.length()) return 0;

        String key = index + "," + f1 + "," + f2;
        if (memo.containsKey(key)) return memo.get(key);

        int next = word.charAt(index) - 'A';

        // Option 1: move finger1
        int cost1 = (f1 == -1 ? 0 : dist(f1, next)) + dfs(word, index + 1, next, f2, memo);

        // Option 2: move finger2
        int cost2 = (f2 == -1 ? 0 : dist(f2, next)) + dfs(word, index + 1, f1, next, memo);

        int ans = Math.min(cost1, cost2);
        memo.put(key, ans);
        return ans;
    }

    private int dist(int a, int b) {
        int r1 = a / 6, c1 = a % 6;
        int r2 = b / 6, c2 = b % 6;
        return Math.abs(r1 - r2) + Math.abs(c1 - c2);
    }
}
