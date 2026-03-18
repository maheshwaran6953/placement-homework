class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean isVowel = false, isConst = false;
        for(char c : word.toCharArray()) {
            if(!Character.isLetterOrDigit(c)) {
                return false;
            }
            if(Character.isLetter(c)) {
                char ch = Character.toLowerCase(c);
                if("aeiou".indexOf(ch) != -1){
                    isVowel = true;
                } else {
                    isConst = true;
                }
            }
        }
        return isVowel && isConst;
    }
}