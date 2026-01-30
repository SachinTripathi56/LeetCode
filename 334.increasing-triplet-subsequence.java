/*
 * @lc app=leetcode id=334 lang=java
 *
 * [334] Increasing Triplet Subsequence
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
        

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for(int i =0; i< nums.length; i++){
            int ele = nums[i];

            if(first>= ele){
                first= ele;
            }
            else if(second>= ele){
                second= ele;
            }
            else{
                third= ele;
                return true;
            }
        }

        return false;
    }
}
// @lc code=end

