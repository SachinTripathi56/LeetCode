import java.util.HashMap;

class FindSumPairs {
    int[] arr1;
    int[] arr2;
    HashMap<Integer, Integer> arr2Map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.arr1 = nums1;
        this.arr2 = nums2;

        // Initialize frequency map for arr2
        for (int element : arr2) {
            arr2Map.put(element, arr2Map.getOrDefault(element, 0) + 1);
        }
    }

    public void add(int index, int val) {
        if (index < 0 || index >= arr2.length) return;

        int oldVal = arr2[index];
        int newVal = oldVal + val;

        // Update frequency map
        arr2Map.put(oldVal, arr2Map.get(oldVal) - 1);
        if (arr2Map.get(oldVal) == 0) {
            arr2Map.remove(oldVal); // Optional, for cleanup
        }

        arr2[index] = newVal;
        arr2Map.put(newVal, arr2Map.getOrDefault(newVal, 0) + 1);
    }

    public int count(int tot) {
        int count = 0;

        for (int num : arr1) {
            int complement = tot - num;
            count += arr2Map.getOrDefault(complement, 0);
        }

        return count;
    }

    public static void main(String[] args) {
        int arrx[]={1,1,2,2,2,3};
        int arry[]={1,4,5,2,5,4};
  FindSumPairs obj = new FindSumPairs(arrx, arry);
  int param_2 = obj.count(7);
  obj.add(3,2);
 System.out.println(param_2);
 System.out.println(obj.count(8));
 System.out.println(obj.count(4));
obj.add(0,1);
obj.add(1,1);
 System.out.println(obj.count(7));

    }
}
