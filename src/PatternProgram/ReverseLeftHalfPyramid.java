package PatternProgram;

public class ReverseLeftHalfPyramid {
    public static void main(String[] args){
        int k = 5;
        printReverseLeftHalfPyramid(k);
    }
public static void printReverseLeftHalfPyramid(int k){
        for(int i=0; i<k; i++){
            for(int j=k-1; j>=i; j--){
                System.out.print("* ");
            }
        System.out.println();
        }
}
}
