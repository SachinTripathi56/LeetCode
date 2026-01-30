/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {

        long value =0 ; 
        int n,s=1;

        if(x<0){
        x=x*-1;
        s=-1;
        }
        while(x>0){
            n = x%10;
            value = value*10 + n;
            x=x/10;
        }

        if(Integer.MAX_VALUE < value){
            return 0;
        }
        return (int)value*s;
        
    }
}
// @lc code=end

