public class TestDefinedException {
  public static void main(String[] args) {
    
        Account acct = new Account();
        System.out.println("Your balance is: " + acct.balance());
        acct.withdraw(400);
        System.out.println("Your balance is: " + acct.balance());
        acct.deposit(300);
        System.out.println("Your balance is: " + acct.balance());
        acct.withdraw(1000);
        System.out.println("Your balance is: " + acct.balance());
        
    



  }
}
