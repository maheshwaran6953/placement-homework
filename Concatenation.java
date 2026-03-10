class Concatenation {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int [] num1=new int[len*2];
        
       for (int i=0; i<nums.length;i++){
        num1[i]=nums[i];
        num1[i+len]=nums[i];
       } 
       return num1;
    }
}
