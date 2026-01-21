/*
 * @lc app=leetcode id=1464 lang=java
 *
 * [1464] Maximum Product of Two Elements in an Array
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        
         int smax=-1; 
         int max =-1 ; 
        
        for (int n =0; n<nums.length; n++){
            if(nums[n]>max){
                smax = max;
                max = nums[n];
            
            }
            else if (smax<nums[n]){
                smax = nums[n];
            }

        }
      
       return (max-1)*(smax-1); 
        
    }
}
// @lc code=end

