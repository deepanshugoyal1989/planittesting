package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestUtility;

public class Feedback extends BasePage{
	
	@FindBy(xpath="//a[contains(@href,'contact')]")
	WebElement contact;
	
	@FindBy(xpath="//input[@id='forename']")
	WebElement forename;
	
	@FindBy(xpath="//input[@id='surname']")
	WebElement surname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='telephone']")
	WebElement telephone;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement message;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	WebElement successAlertMessage;

	@FindBy(xpath="//a[text()='Submit']")
	WebElement submit;
	
	
	public Feedback(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnContactLink() {
		contact.click();
	}
	
	public void setForename() {
		forename.sendKeys("Deepanshu");
	
	}
	
	public void setSurname() {
		surname.sendKeys("Goyal");
	}
	
	public void setEmail() {
		email.sendKeys("deepanshugoyal1989@gmail.com");
	}
	
	public void setTelephone() {
		telephone.sendKeys("07466283817");
	}
	
	public void setMessage() {
		message.sendKeys("Good website");
	}
	
	public String getSuccessAlertMessage() {
		return successAlertMessage.getText();
	}
	
	public void clickOnSubmit() {
		submit.click();	
	}
	
	public void fillFeedback() {
		clickOnContactLink();
		setForename();
		setSurname();
		setEmail();
		setTelephone();
		setMessage();
		clickOnSubmit();
	}
	
	public void waitForSuccessMessage() {
		TestUtility.waitForElement(successAlertMessage);
	}
	
}
