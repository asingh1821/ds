package bank;

public class Account {
  int customer_id;
  int balance;
  public Account(int customer_id, int balance)
  {
      this.customer_id=customer_id;
      this.balance=balance;
  }
  public  int check_balance()
  {
     return this.balance;
  }
public int update_balance(int amount)
{
    this.balance=this.balance+amount;
    return this.balance;
}


}
