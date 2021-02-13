package tests;


import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyPersonalInfoTests extends TestBase{

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 0)
	public void editPersonalInfo() throws InterruptedException {
		
		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		String newFirstName = excelReader.getData("MyPersonalInfo", 6, 5);
		String newLastName = excelReader.getData("MyPersonalInfo", 7, 5);
		String newEmail = excelReader.getData("MyPersonalInfo", 8, 5);
		String newDay = excelReader.getData("MyPersonalInfo", 9, 5);
		String newMonth = excelReader.getData("MyPersonalInfo", 10, 5);
		String newYear = excelReader.getData("MyPersonalInfo", 11, 5);
		String currentPass = excelReader.getData("MyPersonalInfo", 12, 5);
		String newPass = excelReader.getData("MyPersonalInfo", 13, 5);
		String confirmation = excelReader.getData("MyPersonalInfo", 14, 5);
		String assignTitleText = excelReader.getData("MyPersonalInfo", 15, 7);
		
		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		myAccount.getmyPersonalInfoButton().click();
		Thread.sleep(2000);
		myPersonalInfo.getgenderMcheck().click();
		myPersonalInfo.getFirstNameInputField(newFirstName);
		myPersonalInfo.getLastNameInputField(newLastName);
		myPersonalInfo.getDate(newDay, newMonth, newYear);
		myPersonalInfo.getPassword(currentPass, newPass, confirmation);
		myPersonalInfo.getNewsletter().click();
		myPersonalInfo.getSpecialOffers().click(); 
		Thread.sleep(2000);
		myPersonalInfo.getSaveButton().click();
		Thread.sleep(3000);
		
		String textForAssert = myPersonalInfo.getUpdateLabel().getText();
		Assert.assertEquals(textForAssert, assignTitleText);
		}
		
	@Test(priority = 5)
	public void returnOldPersonalInfo() throws InterruptedException {
		
		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("MyPersonalInfo", 13, 9);
		String newFirstName = excelReader.getData("MyPersonalInfo", 6, 6);
		String newLastName = excelReader.getData("MyPersonalInfo", 7, 6);
		String newEmail = excelReader.getData("MyPersonalInfo", 8, 6);
		String newDay = excelReader.getData("MyPersonalInfo", 9, 6);
		String newMonth = excelReader.getData("MyPersonalInfo", 10, 6);
		String newYear = excelReader.getData("MyPersonalInfo", 11, 6);
		String currentPass = excelReader.getData("MyPersonalInfo", 12, 6);
		String newPass = excelReader.getData("MyPersonalInfo", 13, 6);
		String confirmation = excelReader.getData("MyPersonalInfo", 14, 6);
		String assignTitleText = excelReader.getData("MyPersonalInfo", 15, 7);
		
		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		myAccount.getmyPersonalInfoButton().click();
		Thread.sleep(2000);
		myPersonalInfo.genderFcheck().click();
		myPersonalInfo.getFirstNameInputField(newFirstName);
		myPersonalInfo.getLastNameInputField(newLastName);
		myPersonalInfo.getDate(newDay, newMonth, newYear);
		myPersonalInfo.getPassword(currentPass, newPass, confirmation);
		myPersonalInfo.getNewsletter().click();
		myPersonalInfo.getSpecialOffers().click(); 
		Thread.sleep(2000);
		myPersonalInfo.getSaveButton().click();
		Thread.sleep(3000);
		
		String textForAssert = myPersonalInfo.getUpdateLabel().getText();
		Assert.assertEquals(textForAssert, assignTitleText);
		}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {

		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
