/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
      
        char temp ;
        int mid ,ss=0;
        if(s.length%2==0){
            mid = s.length/2;
        }
        else{
            mid = (s.length/2)+1;
        }


        for (int i =s.length-1; i>=mid; i--){
            
            temp = s[ss];
            s[ss]= s[i];
            s[i]= temp;
            ss++;

        }

    }
}
// @lc code=end

