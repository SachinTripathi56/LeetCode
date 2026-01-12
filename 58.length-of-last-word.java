/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String ss) {


   String s = ss.trim();
          int l = s.length();
       
        for(int i =l-1; i>=0;i--){
            if(s.charAt(i)==' '){
                return l-1-i;
            }
        else if(i== 0)
            return l;
        }
     return -1;
    }
}
// @lc code=end

