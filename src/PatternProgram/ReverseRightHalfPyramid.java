package PatternProgram;

public class ReverseRightHalfPyramid {
    public static void main(String[] args){
        int k=5;
        printPattern(k);
    }
    public static void printPattern(int k){
        for(int i=0; i<k; i++){                // 2nd method logic for column(j)
            for(int j=k-1-i; j>=0; j--){       // for(int j = 0; j<i; j--){
                System.out.print("* ");
            }
          System.out.println();
        }
}
}
