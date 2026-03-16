class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            String word = arr[i];
            int ind = word.charAt(word.length() - 1) - '0';
            res[ind - 1] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", res);
    }
}