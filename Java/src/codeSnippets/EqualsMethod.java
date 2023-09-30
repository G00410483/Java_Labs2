package codeSnippets;

class Value{
	int i;
// need to override the equals method as this is not
// a Wrapper class 	
	
@Override
public boolean equals(Object obj) {
	Value other = (Value)obj;// cast to Value type object
	if(other.i==i)
		return true;
		else return	false;
}	
}
public class EqualsMethod {

	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i=v2.i=100;
	System.out.println(v1.equals(v2));	
	}

}
