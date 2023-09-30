package codeSnippets;
class StaticTest{
	// static veriable
	static int i=47;
}
public class StaticFun {
	// static method incr() not tied to any object
static int incr() {
	return ++StaticTest.i;
}
	public static void main(String[] args) {
	// demonstrate use of static variables
StaticTest st1 = new StaticTest();
StaticTest st2 = new StaticTest();
StaticTest.i++;// access i  through class name
System.out.println("The value of st1 is "+st1.i);
System.out.println("The value of st2 is "+ st2.i);
System.out.println("Access through class name "+StaticTest.i);
//demonstrate use of static methods
StaticFun sf = new StaticFun();
System.out.println("Result of method accessing through object is "
		+sf.incr());
System.out.println("Result of accessing through class name is "
		+StaticFun.incr() );


	}

}
