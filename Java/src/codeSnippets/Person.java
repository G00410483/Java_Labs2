package codeSnippets;

public class Person {
String firstName;
String lastName;
@Override
	public String toString() {// TODO Auto-generated method stub
		return (firstName+""+lastName);
	}
// methods to return an object reference
Person setFirstName(String first) {
	firstName=first;
	return this;
}
Person setLastName(String last) {
	lastName=last;
	return this;
}

	public static void main(String[] args) {
		Person student = new Person();
		//cascaded method call
		student.setFirstName("Sally").setLastName("Kelly");

	}

}
