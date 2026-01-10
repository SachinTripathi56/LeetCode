public class lc594 {
    public static int findLHS(int[] nums) {
        int k=0,i=0,j=0,max=0,flag=-1,t=0;
        for(i=0;i<nums.length; i++){
            k=0;t=0;
            for(j=0;j<nums.length-1;j++){
                if(nums[i]<nums[j+1] && nums[i]+1==nums[j+1]){
                    
               k++;
               flag=0;
                }
                else if(nums[i]>nums[j+1] && nums[i]==nums[j+1]+1){
                    
                  k++;
               flag=0;

                 // System.out.println(k);
                }
               
                else if(k>0){
                    if(nums[i]==nums[j+1]){
                        t++;
               flag=0;

                    }
                }
            }
             System.out.println(t);
            if(k>max){
                max=k;
            }

        }
        if(flag>-1){
            return max;
        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int []arr1={1,3,2,2,5,2,3,7};
        int []arr2={-3,-1,-1,-1,-3,-2};
        System.out.println(findLHS(arr));
     
    }
}
