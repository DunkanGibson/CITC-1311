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
}