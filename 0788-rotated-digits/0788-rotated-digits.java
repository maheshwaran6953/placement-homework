class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            boolean found1 = false, found2 = false;
            int temp = i;
            while(temp > 0){
                int a = temp % 10;
                if(a == 3 || a == 4 || a==7) {
                    found1 = true;
                    break;
                }
                if(a == 2 || a == 5 || a == 6 || a == 9){
                    found2 = true;
                }   
                temp /= 10;
            }
            if(!found1 && found2)
                count++;
        }
        return count;
    }
}