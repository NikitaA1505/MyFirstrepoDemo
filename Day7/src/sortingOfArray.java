import java.util.Arrays;
import java.util.Scanner;

public class sortingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in) ;
		//array defining
		
       int a[]= new int [5];
        for (int i=0; i<a.length;i++) {
		System.out.println("Enter the number ");
		a[i] = sc.nextInt();
	  
        }
		
	//	int a[]= {10,33,12,343,88,99};
		
	 System.out.println(Arrays.toString(a));
	 
	 //to sort element with predefind method
	 
	  Arrays.sort(a);
	 
	System.out.println("Sorted array"+Arrays.toString(a));
		
		
		
	}

}
