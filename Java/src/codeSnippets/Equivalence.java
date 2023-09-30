package codeSnippets;

public class Equivalence {

	public static void main(String[] args) {
		//Java 9
		Integer x1=Integer.valueOf(456);
		Integer x2=Integer.valueOf(456);
		Integer x3 =Integer.valueOf(4);
		Integer x4 = Integer.valueOf(4);
		/*Integer n1= new Integer(47);//deprecated Java 9
		Integer n2 = new Integer(47);
		System.out.println(n1==n2);// not pointing to same area
		System.out.println(n1!=n2);*/
		System.out.println(x1==x2);
		System.out.println(x3==x4);
		System.out.println(x1.equals(x2));
		System.out.println(x3.equals(x4));

	}

}
