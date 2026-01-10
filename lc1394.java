public class lc1394 {
       public static int findLucky(int[] arr) {
        if (arr.length == 0) return -1;
        int i;
        int [] fre=new int[501];
        for(i=0;i<arr.length;i++){
              fre[arr[i]]++;
        }
        for(i=500;i>0;i--){
            if(fre[i]==i){
               return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,2,2,3,3};
        System.out.println(findLucky(arr));
    }
}
