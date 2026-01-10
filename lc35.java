public class lc35 {
    public static int searchInsert(int[] nums, int tar) {
        int i=0;
        int mid = nums.length / 2;
        if (tar == nums[mid]) {
            return mid;
        } 
        else if (tar < nums[mid]) {
            for (i = mid - 1; i >-1;i-- ) {
                if (tar > nums[i]) {
                    return i + 1;
                } 
                else if (tar == nums[i]) {
                    return i;
                }
        

            }
            return i+1;

        }
        
        else {
            for ( i = mid + 1; i < nums.length; i++) {
                if (tar < nums[i]) {
                    return i ;
                } else if (tar == nums[i]) {
                    return i;
                }
            }
            return i;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1,3,5,8,10,13 };
        System.out.println(searchInsert(nums,18));
    }
}
