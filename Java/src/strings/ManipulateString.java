package strings;

public class ManipulateString {
//reverse a string
	public static String reverseString(String str) {
		String result="";// blank string
		for(int i=0;i<str.length();i++) {
			result=str.charAt(i)+result;
		}// end for loop
	return result;
	}//end method
	public static void main(String[] args) {
		String str1="stressed";
		String str2;
		str2=reverseString(str1);
		System.out.println("Reverse String is "+str2);

	}

}
