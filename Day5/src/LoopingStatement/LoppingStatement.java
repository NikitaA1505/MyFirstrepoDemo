package LoopingStatement;

public class LoppingStatement {

	public static void main(String[] args) {
	
		//while loop- requires three component 3 initialization, condition and inc/dec
		//program for writen 1 to 10
		
		int i= 1;
		while(i<=10) {
			
			System.out.println(i);
			i++;
		}
		
		
		 //program to write even and odd number from 1 to 10 and its count
		
		int j=1;
		int evenCount=0;
		int oddCount=0;
		while (j<=10) {
			
		    if(j%2==0) { 
		    	
				System.out.println(j +"Even");
				evenCount++;
		    }else {
		    	
				System.out.println(j+"Odd");
			    oddCount++;
		    }
		    j++;
		    
	    }
		System.out.println("No of Even digit: "+evenCount);
		System.out.println("No of odd digit: "+oddCount);
		
		
		
		
		
		
		
		// Reverse the number 
		
	/*	
		int p =123345;
		
		int rev=0;
		while (p>0) {
			
			rev=p%10;                          //firstly apply module to get remainder --3 
			System.out.print(rev);
			p=p/10;                            // get the division for number
		}
		
		*/
		
		
		//palindrome number
		 
		
		
		
		

	}
	
}
