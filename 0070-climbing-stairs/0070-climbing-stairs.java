class Solution {
    /*
     //Tabulation dp (Bottom - top Dp)
    public int climbStairs(int n) {
      
       if(n<=2){
        return n;
       }
       int dp[] = new int[n+1];
       dp[1] = 1;
       dp[2] = 2;
       for(int i =3;i<=n;i++){
        dp[i] = dp[i-1]+ dp[i-2];
       } 
       return dp[n];
    
    */

    /*
    // Memoization Dp (top - Down dp)
    // TLE because Complexity is very high O(N). and Space complexity is Also high and Same
    public int climbStairs(int n) {
        int  dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return recur(n,dp);
    }
    public int recur(int n , int[] dp){
        if(n<=2){
            dp[n] = n;
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= climbStairs(n-1) + climbStairs(n-2);
        return dp[n];
    }
    */

    
    // this is Space Optimize (Bottom Up Obtimize) Method
    public int climbStairs(int n) {
       if(n<=2){
        return n;
       }
       int prev2 = 1, prev1 = 2, res = 0;
       for(int i =3;i<=n;i++){
        res = prev1+ prev2;
        prev2 = prev1;
        prev1 = res;
       } 
       return res;
    }
    

    // Recursion Method
    // TLE Because Complexity is high O(2^n).
   /*
    public int climbStairs(int n) {
       if(n<=2){
        return n;
       }
      return climbStairs(n-1)+climbStairs(n-2);
    }
    */
}