package conditionalStatement;

public class ConditionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// if statement 
		int a=100,b=200;
		
		if(a<b) {
			System.out.println("a is small");          //this block only return in result
		}
		
		
		// without braces if single statement is there
		if(a>b) 
			System.out.println("a is small");         //Condition not satisfied
		

		// Nested if else 
		
	//    statement find small of all number 
		
		int P =100, Q=34,R=88;
		
		if ((P<Q)&&(P<R)){
			System.out.print("smallest No is :"+ P);
		}else if((Q<P)&&(Q<R)) {
			System.out.println("Smallest No is "+Q);
		}else {
			System.out.println("smallest is "+R);
		}
		
		
		
		
    // Switch Case  --- there we'll be no condition for switch only accepts variable
		//  Case values are all possible value of that variable
		// break statement is mandatory after every case. Its perpose end control and come out side switch loop
		//No need of break statement for default case
		
		int X =5;
		switch (X) {
		case 1: 
			System.out.println("Monday");
			break;
			
		case 2: 
			System.out.println("Tuesday");
			break;
			
			
		case 3: 
			System.out.println("Wednesday");
			break;
			
			
		case 4: 
			System.out.println("Thrusday");
			break;
			
		case 5: 
			System.out.println("Friday");
			break;	
		default:	System.out.println("Invalid");
			
		}
		
		
		
		
		
		//program to find no of day in week
		
		String s1="Tuesday";
		switch (s1) {
		case "Monday": 
			System.out.println("1");
			break;
			
		case "Tuesday": 
			System.out.println("2");
			break;
			
			
		case "Wednesday": 
			System.out.println("3");
			break;
			
			
		case "Thrusday": 
			System.out.println("4");
			break;
			
		case "Friday": 
			System.out.println("6");
			break;	
		default:	System.out.println("Invalid");
			
		}
		
		
	}

}
