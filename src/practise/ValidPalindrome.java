package practise;

public class ValidPalindrome {
      public  void main(String[] args) {
          String s = "A man, a plan, a canal: Panama";
          boolean b = isPalindrome(s);
          System.out.println(b);
      }
        public boolean isPalindrome(String s) {
            String replaced = s.replaceAll("[^a-zA-Z0-9]", " ");
            int i = 0;
            int j = replaced.length() - 1;
            while (i <=j) {
                // char c = replaced.charAt();
                if (replaced.charAt(i) != replaced.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;

        }

}
