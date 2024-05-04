package array;

public class RotateArray {
    public void rotateArray(int[] arr,int d,int n)
    {

        d=d%n;
        int k=0;
        int res[]=new int[n];
        for(int i=d;i<n;i++)
        {
          res[k]=arr[i];
          k++;
        }
        for(int i=0;i<d;i++)
        {
            res[k]=arr[i];
            k++;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }

    }
}
