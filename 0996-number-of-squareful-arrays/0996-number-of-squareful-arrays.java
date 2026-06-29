class Solution {

    static int count = 0;
    public int numSquarefulPerms(int[] nums) {
        count = 0;
        permute(nums, 0);
        return count;
    }

    public static boolean checking(List<Integer> l1) {
        for (int i = 0; i < l1.size() - 1; i++) {
            int sum = l1.get(i) + l1.get(i + 1);
            if (!isSquare(sum))
                return false;
        }
        return true;
    }

    public static boolean isSquare(int sum) {
        int root = (int) Math.sqrt(sum);
        return root * root == sum;
    }

    public static void permute(int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> l2 = new ArrayList<>();
            for (int i : nums)
                l2.add(i);
            if(checking(l2)) count++;
            return;
        }
        Set<Integer> h = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (h.contains(nums[i]))
                continue;
            h.add(nums[i]);
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            if(index > 0 && !isSquare(nums[index] + nums[index - 1])){
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                continue;
            }

            permute(nums, index + 1);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}