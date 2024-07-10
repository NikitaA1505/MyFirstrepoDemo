package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class RegisterPage1 {

	
	WebDriver driver;
	
	@FindBy (how=How.XPATH,using="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement RegisterLink ;
	
	@FindBy (how=How.NAME , using="firstName")
	WebElement firstName;
	
	@FindBy(how=How.NAME, using="lastName")
	WebElement LastName;
	
	@FindBy(how= How.NAME,using ="phone")
	WebElement phone;
	
	
    @FindBy(how =How.ID,using ="username")
	WebElement emailId;
	
	@FindBy(how=How.NAME ,using="address1")                           // Secondly right this
	WebElement Add;                                                  //always right this first
	
	
	@FindBy(how=How.NAME, using ="city")
	WebElement city1;
	
	@FindBy (how=How.NAME, using="state")
	WebElement state;
	
	@FindBy(how= How.NAME, using ="postalCode")
	WebElement PostalCode ;
	
   
	@FindBy(how = How.NAME, using="country")
	WebElement Dropdown ;
	
	
	
	
	@FindBy(how =How.ID, using ="email")
	WebElement userName;
	
	@FindBy(how =How.NAME, using ="password")
	WebElement Password;
	
	@FindBy(how =How.NAME, using ="confirmPassword")
	WebElement CPass;
	
	@FindBy(how=How.NAME, using ="submit")
	WebElement submit;
	
	public RegisterPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void registerMethod() {
		RegisterLink.click();
	}
	
	public void firstNameMethod(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void lastNameMethod(String Lname) {
		LastName.sendKeys(Lname);
	}
	
	public  void phoneMethod(String phoneNo) {
		phone.sendKeys(phoneNo);
	}
	
	public void emailIDMethod(String emailID1) {
		emailId.sendKeys(emailID1);
	}
	
	public void addressMethod(String address) {
		Add.sendKeys(address);
	}
	
	public void cityMethod(String city) {
		city1.sendKeys(city);
	}
	
	public void stateMethod(String state1) {
		state.sendKeys(state1);
	}
	
	public void PostalCodeMethod(String postalcode1) {
		PostalCode.sendKeys(postalcode1);
	}
	
	
	public void dropDownMethod(int drop1){
		Select S = new Select(Dropdown);
		int Size =S.getOptions().size();
		System.out.println("No of dropdown option :"+ Size);
        S.selectByIndex(drop1);
	}
	
	public void userNameMethod(String user) {
		userName.sendKeys(user);
	}
	
	public void passwordMethod(String pass) {
		Password.sendKeys(pass);
	}
	
	public void CpasswordMethod(String Cpass1) {
		CPass.sendKeys(Cpass1);
	}
	
	public void submitMethod() {
		submit.click();
	}
	
	
}
