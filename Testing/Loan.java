import java.sql.Date;

/**
 * Loan
 */
public class Loan {

  private double annualInterestRate = 2.5;
  private int numberOfYears = 1;
  private double loanAmount = 1000;
  private java.util.Date loanDate;

  public Loan(){

  }

  public Loan(double newAnnualInterestRate, int newNumberOfYears, double newLoanAmount){
    this.annualInterestRate = newAnnualInterestRate;
    this.numberOfYears = newNumberOfYears;
    this.loanAmount = newLoanAmount;
    loanDate = new java.util.Date();
  }

  public double getAnnualInterestRate(){
    return annualInterestRate;
  }

  public int getNumberOfYears (){
    return numberOfYears;
  }

  public double getLoanAmount(){
    return loanAmount;
  }

  public java.util.Date getLoanDate(){
    return loanDate;
  }

  public void setAnnualInterest(double newInterest){
    this.annualInterestRate = newInterest;
  }

  public void setNumberOfYears(int newNumberOfYears){
    this.numberOfYears = newNumberOfYears;
  }

  public void setLoanAmount(double newLoanAmount){
    this.loanAmount = newLoanAmount;
  }

  public double getMonthlyPayment(){
    double monthlyInterestRate = annualInterestRate / 1200;
    double monthlyPayment = loanAmount * monthlyInterestRate / ((Math.pow(1 /(1 + monthlyInterestRate), numberOfYears * 12)));
    return monthlyPayment;
  }

  public double getTotalPayment(){
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;
  }

  public static void main(String[] args) {
    Loan l1 = new Loan(3.0, 30, 235000);

     System.out.println(l1.getMonthlyPayment()); 
     System.out.println(l1.getNumberOfYears()); 
     System.out.println(l1.getTotalPayment()); 
     System.out.println(l1.getLoanDate()); 
  }
}

