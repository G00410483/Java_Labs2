package account;
//composition at work
public class Loan {

	int newLoan;
	void setLoanAmout(int theLoan) {
		newLoan=theLoan;
	}
	void displayLoan() {
		System.out.println("Loan on this account is "+newLoan);
	}
}
