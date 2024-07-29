package array;
import java.util.*;
public class Solution {


        public static void main(String[] args){
            int[] nums ={1,1,2,3};
            int[] count = decompressRLElist(nums);
            for(int i=0; i<count.length;i++){
                System.out.print(count[i]+" ");
            }
        }

        public static int[] decompressRLElist(int[] nums) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < nums.length - 1; i++) {
                int j = 1;
                while (j <= nums[i]) {
                    al.add(nums[i + 1]);
                    j++;
                }
                i++;
            }
           int[] fine = new int[al.size()];
            for (int i = 0; i < al.size(); i++) {
                fine[i] = al.get(i);
            }
            return fine;
        }
    }

