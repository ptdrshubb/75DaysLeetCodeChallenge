class Solution {
    public int searchInsert(int[] nums, int target) {
        int answer = -1;
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s + (e - s)/2;
            if(nums[m] == target){
                answer = m;
                break;
            }else if(target<nums[m]){
                e = m -1;
                answer = m;
            }else{
               if(nums[s]==target ||nums[e]==target)
                answer = m;
                s = m +1;
                
                answer = m+1;
            }
        }
        return answer;
    }
}