
public class SearchElementInrray {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,48,40,58};
		int searchElement =30;
		
		boolean flag =false;
		for (int i =0; i<a.length;i++) {
			
			if(a[i]==searchElement) {
				flag=true;
				System.out.println("Element found");
				break;
			}
			
		}
		
		
		if(flag==false) {
		System.out.println("Element not found");
		}

	}

}
