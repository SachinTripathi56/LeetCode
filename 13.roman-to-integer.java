
import java.util.Map;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
       int t =0,a;
       Map<Character, Integer> x = Map.of(
            'I', 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );
        a=x.get(s.charAt(0));
        for (int i=0;i<s.length(); i++) {
         if(a>=x.get(s.charAt(i))){
            a=x.get(s.charAt(i));
            t= t+a;
         }

         else{
             t=t+ x.get(s.charAt(i)) -2*a;
             a=x.get(s.charAt(i));
         }
                
        }
      
         return t;   
        }
    }

// @lc code=end

