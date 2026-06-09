class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        boolean inc = false, dec = false;
        int peak = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i - 1]){
                inc = true;
            } else if(arr[i] == arr[i - 1]) return false;
            else {
                peak = i - 1;
                break;
            }
        }
        if(peak == arr.length - 1 || peak <= 0) return false;
        for(int i = peak + 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                dec = true;
            } else if(arr[i] == arr[i - 1]) return false;
            else{
                return false;
            }
        }
        return inc && dec;
    }
}