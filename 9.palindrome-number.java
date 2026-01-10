/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
         int a,b,c=0,l=x;

         while(x>0){

            a=x%10;
           
            c= c*10+a;
            x=x/10;
         }
         

     return c==l;
        
    }
}
// @lc code=end

