package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.RegisterPage1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

WebDriver driver;
	

	@BeforeMethod
	public void lunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours");
		
	}
	
	
	@Test
    public  void registrationMethod() throws InterruptedException {
		
		RegisterPage1 register = new RegisterPage1(driver);
		Thread.sleep(1000);
		
		register.registerMethod();
		register.firstNameMethod("Niki1");
		register.lastNameMethod("fhs");
		register.phoneMethod("28342383");
		register.emailIDMethod("test1@gmail.com");
		register.addressMethod("jsdjshdj,hhsdh");
		register.cityMethod("mumbai");
		register.stateMethod("Hydrabad");
		register.PostalCodeMethod("2463427");
		register.dropDownMethod(5);
		register.userNameMethod("test1@gmail.com");
		register.passwordMethod("test");
		register.CpasswordMethod("test");
		register.submitMethod();
	    
		
		if (driver.getCurrentUrl().contentEquals("https://demo.guru99.com/test/newtours/register_sucess.php")) {
			System.out.println("Registration is sucessful");
		}else {
			System.out.println("Registration is Failed");
		}
	}
	
	@AfterMethod
	public void closeMethod() {
		//driver.close();
	}
	
}
