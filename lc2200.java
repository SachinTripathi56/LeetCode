import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class lc2200 {
     public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList list = new ArrayList<>();
        for(int j=0; j<nums.length;j++){
            if(nums[j]==key){
                for(int i=0;i<nums.length;i++){
                    if(Math.abs(i-j)<=k){
                         list.add(i);
                    }
                }
            }
        }

        List newlist = (List) list.stream()
                                            .distinct()
                                            .collect(Collectors.toList());
        Collections.sort(newlist);
        return newlist;
    }
    public static void main(String[] args) {
        int [] nums ={2,2,1,2,2};
        System.out.println(findKDistantIndices(nums,2,1));
    }
}
