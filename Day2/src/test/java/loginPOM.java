import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPOM extends BaseClass {

	//Method 1 of POM
	WebDriver driver;
	
	By RegisterLink = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
	By Fname = By.name("firstName");
	By Lname = By.name("lastName");
 	By Phone =By.name("phone");
	By emailID = By.id("userName");
	
	public loginPOM(WebDriver d) {
		driver=d;
		
	}
	
     
	
	public void registerLinkMethod() {
		driver.findElement(RegisterLink).click();;
	}
	
	
	


	public  void firstNameMethod(String fname) {
		driver.findElement(Fname).sendKeys(fname);
	}
	
	public void lastNameMethod(String lname) {
		driver.findElement(Lname).sendKeys(lname);
	}
	
/*public void phoneMethod() {
		driver.findElement(Phone);
	
	}*/
	
	public void emailIDMethod(String email) {
		driver.findElement(emailID).sendKeys(email);
	}
	
}
