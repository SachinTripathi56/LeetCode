/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        

        if (n<1){
            return false;
        }

          while (n%2==0){
                n=n/2;
            }
          
            if(n==1){
                return true;
            }
          return false;
        }
    }
// @lc code=end

