class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int sum = 0, m = 0, g = 0, p = 0;
        for(int i : travel)
            sum += i;
        for(String garb : garbage){
            for(char c : garb.toCharArray()){
                if(c == 'G')
                    g++;
                else if(c == 'P')
                    p++;
                else
                    m++;
            }
        }
        int lastM = 0, lastP = 0, lastG = 0;
        for(int i = 0; i < garbage.length; i++){
            if(garbage[i].lastIndexOf('G') != -1)
                lastG = i;
            if(garbage[i].lastIndexOf('P') != -1)    
                lastP = i;
            if(garbage[i].lastIndexOf('M') != -1)
                lastM = i;
        }
        int totalg = 0, totalm = 0, totalp = 0;
        for(int i = 0; i < lastG; i++)
            totalg += travel[i];
        for(int i = 0; i < lastP; i++)
            totalp += travel[i];
        for(int i = 0; i < lastM; i++)
            totalm += travel[i];
        return totalm + m + totalg + g + totalp + p;
    }
}