package bank;
public class Account {
  //String name;
  int accNo;
  float balance;
  public Account(int accNo,float balance) {
      //this.name=name;
      this.accNo=accNo;
      this.balance=balance;
  }
public void checkBalance() {
      System.out.println("balance : "+balance);

}
public void cashWithdraw(float amount) {
      if(amount>balance) {
          System.out.print("low balance");
      }
     else {
         System.out.println("withdraw successful");
         balance=balance-amount;}
         checkBalance();
     }

public float cashDeposit(float money) {

      System.out.println("cash deposit successfully");
    balance=balance+money;
  return balance;
  }


}
