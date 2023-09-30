package account;
// run time Exception(unchecked Exception) - dont need to catch it
//logic error
public class AccountCurrencyException extends RuntimeException {
public AccountCurrencyException(String string) {
	super(string);
}
}
