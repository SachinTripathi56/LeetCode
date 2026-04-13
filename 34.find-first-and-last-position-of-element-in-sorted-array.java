/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
         if(nums.length==0){
            return new int[]{-1,-1};
        }

        int a[] = new int[2];
        a[0]= firstIndex(nums, target);
        a[1]= lastIndex(nums, target);
        return a;
        
    }

    public int firstIndex(int[] nums, int target){
        int ans=-1;   
        int a= 0;
        int b = nums.length-1;
        
        while(a<=b){
           int m = (a+b)/2;
            if(target==nums[m]){
                ans= m;
                b = m-1;
            }

            else if(target>nums[m]){
               a= m+1;
            }
            else{
                b=m-1;
            }
        }
        return ans;
    }
    public int lastIndex(int[] nums, int target){
        int ans=-1;   
        int a= 0;
        int b = nums.length-1;
        
        while(a<=b){
           int m = (a+b)/2;
            if(target==nums[m]){
                ans= m;
                a = m+1;
            }

            else if(target>nums[m]){
               a= m+1;
            }
            else{
                b=m-1;
            }
        }
        return ans;
    }

}
// @lc code=end

