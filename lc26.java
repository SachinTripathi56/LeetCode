import java.util.*;
class lc26 {
    public static void main(String[] args) {
        int nums[]= {0,1,2,4};

        int i = 0;  // Pointer to the last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];  // Overwrite duplicate
            }
        }


        System.out.println(Arrays.toString(nums));
        System.out.println(i+1);
    }


}