class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                char prev = sb.charAt(sb.length() - 1);
                int num = s.charAt(i) - '0';
                sb.append((char)(prev + num));
            } else 
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}