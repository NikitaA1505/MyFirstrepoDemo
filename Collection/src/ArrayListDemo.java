import java.util.ArrayList;

//Duplicates are allowed
//indexing is allowed
//Hterogenious data is allowed
//null is allowed

public class ArrayListDemo {

	public static void main(String[] args) {
		
	
		ArrayList myList = new ArrayList();    // Heteroginous data is allowed
		
		myList.add(100);
		myList.add("Nikita");
		myList.add(10.5);
		myList.add('H');
		
		System.out.println(myList);          //myList 
		
		System.out.println("Size"+myList.size());
		
		System.out.println(myList.get(0));
		
		
		myList.remove(3);
	    System.out.println(myList);
	    
	    
	    myList.add(3, "Nikita");
	    System.out.println(myList);
	    
	    for (Object x: myList) {
	    	
	    	System.out.println(x);
	    }
		
		myList.clear();
		System.out.println(myList);
		System.out.println("After arrayList is clear");
		
		ArrayList <Integer> list1 = new  ArrayList <Integer>();
		list1.add(110);
		list1.add(200);
		list1.add(300);
		
		
		System.out.println(list1);

	}

}
