public class Account {
  private int balance = 1000;

      public Account() {

      }

      public int balance() {
        return balance;
      }

      public void withdraw(int amount) throws NotSufficientFundException{
        //withdraws amount from balance if there are sufficient funds.
        if (amount > balance) {
        
          throw new NotSufficientFundException(String.format("Current balance %d is less than requested amount %d", balance, amount));    
          }
          balance = balance - amount;
          
        }
        
        public void deposit(int amount){
          
          //deposits amount in balance if amount is not <0.

          if (amount <= 0) {
            throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amount));
          }
          balance=balance + amount;
        }

}
