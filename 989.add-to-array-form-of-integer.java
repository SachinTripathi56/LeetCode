/*
 * @lc app=leetcode id=989 lang=java
 *
 * [989] Add to Array-Form of Integer
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        int x,y= num.length-1, c =0;
        List arr = new ArrayList<>();
   while (k>0 || y>=0 ){
      int numval =0;
    if(y>=0){
         numval = num[y];
    }
         x = k%10;
    int temp = numval +x + c;
   
    if(temp >=10){
        temp = temp%10;
        arr.add(temp);
        c=1;

    }
    else{
        arr.add(temp);
        c=0;
    }
    k =k/10;
    y--;
   }

   if(c==1 ){
    arr.add(c);
   }
        return arr.reversed();

    }
}
// @lc code=end

