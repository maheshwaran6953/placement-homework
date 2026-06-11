class Solution {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) == 2){
                return c;
            }
        }
        return ' ';
    }
}