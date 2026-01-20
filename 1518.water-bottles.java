/*
 * @lc app=leetcode id=1518 lang=java
 *
 * [1518] Water Bottles
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int ans = numBottles;

        while(numBottles>=numExchange){

            int newBottles = numBottles / numExchange;
            int remaining = numBottles % numExchange;

            ans = ans + newBottles;
            numBottles = newBottles + remaining;
        }
        return ans;
        
    }
}
// @lc code=end

