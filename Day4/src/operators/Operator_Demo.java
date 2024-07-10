package operators;

public class Operator_Demo {

	public static void main(String[] args) {
		
		int a=10,b=20;
		
		//Arthimatic operators
		
		int c= a+b;
		System.out.println("sum:"+ c);
    	System.out.println("sub:"+ (a-b));
		System.out.println("MUL:"+ a*b);
		int d= a/b;
		System.out.println("DIV:"+ d);
		
		 a =12;
		System.out.println("DIV:"+ b%a);
		
		//increment operator without assigned to variable it works same
		
		int e= 100;
		e++;
		System.out.println(e);
		
		e--;
		System.out.println(e);
		
		
		//post increment (when increment operator and assignment are present)
		//current value of e=100
		int post=e++;
		System.out.println(post);                        // firstly e value is assigned to variable then incremented
		System.out.println(e);            // value of e will be 101
		
		
		//pre increment 
		
		int pre =++e;                       //increment happen first then assigned to variable
		System.out.println(pre);           //value will be 102
		
		
		// Relational operator        -all the relational operator return boolean result
		                             //  -relationa operator compare all value
		
		
		 System.out.println(a>b);
		 System.out.println(a<b);
		 System.out.println(a==b); 
		 
		 a=20;
		 System.out.println(a<=b);
		 
		 System.out.println(a>=b);
		
		 System.out.println(a!=b);
		
		//Logical Operator             All logical operator return boolean value
		
		System.out.println(true&&false);  //logical operator only compare boolean value
		
		System.out.println(true || false);
		
		System.out.println(!false);
		
		
		//Assignement operator 
		
		a= 100;
		System.out.println(a);
		
		//when we need to increment and decrement value multiple times 
		
	     
		System.out.println(	a+=5);
		
		System.out.println(	a-=5);
		
		System.out.println(	a*=5);
		
		System.out.println(	a/=5);
		
		System.out.println(a%3);
	}
	
	
	
	

}
