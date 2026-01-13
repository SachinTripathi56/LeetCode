/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public String addBinary(String a, String b) {

        int x = a.length();
        int y = b.length();
        int c=0,sum=0;
        int l = x>y?x:y;
        StringBuilder temp = new StringBuilder();
       
        

        while(l>=0){
          if(x>0 && y >0){
           sum = a.charAt(x-1)- '0'  +b.charAt(y-1)- '0' +c;
           x--;y--;
          }
          else if (x>0) {
              sum = a.charAt(x-1)- '0'+c;
              x--;
          }
          else if(y>0) {
             sum = b.charAt(y-1)- '0'+c;
                y--;
          }
          else if (c==1){
              temp.append(1);
              break;
          }
          else if (c==0){
              break;
          }
          
          temp.append(sum%2);
          c= sum/2;
          l--;
        }

      
      return  temp.reverse().toString();
       
        
    }
}
// @lc code=end

