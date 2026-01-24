/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] arr = new int[nums.length];
        int x =0, k = nums.length-1 , ptr = nums.length-1;
       

        while(x<=k){
            int ss = nums[x]*nums[x];
            int es = nums[k]*nums[k];

            if(ss>es){

                arr[ptr--] = ss;
                x++;
            }
            else{
                arr[ptr--] = es;
                k--;
            }
        }
       
        return arr;
        
    }
}
// @lc code=end

