
public class repetationOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {10,20,30,40,30,40,56};
		int search_Element=30;
		int count =0;
		
		for (int i=0;i<a.length;i++) {
			
			if(search_Element==a[i]) {
			count++;
			}
			
		}
		System.out.println(count);
		
		
	}

}
