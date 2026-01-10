import java.util.Arrays;
public class lc1353 {
        public static int maxEvents(int[][] events) {
              int temp1=0;
              int temp2=0;
              int d=events.length,t=0;          
            for(int i=0;i<events.length;i++){

                for(int j=0;j<events.length-1-i;j++){
                    if(events[j][0]>events[j+1][0]){
                        temp1=events[j][0];
                        temp2=events[j][1];
                        events[j][0]=events[j+1][0];
                        events[j][1]=events[j+1][1];
                        events[j+1][0]=temp1;
                        events[j+1][1]=temp2;
                    }
                }
              
            }
            for(int i=0;i<events.length-1-t;i++){
              
                if(events[i][0]==events[i+1][0]){
                    if(events[i][0]==events[i+1][1]||events[i][1]==events[i+1][0]){
                        d--;
                    }
                    else if(events[i+1][0]==events[i+2][0]){
                          if(events[i][1]==events[i+1][1]&&events[i+1][1]==events[i+2][1]&&events[i][1]==events[i+2][1]){
                            d--;
                          }
                    }
                }
                t++;
            }
              return d;
    }
    public static void main(String[] args) {

        int [][] arr={{1,2},{2,3},{3,4},{1,2},{1,1},{2,4}};
        System.out.println((maxEvents(arr)));
    }
    
}
