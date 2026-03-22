class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++){
            int check = nums1[i];
            for(int j = 0; j < nums2.length; j++){
                if(check == nums2[j]) {
                    boolean found = false;
                    for(int k = j; k < nums2.length; k++){
                        if(nums2[k] > check){
                            nums1[i] = nums2[k];
                            found = true;
                            break;
                        }
                    }
                    if(!found) {
                        nums1[i] = -1;
                        break;
                    }
                }
            }
        }
        return nums1;
    }
}