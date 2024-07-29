package array;
import java.util.*;
public class CountValue {

        public static void main(String[] args){
            int[] nums ={437,315,322,431,686,264,442};
            int count = findNumbers(nums);
            System.out.println(count);
        }

        public static int findNumbers(int[] nums) {

            int countNumber = 0;
            for (int i = 0; i < nums.length; i++) {
                int countDigit = 0;
                while (nums[i] > 0) {

                    nums[i] = nums[i] / 10;
                    countDigit++;
                }

                if (countDigit % 2 == 0) {
                    countNumber++;

                }
            }
            return countNumber;
        }
    }

