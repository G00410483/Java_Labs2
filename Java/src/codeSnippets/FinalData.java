package codeSnippets;
class Value1{
	int i=1;
}
public class FinalData {
      final int i1=9;
      static final int VAL_TWO=99;
      public static final int VAL_THREE=39;
      final int i4=(int)(Math.random()*20);//random constant
      static final int i5=(int)(Math.random()*20);
    		  Value v1= new Value();
    		  final Value v2 = new Value();
    		  static final Value v3= new Value();
   public void print(String id) {
	   System.out.println(id+": "+" i4= "+i4+",i5= "+i5);
   }
	public static void main(String[] args) {
		FinalData fd1= new FinalData();
	//	fd1.i1++;//Error cannot change value
		fd1.v2.i++;//Object is not constant
		fd1.v1= new Value();//OK-- not final
		//fd1.v2= new Value();//Error - cant change reference
		//fd1.v3= new Value();//Error - cant change reference
		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalData fd2= new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");// i5 will only be loaded once
		// it is static so value does not change
	}

}
