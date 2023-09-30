package strings;

public class StringRef {

	public static void main(String[] args) {
		String a="java";
		String b = "java";
		String x="ja";
		String y="va";
		String c;
		c=x+y;
		// allowed to manipulate StringBuffer objects
		StringBuffer d= new StringBuffer("java");
		StringBuffer e= new StringBuffer("beans");
		StringBuffer f= d.append(e);// changing d
		if(a==b) {
			System.out.println("a and b are the same object");
		}
		else {
			System.out.println("a and b are not the same object");
		}
		if(b==c) {
			System.out.println("b and c are the same object");
		}
		else {
			System.out.println("b and c are not the same abject");
		}
		if(d==f) {
			System.out.println("d and f are the same object");
		}
		else {
			System.out.println("d and f are not the same abject");
		}
		// reverse a String
		StringBuffer str1= new StringBuffer("java");
		System.out.println(str1.reverse());
	}

}
