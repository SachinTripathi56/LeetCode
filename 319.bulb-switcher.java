/*
 * @lc app=leetcode id=319 lang=java
 *
 * [319] Bulb Switcher
 */

// @lc code=start
class Solution {
    public int bulbSwitch(int n) {
        int count = 0,i = 1;

        while(i*i<=n){
            count++;
            i++;

        }

        return count;
        
    }
}
// @lc code=end

