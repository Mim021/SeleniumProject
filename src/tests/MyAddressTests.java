package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MyAddressTests extends TestBase {

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 0)
	public void addNewAddress() throws InterruptedException {

		String newFirstName = excelReader.getData("MyAddress", 6, 6);
		String newLastName = excelReader.getData("MyAddress", 7, 6);
		String newAddress = excelReader.getData("MyAddress", 9, 6);
		String newCity = excelReader.getData("MyAddress", 11, 6);
		String newState = excelReader.getData("MyAddress", 12, 6);
		String newZipCode = excelReader.getData("MyAddress", 13, 6);
		String newHomePhone = excelReader.getData("MyAddress", 14, 6);
		String newAssignTitle = excelReader.getData("MyAddress", 17, 6);
		String assignTitleText = excelReader.getData("MyAddress", 17, 6);
		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		
		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		myAccount.getmyAddressesButton().click();
		myAddresses.getaddNewAddressButton().click();
		Thread.sleep(2000);
		myAddresses.getNewFirstName(newFirstName);
		myAddresses.getNewLastName(newLastName);
		myAddresses.getNewAddress(newAddress);
		myAddresses.getNewCity(newCity);
		myAddresses.getNewState(newState);
		myAddresses.getNewZipCode(newZipCode);
		myAddresses.getNewHomePhone(newHomePhone);
		myAddresses.getNewAssignTitle(newAssignTitle);
		myAddresses.getSaveButton().click();
		Thread.sleep(2000);
		String textForAssert = myAddresses.getAssignTitleLabelNew().getText();
		AssertJUnit.assertEquals(textForAssert, assignTitleText);
		}
		
		
		@Test(priority = 5)
		public void updateAddress() throws InterruptedException {
			
			String updateFirstName = excelReader.getData("MyAddress", 6, 5);
			String updateLastName = excelReader.getData("MyAddress", 7, 5);
			String updateAddress = excelReader.getData("MyAddress", 9, 5);
			String updateCity = excelReader.getData("MyAddress", 11, 5);
			String updateState = excelReader.getData("MyAddress", 12, 5);
			String updateZipCode = excelReader.getData("MyAddress", 13, 5);
			String updateMobilePhone = excelReader.getData("MyAddress", 15, 5);
			String updateAssignTitle = excelReader.getData("MyAddress", 17, 5);
			
			String email = excelReader.getData("LogIn", 4, 5);
			String password = excelReader.getData("LogIn", 5, 5);
			
			homepage.navigateToSignInTab();
			Thread.sleep(2000);
			signInPage.signIn(email, password);
			signInPage.signInButtonClick();
			Thread.sleep(3000);
			myAccount.getmyAddressesButton().click();
			myAddresses.getNewUpdateButton().click();
			Thread.sleep(2000);
			myAddresses.getUpdateFirstName(updateFirstName);
			myAddresses.getUpdateLastName(updateLastName);
			myAddresses.getUpdateAddress(updateAddress);
			myAddresses.getUpdateCity(updateCity);
			myAddresses.getUpdateState(updateState);
			myAddresses.getUpdateZipCode(updateZipCode);
			myAddresses.getUpdateMobilePhone(updateMobilePhone);
			myAddresses.getUpdateAssignTitle(updateAssignTitle);
			
			myAddresses.getSaveButton().click();
			
			String textForAssert = myAddresses.getAssignTitleLabelUpdate().getText();
			AssertJUnit.assertEquals(textForAssert, updateAssignTitle);
			
		}
//			Object[] oldAddress =  new Object[8];
//			
//			for(int i = 0; i<8; i++) {
//				oldAddress[i] = excelReader.getData("MyAddress", i+6, 6);
//			}
//			Object[] newAddress =  new Object[8];
//			
//			for(int i = 0; i<8; i++) {
//				newAddress[i] = excelReader.getData("MyAddress", i+6, 5);
//			}
//			for(int i = 0; i<8; i++) {
//				Assert.assertEquals(oldAddress[i], newAddress[i]);
//			}
//		
//		    }
//		
		@Test(priority = 10)
		public void returnOldAddress() throws InterruptedException {
			
			String newFirstName = excelReader.getData("MyAddress", 6, 6);
			String newLastName = excelReader.getData("MyAddress", 7, 6);
			String newAddress = excelReader.getData("MyAddress", 9, 6);
			String newCity = excelReader.getData("MyAddress", 11, 6);
			String newState = excelReader.getData("MyAddress", 12, 6);
			String newZipCode = excelReader.getData("MyAddress", 13, 6);
			String newHomePhone = excelReader.getData("MyAddress", 14, 6);
			String newAssignTitle = excelReader.getData("MyAddress", 17, 6);
			String assignTitleText = excelReader.getData("MyAddress", 17, 6);
			String email = excelReader.getData("LogIn", 4, 5);
			String password = excelReader.getData("LogIn", 5, 5);
			
			homepage.navigateToSignInTab();
			Thread.sleep(2000);
			signInPage.signIn(email, password);
			signInPage.signInButtonClick();
			Thread.sleep(3000);
			myAccount.getmyAddressesButton().click();
			myAddresses.getNewUpdateButton().click();
			Thread.sleep(2000);
			myAddresses.getNewFirstName(newFirstName);
			myAddresses.getNewLastName(newLastName);
			myAddresses.getNewAddress(newAddress);
			myAddresses.getNewCity(newCity);
			myAddresses.getNewState(newState);
			myAddresses.getNewZipCode(newZipCode);
			myAddresses.getNewHomePhone(newHomePhone);
			myAddresses.getNewAssignTitle(newAssignTitle);
			
			myAddresses.getSaveButton().click();
			
			String textForAssert = myAddresses.getAssignTitleLabelNew().getText();
			AssertJUnit.assertEquals(textForAssert, assignTitleText);
		}
		
	@Test(priority = 15)
	public void deleteAddress() throws InterruptedException {

	
		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		
		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		myAccount.getmyAddressesButton().click();
		myAddresses.getNewDelete().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	
	
		try {
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[1]/h3"));

		} catch (Exception e) {
			System.out.println("You have deleted the address.");
		}
	}

	@AfterMethod
	public void afterTest() throws InterruptedException {

		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

}

