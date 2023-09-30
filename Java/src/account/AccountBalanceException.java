package account;

public class AccountBalanceException extends Exception {
public AccountBalanceException(String string) {
	super(string);
	// have to call super here as class Exception does not have
	// a default constructor
}
}
