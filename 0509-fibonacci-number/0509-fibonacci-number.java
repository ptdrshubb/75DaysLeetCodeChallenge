class Solution {
    /* 
    //this is tabulation dp method (Bottom - Up dp)
    // time complexity is O(N)
    // space complexity is O(N)

    public int fib(int n) {
        // base case
       if(n<=1){
        return n;
       }
       int dp[] = new int[n+1];
       dp[0] = 0;
       dp[1] = 1;
       for(int i = 2; i<=n;i++){
        dp[i] = dp[i-1]+ dp[i-2];
       }
       return dp[n];
    }
    */

    /*

    //space optimize method 
    //time complexity is O(N)

    public int fib(int n) {
        // base case
       if(n<=1){
        return n;
       }
       int prev2 = 0, prev1 = 1, ans = 0;
       for(int i = 2; i<=n;i++){
        ans = prev1 + prev2;
        prev2 = prev1;
        prev1 = ans;
       }
       return ans;
    }

    */
    // Memoization Method (Top - Down dp)
    // time complexity is O(N)

    public int fib(int n) {
       int dp[] = new int[n+1]; // create an array
       Arrays.fill(dp,-1);  // fill array all element -1
       return recur(n, dp); // recursion call 
    }
    public int recur(int n, int[] dp) {
        // store data
       if(n <=1){
        dp[n] = n;
        return dp[n];
       }
        // use data already store
       if(dp[n] != -1){
        return dp[n];
       }
        // store data
       dp[n] = fib(n-1)+fib(n-2);
       return dp[n]; // return result 
    }

    /*
    // Recursion method 
    // time complexity is O(2^N)
    public int fib(int n) {
        // base case
       if(n<=1){
        return n;
       }
       return fib(n-1) + fib(n-2);
    }
*/

}