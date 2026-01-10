public class lc28 {

      public static int strStr(String haystack, String needle) {
        int i=0,j=0,d=0,x=-1;
        while (i<haystack.length()&&j<needle.length()) {
            if(haystack.charAt(i)!=needle.charAt(j)){
                i++;
               
            }
            else{
               while()
                  i++;j++;

            }
        }
        
        if(j==needle.length()){
            x=0;
        }
        return x;
    }
    public static void main(String[] args) {
        String tt1="0ssad";
        String tt2="sad";
        System.out.println(strStr(tt1,tt2));
    }
}