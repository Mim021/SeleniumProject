package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends TestBase{

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(2000);
	}


	@Test(priority = 0)
	public void logInValidCredentials() throws InterruptedException {

		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		String signOutText = excelReader.getData("LogIn", 6, 6);

		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(2000);

		String textForAssert = signInPage.getSignOutLabel().getText();
		Assert.assertEquals(textForAssert, signOutText);
	}

//	@Test(priority = 5)
//	public void logInWrongEmail() throws InterruptedException {
//
//		String email = excelReader.getData("LogIn", 10, 5);
//		String password = excelReader.getData("LogIn", 5, 5);
//		String errorEmailLabelText = excelReader.getData("LogIn", 12, 6);
//
//		homepage.navigateToSignInTab();
//		Thread.sleep(2000);
//		signInPage.signIn(email, password);
//		Thread.sleep(2000);
//		signInPage.getSignInButton().click();
//
//		Thread.sleep(2000);
//
//		String textForAssert = signInPage.getErrorEmailLabel().getText();
//		Assert.assertEquals(textForAssert, errorEmailLabelText);
//	}
//
//	@Test(priority = 10)
//	public void logInWrongPass() throws InterruptedException {
//
//		String email = excelReader.getData("LogIn", 4, 5);
//		String password = excelReader.getData("LogIn", 11, 5);
//		String errorPassLabelText = excelReader.getData("LogIn", 12, 8);
//
//		homepage.navigateToSignInTab();
//		Thread.sleep(2000);
//		signInPage.signIn(email, password);
//		Thread.sleep(2000);
//		signInPage.getSignInButton().click();
//
//		Thread.sleep(2000);
//
//		String textForAssert = signInPage.getErrorPassLabel().getText();
//		Assert.assertEquals(textForAssert, errorPassLabelText);
//	}
//
//	@Test(priority = 15)
//	public void logInNoCredentials() throws InterruptedException {
//
//
//		String errorNoCredentialsLabelText = excelReader.getData("LogIn", 12, 7);
//
//		homepage.navigateToSignInTab();
//		Thread.sleep(2000);
//		signInPage.getEmailInputField().clear();
//		signInPage.getPasswordInputField().clear();
//		signInPage.getSignInButton().click();
//
//		Thread.sleep(2000);
//
//		String textForAssert = signInPage.getErrorNoCredentialsLabel().getText();
//		Assert.assertEquals(textForAssert, errorNoCredentialsLabelText);
//	}
//
//	@Test(priority = 20)
//	public void logOut() throws InterruptedException {
//
//		String signInButtonText = excelReader.getData("LogIn", 25, 6);
//
//		logInValidCredentials();
//		signInPage.signOutLabelClick();
//		Thread.sleep(2000);
//		String textForAssert = signInPage.getSignInButton().getText();
//		Assert.assertEquals(textForAssert, signInButtonText);
//	}
//	@AfterMethod
//	public void afterTest() throws InterruptedException {
//
//		driver.manage().deleteAllCookies();
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//	}

}