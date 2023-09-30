package strings;

public class Student {
String studentName;
int number;
//constructor
public Student(String name,int no) {
	studentName=name;
	number=no;
	}
//override toString() method Object Class
/*@Override
	public String toString() {
		
		return ("Name "+studentName+"\nStudent number:"
				+Integer.toString(number));
	}*/
	public static void main(String[] args) {
		//object
		Student joe = new Student("Joe Kelly", 2021);
		System.out.println(joe);
		System.out.println(joe.toString());
		System.out.println("Student is "+joe);// object is seen 
		// as a string -toString method overridden

	}

}
