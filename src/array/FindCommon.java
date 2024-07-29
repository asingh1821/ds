package array;

import java.util.*;
class FindCommon {
    public static void main(String[] args){
        int[] nums1 = {1,1,3,2,6};
        int[] nums2 = {2,3,4};
        int[] nums3 = {3,6,4};
        List<Integer> ar = twoOutOfThree(nums1,nums2,nums3);
        for(int i=0; i<ar.size(); i++){
            System.out.print(ar.get(i) + " ");
        }

    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> result  = new HashSet<>();

        for (int value1 : nums1) {
            hs1.add(value1);
        }

        for (int value2 : nums2) {
            if (hs1.contains(value2)) {
                result.add(value2);
            }
            hs2.add(value2);
        }

        for (int value3 : nums3) {
            if (hs2.contains(value3) || hs1.contains(value3)) {
                result.add(value3);
            }
        }
        return new ArrayList<>(result);
    }
}