import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		
		
		HashSet h1 = new HashSet();
		
		h1.add(100);
		h1.add("Nikita");
		h1.add(10.9);
		h1.add('K');
		
		
		System.out.println(h1);
		
		//reading specific data is not possible as there is no indexing
		
		h1.remove("Nikita");
		
		System.out.println(h1);
		
		for (Object x:h1) {
			System.out.println(x);
		}
		
		System.out.println(h1);
		
		h1.add(100);                          //duplicate are not allowed
		
		System.out.println(h1);
		
		System.out.println(h1.size());
		
		

	}
	
	    

}
