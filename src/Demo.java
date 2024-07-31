import java.util.*;
public class Demo {
    public int countGoodSubstrings(String s) {
        int length = s.length();
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        if (length < 3) {
            return 0;
        }
        for (int i = 0; i < 3; i++) {
            if (!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
            }
        }
        if (hs.size() == 3) {
            count++;
        }

        for (int j = 3; j < length; j++) {
            hs.remove(j - 3);
            if (!hs.contains(s.charAt(j))) {
                hs.add(s.charAt(j));
            }
            if (hs.size() == 3) {
                count++;
            }
        }
        return count;
    }

            public  void main(String[] args) {
                String s = "xyzzaz";
                int number = countGoodSubstrings(s);
                System.out.println(number);
            }
}


