package PatternProgram;

public class LeftHalfPyramid {
    public static void main(String[] args){
        int k = 5;
        printLeftHalfPyramid(k);
    }

    public static void printLeftHalfPyramid(int k){
        for(int i = 0; i<k ; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
         System.out.println();
        }
    }
}
