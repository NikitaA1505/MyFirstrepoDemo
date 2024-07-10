import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap h2 = new HashMap();
		
		h2.put(101, "Nikita");
		h2.put(102, "Ankita");
		h2.put(103 , "Aish");
		
		
		System.out.println(h2.isEmpty());
		
		System.out.println(h2);
		
		System.out.println(h2.keySet());
		
		System.out.println(h2.get(103));
		
		System.out.println(h2.remove(101));
		
		for (Object value: h2.keySet()){
			System.out.println(h2.get(value));          //we store the value keyse in value varaible the calling get method with key value
		}
		

	}

}
