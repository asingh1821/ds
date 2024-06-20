//import bank.Account;
import string.Charvalue;
import java.util.Scanner;
import bank.Account;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Account a1=new Account(1001, 501);
//        System.out.println("Your balance  :"+ (a1.check_balance()));
//          System.out.println("your updated balance  : "+ (a1.updateBalance(50)));
//   Scanner sc=new Scanner(System.in);
//   System.out.println("enter value of n");
//   int n=sc.nextInt();
//   Charvalue c1=new Charvalue("AmitAnkit");
//   System.out.println(c1.nthchar(n));
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter withdrawal balance");
//        float n=sc.nextFloat();
//         System.out.println("enter cash deposit amount");
//         float p=sc.nextFloat();
//Account a1=new Account(101,10000);
// a1.cashDeposit(n);
// a1.checkBalance();
//   a1.cashWithdraw(p);
        String word = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        String reverse = "";
        int index = word.indexOf(ch);
        int i = 0;
        int j = index;
        while (i <= j) {
            char first = word.charAt(i);
            char second = word.charAt(j);
            char temp = first;
            first = second;
            second = temp;
            reverse = reverse + first;
            i++;
            j--;
        }
    }
}