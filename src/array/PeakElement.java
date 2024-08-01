package array;
import java.util.*;

public class PeakElement {
         public static void main(String[] args){
            int[] arr = {1,5,7,9,12,1,0,2};
            int n = arr.length;
            int value = peakElement(arr, n);
            System.out.println(value);
        }

        public static int peakElement(int[] arr,int n)
        {
            int l = 0;
            int h = n-1;
            while( l < h){
                int m = l+(h-l)/2;
                if(arr[m] >= arr[m+1] ){
                    h = m ;

                }else {
                    l = m+1;

                }
            }

            return l;
        }
    }
