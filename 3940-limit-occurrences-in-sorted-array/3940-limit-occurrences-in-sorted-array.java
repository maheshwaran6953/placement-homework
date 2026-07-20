class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> l1 = new ArrayList<>();
        int count = 1;
        l1.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == l1.get(l1.size() - 1)) {
                count++;
                if (count <= k) {
                    l1.add(nums[i]);
                }
            } else {
                count = 1;
                l1.add(nums[i]);
            }
        }
        System.out.println(l1);
        int arr[] = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            arr[i] = l1.get(i);
        }
        return arr;
    }
}