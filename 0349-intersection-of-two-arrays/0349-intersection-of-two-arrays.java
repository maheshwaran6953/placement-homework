class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr1 = new int[Math.min(nums1.length , nums2.length)];
        int index = 0;
        for(int i = 0 ; i < nums1.length ; i++)
        {
            for(int j = 0 ; j < nums2.length ; j++)
            {
                boolean flag = false;
                if(nums1[i] == nums2[j]){
                    for(int k = 0 ; k < index; k++){
                        if(arr1[k] == nums1[i]){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        arr1[index++]=nums1[i];
                    }
                }
            }
        }
        int[] result = new int[index];
        for(int i=0;i<index;i++){
            result[i]=arr1[i];
        }
        return result;
    }
}