import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass   {

	public static void main(String[] args) {
		
         
           
          WebDriver driver;
       //    System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
           
		   WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
           driver.get("https://demo.guru99.com/test/newtours/");
           
           
           
          /*  method 1 of POM
           loginPOM l1 = new loginPOM (driver);
           l1.registerLinkMethod();
           l1.firstNameMethod("Nikita");
           l1.lastNameMethod("Ghkkk");
           l1.emailIDMethod("test@gmail.com");  */
           
           
           
           //method 2 in POM
           loginPOM2 l2 = new loginPOM2(driver);
           
          l2.registerMethod();
          l2.FirstNameMethod("Niki");
          l2.LastNameMethod("GH");
          l2.EmailIdMethod("test@gmail.com");
          
           
		
	
		
		
	}

}
