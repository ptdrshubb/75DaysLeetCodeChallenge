class Solution {
    public int maxArea(int[] height) {
       // int min = 0;
        int left = 0;
        int right = height.length-1;
        //int width = 0;
        int  area =0;
        while(left<=right){
            int min = Math.min(height[left],height[right]);
            int width = right - left;
            area = Math.max(area , min*width);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }   
        return area;
    }
}