package account;

public class CurrentAccount extends BankAccount {

	float overDraftLimit;// new to this class
	public CurrentAccount(int accountNumber) {
		super(accountNumber);
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(int theNumber, String theName) {
		super(theNumber, theName);
		// TODO Auto-generated constructor stub
	}

public CurrentAccount(int theNumber, String theName, 
		float theBalance, float theOverDraft) {
		super(theNumber, theName, theBalance);//BankAccount construction
		// new aspect of this constructor
		overDraftLimit=theOverDraft;
		System.out.println("Current Account construction");
	}

	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(BankAccount anAccount) {
		super(anAccount);
		// TODO Auto-generated constructor stub
	}
// methods
	void setOverDraftLimit(float overDraftLimit) {
		this.overDraftLimit=overDraftLimit;
	}
	// throws  checked Exception if overdraft exceeded
	@Override
	void makeWithDrawal(float withDrawal) 
			throws AccountBalanceException {
		if(accountBalance- withDrawal<overDraftLimit) {
		throw new AccountBalanceException("Cannot make"
+ "withdrawal of "+withDrawal+"\n\tas this would exceed"
	+ "account overdraftLimit of "+overDraftLimit+
	"\n\t Current Account Balance is  "+accountBalance);	
		}//end if statement
		super.makeWithDrawal(withDrawal);
	}
	public static void main(String[] args){
		CurrentAccount annesAccount=
		new CurrentAccount(6767, "anne", 80f, 100f);
		annesAccount.setOverDraftLimit(80f);
		BankAccount a = new BankAccount();
		a=annesAccount;// inherited class can overwrite base class
//annesAccount=a; but not the reverse
		//polymorphism at work
		BankAccount joesAccount = 
		new CurrentAccount(99, "joe", 100, 5);
		joesAccount.displayBalance();//method for a current Account
	CurrentAccount annAccount = new 
	CurrentAccount(99,"ann",70, -100);
	try {
		annAccount.makeWithDrawal(900);
	} catch (AccountBalanceException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		e.printStackTrace();
	}

	}

}
