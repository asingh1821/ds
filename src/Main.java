import array.Insert;
import array.Delete;
import array.RotateArray;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      RotateArray reverseFromIndex=new RotateArray();
      int arr[]={40,13,27,87,95,40,96,71,35,79,68,2,98,3,18,93,53,57,2,81,87,42,66,90,45,20,41,30,32,18,98,72,82,76,10,28,68,57,98,54,87,66,7,84,20,25,29,72,33,30,4,20,71,69,9,16,41,50,97,24,19,46,47,52,22,56,80,89,65,29,42,51,94,1,35,65,25};
      reverseFromIndex.rotateArray(arr,69,77);
  for(int i=0;i<arr.length;i++)
  {
      System.out.print(arr[i]+" ");
  }
    }
}
//a[]