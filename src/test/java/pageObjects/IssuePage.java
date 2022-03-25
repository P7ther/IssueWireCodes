package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IssuePage 
{
	public WebDriver driver;
	
	public IssuePage(WebDriver driver) 
	{
	    this.driver=driver;
	}

	By LoginBtn =By.cssSelector("a[title='login']");
	By username =By.xpath("//input[@id='email']");
	By password =By.xpath("//input[@id='password']");
	By submitbtn =By.xpath("//input[@id='submit-btn1']");
	By addcrdit =By.xpath("//div[contains(text(),'Add Credits')]");
	By drpdwn   =By.cssSelector("select[id='multipck_value1']");
	By dropdwn  =By.xpath("//select[@id='multipck_value1']");
	By copun    =By.xpath("//span[@id='span11']");
	
	 public void ClickLoginBtn() 
	 {
		 driver.findElement(LoginBtn).click();
	 }
	 
	 public void LoginDetails(String usname ,String Pwd) 
	 {
		 driver.findElement(username).sendKeys(usname);
		 driver.findElement(password).sendKeys(Pwd);
	 }
	
	 public void SubmitButton() 
	 {
		 driver.findElement(submitbtn).click();
	 }
	
	 public void ClickOnAddCredit() 
	 {
		driver.findElement(addcrdit).click();
		// driver.findElement(Pressrls).click();
	 }
	 
	 public void getPageTitle() 
	 {
		 driver.getTitle().contains("Submit Your Press Release | Press Release Distribution Software");
	 }
	 
	
	 public void SelectDropDwn() 
	 {
		//  driver.findElement(copun).click();
		//  System.out.println("Section is Working");
		  
		// Select Details from Static DropDown That Present in Add Credit.
		  
		   WebElement Staticdropdown = driver.findElement(dropdwn);
		   Select Dropdown = new Select(Staticdropdown);
		   Dropdown.selectByIndex(2);
	 }
	 
}
