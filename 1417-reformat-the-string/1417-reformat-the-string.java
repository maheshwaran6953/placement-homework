class Solution {
    public String reformat(String s) {
        if(s.length() < 2) return s;

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)) sb1.append(c);
            else sb2.append(c);
        }

        if(sb1.length() == 0 || sb2.length() == 0 || Math.abs(sb1.length() - sb2.length()) > 1) return "";

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < sb1.length() || i < sb2.length(); i++){
            if(sb1.length() < sb2.length()){
                if(sb2.length() > i)
                    res.append(sb2.charAt(i));
                if(sb1.length() > i)
                    res.append(sb1.charAt(i));
            } else {
                if(sb1.length() > i)
                    res.append(sb1.charAt(i));
                if(sb2.length() > i)
                    res.append(sb2.charAt(i));
            }
        }

        return res.toString();
    }
}