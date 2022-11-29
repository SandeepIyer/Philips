package Day1;

public class Operators {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		
		//Arithmetic operators -- > + - * %
		
		System.out.println("------------Arth ops--------");
		System.out.println("Sum of a and b is: " +(a+b));
		System.out.println("Diff of a and b is: " +(a-b));
		System.out.println("Mul of a and b is: " +(a*b));
		System.out.println("Div of a and b is: " +(a/b));
		System.out.println("Mod Divof a and b is: " +(a%b));

		//Relational operators (Comp Ops) -- == < > <= >= !=
		//Always return boolean value
		
		System.out.println("------------Relt ops--------");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		
		//Logical operators && || !
		// works between two boolean values
		
		boolean x=true;
		boolean  y=false;
		
		System.out.println("------------logi ops--------");
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		//increment/decrement operators ++ --
		
		a=10;
		a++; //a=a+1;
		
		System.out.println("-----------Incr/Decr ops---------");
		System.out.println(a);
		
		b=20;
		b--;     //b=b-1;
		System.out.println(b);
		
		//Assignment operators
		// assign the value to the variable
		
	}

}
