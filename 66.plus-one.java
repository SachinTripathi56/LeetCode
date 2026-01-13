/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;

        for(int i =l-1; i>=0;i--){
             
            digits[i]++;
            if(digits[i]<10) return digits;
             digits[i]=0;
        }
        digits = new int[l+1];
        digits[0]= 1;

        return digits;

        
        
        
    }
}
// @lc code=end

