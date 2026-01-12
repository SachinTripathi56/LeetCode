/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length-1;
         Integer t=0;
         int a,b,c=0,ll=0;
         int[]  arr ={};
         
         
        if(digits[l]!=9){
            digits[l] +=1;
            return digits;
        }
        else{
            if(l==0){
                arr[0]=1;
                arr[1]=0;
                return arr;
            }

            for(int i : digits){

              t= t*10 +i;
            }
            t=t+1;
            b= t.reverse(t);
            while(b>0){
           
             a=b%10;
             arr[ll]= a;
             ll++;
         //    c = c*10+a;
             b=b/10;
            }
          
return arr;

        }
        
    }
}
// @lc code=end

