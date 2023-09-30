package account;



public class BankAccount extends Account implements StateSubsidy{
//attributes
	float accountBalance;
	static float euroConversionRate;//static variable - ONLY one storage space
	// all objects will have the same value for this variable
String firstName,lastName;
Loan loan = new Loan();;//composition at work
//BankAccont HAS-A loan
	//constructors
	
	public BankAccount(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public BankAccount(int theNumber,String theName) {
		accountNumber=theNumber;
		accountName=theName;
			}
	//overloading the constructor
public BankAccount(int theNumber,String theName,float theBalance) {
	this(theNumber,theName);// calls orginal constructor
	accountBalance=theBalance;
	System.out.println("Bank Account construction");
	}
//explicit default constructor
public BankAccount() {
	accountNumber=999;
	accountBalance=0f;
	accountName="starter account";
}
//copy constructor
BankAccount(BankAccount anAccount){
	accountNumber=anAccount.accountNumber;
	accountName=anAccount.accountName;
}

//methods	(friendly/package access)
	@Override
	void display() {
	System.out.println("The account Number is " +accountNumber);
	System.out.println("The account Name is " +accountName);
	}
	void displayBalance() {
		display(); //calls display() method
	System.out.println("The account Balance is " +accountBalance);
	System.out.println("The Euro Conversion Rate is "+euroConversionRate);
	}
	
	void makeWithDrawal(float withDrawal) 
			throws AccountBalanceException 
			 {
		
		accountBalance=accountBalance-withDrawal;
	}
	
	//overload the makeWithDrawal method- arguments have to be different
	public void makeWithDrawal(int currencyType,float withDrawal) {
		float convertedWithdrawal=0;
		switch(currencyType) {
		case 0:// punts
			convertedWithdrawal=withDrawal;
			break;
		case 1:// euros
			convertedWithdrawal=euroConversionRate*withDrawal;
			break;
			default:
				// run time exception if an invalid no entered
				throw new AccountCurrencyException("invalid "
						+ "currency "+currencyType);
				}
		accountBalance=accountBalance-convertedWithdrawal;
	}
	void makeLodgement(float lodgement) {
		accountBalance=accountBalance+lodgement;
		
	}
	// override equals() method to compare objects
	@Override
		public boolean equals(Object obj) {
		BankAccount other =(BankAccount)obj;
		if(other.accountNumber==accountNumber
				&& other.accountName==accountName)
			return true;
		else return false;
		}
//static method
	static void setEuroConversionRate(float newRate) {
		euroConversionRate=newRate;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return ("Account Number "+
			Integer.toString(accountNumber)+
			"Account Name"+firstName+lastName);
		}
	// return object references
	BankAccount setFirstName(String first) {
		
			firstName=first;
			return this;
		}
	BankAccount setLastName(String last) {
		lastName=last;
		return this;
	}
	// Interface method
	@Override
		public void addStateSubsidy(float subsidy) {
			accountBalance=accountBalance+subsidy;
			
		}
	//static method - same as Interface static method
	// can refdefine
	static void displaySubsidy() {
		System.out.println("The Government Subsidy is for this"
				+ " Bank Account "	+STATE_SUBSIDY);
	}
	// allowed to override Interface default method
	
	@Override
		public void displayTaxedSubsidy() {
			System.out.println("Taxed subsidy for this "
					+ "Bank Account is "+TAXED_SUBSIDY_DEDUCTION);
			
		}
	public static void main(String[] args) {
		// create objects
BankAccount naomiAccount= new BankAccount(688, "naomi", 900f);
BankAccount myAccount= new BankAccount(688, "naomi", 100f);
BankAccount copyNaomiAcc= new BankAccount(naomiAccount);
BankAccount starterAccount = new BankAccount();
BankAccount myHusbandsAccount = new BankAccount(888, "sean");
BankAccount myWifesAccount = new BankAccount(777, "mary");
BankAccount joesAccount = new BankAccount(997);
naomiAccount.displayBalance();
naomiAccount.makeLodgement(100);
naomiAccount.displayBalance();
starterAccount.displayBalance();
copyNaomiAcc.displayBalance();
//Aliasing at work
myHusbandsAccount= myWifesAccount;
myHusbandsAccount.display();
// Use of Boolean operator "==" Same objects
// but output false
System.out.println(naomiAccount==myAccount);
System.out.println(naomiAccount.equals(myAccount));
// using static method
naomiAccount.setEuroConversionRate(1.0f);//access in a non static way
//static access - use class name
BankAccount.setEuroConversionRate(1.0f);
//static variable same for all objects
naomiAccount.displayBalance();
myWifesAccount.displayBalance();
//testing the overloaded method makeWithdrawal
naomiAccount.makeWithDrawal(1, 50f);
//naomiAccount.makeWithDrawal(80f);
joesAccount.display();
//cascaded method call
naomiAccount.setFirstName("Naomi").setLastName("Hurley");
// use toString method
System.out.println("Naomi account is  "+naomiAccount);
// testing COMPOSITION
naomiAccount.loan.setLoanAmout(90);
System.out.println("Naomi Account (composition at work)");
naomiAccount.loan.displayLoan();// access to methods
// in Loan class
//Interface method
naomiAccount.addStateSubsidy(STATE_SUBSIDY);// STATE_SUBSIDY final
// static methods from Class and Interface
BankAccount.displaySubsidy();//calls class BankAccount method
StateSubsidy.displaySubsidy();//calls Interface method
StateSubsidy testAcc = new BankAccount();
StateSubsidy x=null;
x= new BankAccount(677);
x= new BankAccount(333, "mary");
// Runtime(unchecked) Exception- wrong number entered
//compiler does not care - should have been dealt with
// at development time- dont have to wrap in a try/catch block
naomiAccount.makeWithDrawal(5, 1000);
	}
	

}
