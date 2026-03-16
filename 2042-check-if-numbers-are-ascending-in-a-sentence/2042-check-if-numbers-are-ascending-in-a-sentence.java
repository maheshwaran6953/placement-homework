class Solution {
    public boolean areNumbersAscending(String s) {
        int i = 0;
        for(String str : s.split(" ")){
            if(str.matches("\\d+")){
                if(Integer.parseInt(str) > i) {
                    i = Integer.parseInt(str);
                } else {
                    return false;
                }
            } 
        }
        return true;
    }
}