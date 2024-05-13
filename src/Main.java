import bank.Account;

public class Main {
    public static void main(String[] args) {
        Account a1=new Account(1001, 501);
        System.out.println("Your balance  :"+ (a1.check_balance()));
          System.out.println("your updated balance  : "+ (a1.update_balance(50)));
    }
}