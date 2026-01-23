/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int sum =0, n=nums.length;
        for (int i : nums){
            sum += i;
        }

        n= (n*(n+1))/2;

        return n-sum;
        
    }
}
// @lc code=end

