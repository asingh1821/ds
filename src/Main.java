import java.util.*;

public class Main {

    public static int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() == 1) {
                sum += e.getKey();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }
}