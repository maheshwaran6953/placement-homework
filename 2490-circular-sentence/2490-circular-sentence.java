class Solution {
    public boolean isCircularSentence(String sentence) {
        String arr[] = sentence.split(" ");
        for(int i = 1; i < arr.length; i++){
            String word = arr[i], prev_word = arr[i - 1];
            if((prev_word.charAt(prev_word.length() - 1)) != word.charAt(0))
                return false;
        }
        String word0 = arr[0], wordl = arr[arr.length - 1];
        if(word0.charAt(0) != wordl.charAt(wordl.length() - 1))
            return false;
        return true;
    }
}