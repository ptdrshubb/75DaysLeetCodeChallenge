class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int s = 0, e = nums.length-1;
        while(s<=e){
            int mid = s + (e - s)/2;
            if(nums[s]<=nums[mid]){
                int n = nums[s];
                min = Math.min(min,n);
                s = mid+1;
            }
            else{
                    min = Math.min(nums[mid],min);
                    e = mid -1; 
            } 
        }
        return min;
    }
}