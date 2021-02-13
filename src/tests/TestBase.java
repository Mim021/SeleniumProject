package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.Cart;
import pages.Homepage;
import pages.MyAccount;
import pages.MyAddresses;
import pages.MyPersonalInfo;
import pages.MyWishlists;
import pages.SignInPage;

public class TestBase {

	WebDriver driver;
	Homepage homepage;
	SignInPage signInPage;
	ExcelReader excelReader;
	MyAddresses myAddresses;
	LogInTests logInTests;
	MyAccount myAccount;
	MyPersonalInfo myPersonalInfo;
	MyWishlists myWishlists;
	Cart cart;

	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		this.homepage = new Homepage(driver);
		this.signInPage = new SignInPage(driver);
		excelReader = new ExcelReader("data/testPlan.xlsx");
		this.myAddresses = new MyAddresses(driver);
		this.myAccount = new MyAccount(driver); 
		this.myPersonalInfo = new MyPersonalInfo(driver);
		this.myWishlists = new MyWishlists(driver);
		this.cart = new Cart(driver);
		
		
	}
		

	@AfterClass
	public void posleKlase() {
		driver.close();

	}

}
