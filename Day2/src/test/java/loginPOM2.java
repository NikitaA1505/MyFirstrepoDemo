import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPOM2 {

	WebDriver driver;
	
	//Method 2 of POM
	
	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	WebElement registerLink ;
	
	
	@FindBy (how=How.NAME,using="firstName")
	WebElement FirstName;
	
	
	@FindBy (how=How.NAME,using="lastName")
	WebElement LastName;
	
	@FindBy (how=How.ID ,using="userName")
	WebElement EmailID;
	
	
	public loginPOM2 (WebDriver d) {
		driver =d;
		
		PageFactory.initElements(d,this); // additional Step in second method
	}
	
	
	public void registerMethod() {
		registerLink.click();
	}
	
	public void FirstNameMethod(String first) {
		FirstName.sendKeys(first);
	}
	
	public void LastNameMethod(String last) {
		LastName.sendKeys(last);
	}
	
	
	public void EmailIdMethod(String email) {
		EmailID.sendKeys(email);
	}
	
	
}
