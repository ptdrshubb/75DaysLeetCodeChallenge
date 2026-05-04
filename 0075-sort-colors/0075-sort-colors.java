class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        System.out.print("[");
        for(int idx =0;idx<nums.length;idx++){
            System.out.print(nums[idx]+" ");
        }
        System.out.print("]");
    }
}