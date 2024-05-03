import array.Insert;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Insert addElement = new Insert();
        int[] a = {3, 4, 8, 9, 10, 33, 55,32,-12,-6,0};
        int sizeOfArray = a.length;
        addElement.insertAtEnd(a, sizeOfArray, 12);
        for (int j = 0; j < sizeOfArray; j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}
//a[]