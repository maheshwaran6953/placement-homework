class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minSteps = Integer.MAX_VALUE;
        
        // Check all positions where target occurs
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                // Clockwise distance
                int clockwise = (i - startIndex + n) % n;
                // Counterclockwise distance
                int counterclockwise = (startIndex - i + n) % n;
                // Update minimum
                minSteps = Math.min(minSteps, Math.min(clockwise, counterclockwise));
            }
        }
        return minSteps == Integer.MAX_VALUE ? -1 : minSteps;
    }
}
