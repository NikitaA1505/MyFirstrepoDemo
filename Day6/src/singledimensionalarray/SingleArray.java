package singledimensionalarray;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int a[]= new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		 
		//second approach 
		
		//int a[]= {100,200,300,400};
		
		System.out.println(a[4]);
		
		//read values of array using normal for loop
		
	
	 	for(int i=0; i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
	
		 
       //read all the value of array using advance for loop
		
		for(int s:a) {
			System.out.println(s);
		}
		
		
		
	
		
		// Two dimensional array
		
		//first approach
		int arr [][]= new int[2][2];
		arr[0][0]=100;
		arr[0][1]=200;
		arr[1][0]=300;
		arr[1][1]=400;
		
		//second approach
	//	 int arr1[][]= {{100, 200},{300 ,400}};
		
		
		//using normal for loop
		
		for (int p=0; p<=arr.length-1;p++) {
			
			for(int j=0;j<=arr[p].length-1;j++) {
				System.out.println("Two dimensional array :" +arr[p][j]);
			}
			
		}
		
		
		//advance for loop
		
		
		for(int s[]: arr) {
			
			for (int z:s) {
				System.out.println(z);
			}                                
			
		}    
		
		
	}

}
