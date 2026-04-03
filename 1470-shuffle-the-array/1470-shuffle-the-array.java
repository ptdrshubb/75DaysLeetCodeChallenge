class Solution {
    public int[] shuffle(int[] nums, int n) {
      int arr[] = new int[nums.length];
      int k =0,j=n;
      for(int i =0;i<n;i++){
        arr[k] = nums[i];
        k++;
        arr[k] = nums[j];
        k++;
        j++;
      }
    return arr;
    }
}