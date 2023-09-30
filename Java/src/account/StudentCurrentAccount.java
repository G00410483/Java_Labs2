package account;

public class StudentCurrentAccount extends 
CurrentAccount implements StudentStateSubsidy {
float studentLoan;
	public StudentCurrentAccount(int accountNumber) {
		super(accountNumber);
		// TODO Auto-generated constructor stub
	}

	public StudentCurrentAccount(int theNumber, String theName) {
		super(theNumber, theName);
		// TODO Auto-generated constructor stub
	}

	public StudentCurrentAccount(int theNumber, String theName, float theBalance, float theOverDraft,float theLoan) {
		super(theNumber, theName, theBalance, theOverDraft);
		studentLoan=theLoan;
		System.out.println("Student Account construction");
	}

	public StudentCurrentAccount() {
		// TODO Auto-generated constructor stub
	}

	public StudentCurrentAccount(BankAccount anAccount) {
		super(anAccount);
		// TODO Auto-generated constructor stub
	}
//methods
	void setStudentLoan(float theLoan) {
		studentLoan=theLoan;
	}
	@Override
	public void addStudentStateSubsidy(float studentSubsidy) {
	accountBalance=accountBalance+studentSubsidy;
		
	}
	public static void main(String[] args) {
	StudentCurrentAccount susanAcc= 
			new StudentCurrentAccount(22,"sue", 90f, 70f,100f);
	// this class has the most functionality in this package
susanAcc.addStateSubsidy(STATE_SUBSIDY);
susanAcc.addStudentStateSubsidy(STATE_SUBSIDY);
//access to both Interface methods as class implements a derived
// Interface
	}
	//Interface Method implemented
	

}
