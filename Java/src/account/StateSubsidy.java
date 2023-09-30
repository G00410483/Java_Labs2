package account;

public interface StateSubsidy {
float STATE_SUBSIDY=100;//public, static and final
float TAX_RATE=.1f;
float TAXED_SUBSIDY_DEDUCTION=STATE_SUBSIDY-
(TAX_RATE*STATE_SUBSIDY);
void addStateSubsidy(float subsidy);//public and abstract
//Java 8 - can add in default/defender methods 
//- backward compatability - public - can override in class
//implementing Interface
default void displayTaxedSubsidy() {
	System.out.println("The Taxed Subsidy is "
+TAXED_SUBSIDY_DEDUCTION);
}
// Java 8 static method
static void displaySubsidy() {
	System.out.println("The Government Subsidy is "
+STATE_SUBSIDY);
}
}
