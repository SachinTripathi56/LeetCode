
import java.util.HashMap;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> x = new HashMap<>();
        int t=0;
         
         
        for(int i : nums){
                
            if(x.containsKey(i)){
                x.put(i, x.get(i)+1);
            }
            else{
                x.put(i, 1);
            }
          if(x.get(i)>((nums.length)/2) && x.get(i)>=t){
            t=i;
          }

        }
        return  t;   
    }
}
//  @lc code=end

