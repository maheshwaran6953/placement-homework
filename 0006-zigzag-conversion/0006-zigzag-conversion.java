class Solution {
    public String convert(String s, int n) {
        if(s.length() <= n || n == 1) return s;
        StringBuilder row[] = new StringBuilder[n];
        for(int i = 0; i < n; i++){
            row[i] = new StringBuilder();
        }
        int curr = 0;
        boolean down = false;
        for(char c : s.toCharArray()){
            row[curr].append(c);
            if(curr == 0 || curr == n - 1){
                down = !down;
            }
            curr += down?1:-1;
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder sbr : row){
            sb.append(sbr);
        }
        return sb.toString();
    }
}