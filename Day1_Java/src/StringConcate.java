
public class StringConcate {

	public static void main(String[] args) {
	
		
		
		String Str1 = "Abhijeet";
		String str2= "Nikita";
		String str3= "same";
		
		//Concate the strings
		
		//Method 1
		String conString=Str1.concat(str2).concat(str3);
		System.out.println(conString);
		
		
		//method 
		
		String s1= Str1.concat(str2);
		String s2 = s1.concat(str3);
		System.out.println(s2);
		
		
		//shrome string value seperated 
		
		String Str4 = "Java,Jenkins,Maven,git";
		
		
		String[] s5= Str4.split(",");
		for(String s:s5) {
			System.out.println(s);
		}

	}

}
