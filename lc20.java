import java.util.*;
public class lc20 {

      public static boolean isValid(String s) {
          if(s.length()==1){
                return false;
            }
        int i=0;
      Stack<Character> str= new Stack<>();
      while(i<s.length()){
      if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{' ){
        str.push(s.charAt(i));
      }
      else if(str.isEmpty()){
        return false;
      }
  
      else if(s.charAt(i)==')' && str.peek()!='('||s.charAt(i)==']' && str.peek()!='['||s.charAt(i)=='}' && str.peek()!='{'){
            return false;
        }
        else{
            str.pop();
        }
      
      i++;
    }
    if(str.empty()){
        return true;
    }
    return false;
      
    }
    public static void main(String[] args) {
        System.out.println(isValid("){"));
    }
}