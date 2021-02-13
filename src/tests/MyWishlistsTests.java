package tests;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyWishlistsTests extends TestBase {

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(2000);

	}

	@Test(priority = 0)
	public void addNewWishlist() throws InterruptedException {

		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		String Name = excelReader.getData("MyWishlist", 5, 5);
		String assignTitleText = excelReader.getData("MyWishlist", 6, 6);

		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		myWishlists.getmyWishlists().click();
		Thread.sleep(2000);
		myWishlists.getNameInputField(Name);
		myWishlists.getSaveButton().click();
		Thread.sleep(2000);
		Assert.assertEquals(myWishlists.getWishlist().isDisplayed(), true);
	}

	@Test(priority = 5)
	public void addMultipleWishlist() throws InterruptedException {

		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		String Name1 = excelReader.getData("MyWishlist", 11, 5);
		String Name2 = excelReader.getData("MyWishlist", 12, 5);
		String Name3 = excelReader.getData("MyWishlist", 13, 5);
		String assignTitleText = excelReader.getData("MyWishlist", 14, 6);

		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		myWishlists.getmyWishlists().click();
		Thread.sleep(2000);
		myWishlists.getMultipleName1(Name1);
		myWishlists.getSaveButton().click();
		Thread.sleep(2000);
		myWishlists.getMultipleName2(Name2);
		myWishlists.getSaveButton().click();
		Thread.sleep(2000);
		myWishlists.getMultipleName3(Name3);
		myWishlists.getSaveButton().click();
		Thread.sleep(2000);
		Assert.assertEquals(myWishlists.getWishlistTable().isDisplayed(), true);
	}

	@Test(priority = 10)
	public void deleteMultipleWishlist() throws InterruptedException {

		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		myWishlists.getmyWishlists().click();
		Thread.sleep(2000);

		List<WebElement> deleteWishlist = myWishlists.getWishlistDeleteButton();
		for (int i = 0; i < deleteWishlist.size(); i++) {
			deleteWishlist.get(i).click();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			Thread.sleep(7000);
		}

		Assert.assertEquals(myWishlists.isElementPresent(), false);
	}

	@AfterMethod
	public void afterTest() throws InterruptedException {

		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
