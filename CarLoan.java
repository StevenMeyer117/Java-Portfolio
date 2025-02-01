/*
This program is a basic calculator for a automobile loan.  It will consider the cost of
the car loan, length of the loan, interest rate of the loan, and how much the borrower
will be putting as a downpayment for the loan.  It will first check to see if the loan
is valid and then will display to the borrower how much the monthly payment will be.
*/

public class CarLoan {
    public static void main(String[] args) {

        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Monthly payment is: $" + monthlyPayment);
        }
    }
}