package array;
import java.util.*;

public class FindPeakElement {

      public static void main(String[] args) {
          int[] nums = {1, 2, 1, 3, 5, 6, 4};
          int peakNo = findPeakElement(nums);
          System.out.println(peakNo);
      }

        public static int findPeakElement(int[] nums) {
            int l = 0;
            int h = nums.length-1;
            while(l<h){
                int m = l + (h-l)/2;
                if(nums[m] > nums[m+1]){
                    h = m;
                }else{
                    l = m + 1;
                }
            }
            return l;
        }
}
