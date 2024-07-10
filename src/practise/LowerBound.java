package practise;

public class LowerBound {
        public static void main(String[] args){
            int[] a = {1,2,3,3,5,5,8,8,10,10,11};
            int target = 7;
            int index = printIndex(a,target);
            System.out.println(index);
        }
        public static int printIndex(int[] a, int target){
            int l = 0;
            int r = a.length-1;
            int mid = 0;
            int ans = 0;
            while(l < r){
                mid = l + (r - l)/2;
                if(a[mid] >= target){
                    ans = mid ;
                    r = mid;
                } else {
                    l = mid +1;
                }
            }
           if(a[a.length - 1]< target){
               return a.length-1;
           }
            return ans;
        }

}
