class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int end = Integer.MIN_VALUE;
        for(int p : piles){
            end = Math.max(p,end);
        }
        int ans = -1;
        while(s<=end){
            int mid = s +(end -s)/2;
            if(isEatingPossible(piles,mid,h)){
                ans = mid;
                end = mid -1;
            }else{
                s = mid +1;
            }
        }
        return ans;
    }
    private boolean isEatingPossible(int[] piles, int eatingSpeed, int h){
        int hCount =0;
        for(int p: piles){
            hCount += (p/eatingSpeed);
            if(p%eatingSpeed!=0){
                hCount++;
            }
            if(hCount>h){
                return false;
            }
        }
        return true;
    }
}