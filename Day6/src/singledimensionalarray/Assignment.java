package singledimensionalarray;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
/*		
		
		//sum of array elements
		
		
		int a[]= {10, 20,30,40};
		int sum=0;
		for (int i=0;i<a.length;i++) {
			
			sum=sum +a[i];
			
		}
		System.out.println("Sum of element :"+sum);
	}

	
	*/
	    // number even no and odd no in array
	
	
	int X[]= {1,2,3,4,5,6};
	int evenCount=0;
	int oddCount=0;
	  for (int s:X) {
		  System.out.println(s);
		  if (s%2==0) {
			  evenCount++;
		  }else {
			  oddCount++;
		  }
	  }
	System.out.println("evenCount :"+evenCount);
	
	System.out.println("OddCount :"+oddCount);
	}
}
	
	

