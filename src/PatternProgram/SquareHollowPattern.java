package PatternProgram;

public class SquareHollowPattern {
    public static void main(String[] args){
       int k = 5;
       printPattern(k);
    }
    public static void printPattern(int k){
       for(int i=0; i<k; i++){
           for(int j=0; j<k; j++){
               if(i==0 || i== k-1 || j==0 || j== k-1){
                   System.out.print("1 ");
               }
             else {
                 System.out.print("  ");
               }
           }
       System.out.println();
       }
    }
}
