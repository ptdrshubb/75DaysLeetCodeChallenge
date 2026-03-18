class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int totalProduct = 1;
        int Count = 0;

        for (int num : nums) {
            if (num == 0) Count++;
            else totalProduct *= num;
        }

        for (int i = 0; i < n; i++) {
            if (Count > 1) {
                result[i] = 0;
            } else if (Count == 1) {
                result[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                result[i] = totalProduct / nums[i];
            }
        }

        return result;
    }
}