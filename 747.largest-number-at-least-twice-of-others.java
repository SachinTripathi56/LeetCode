/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {

        int ll=-1 , sl=-1 , lid=0;

        for (int i =0; i<nums.length; i++){

            if(ll< nums[i]){
                      sl = ll;
                ll = nums[i];
                lid = i;
            }

            else if(sl<nums[i]){
                sl = nums[i];
            }
        }

        if(2*sl<=nums[lid]){
            return lid;
        }

        return -1;
        
    }
}
// @lc code=end

