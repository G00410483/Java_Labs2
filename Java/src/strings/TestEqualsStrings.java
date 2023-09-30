package strings;

public class TestEqualsStrings {

	public static void main(String[] args) {
		String str1="hello";
		String str2="hello";//shorthand point to same location
		String str3= new String("hello"); //object
		String str4= new String("hello");//points to different space
		String str5="hi";
		String str6="hen";
		String str7="Bill";
		String str8="Air";
		//comparasions
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		System.out.println(str4.compareTo(str5));
		System.out.println(str5.compareTo(str6));
		System.out.println(str7.compareTo(str8));

	}

}
