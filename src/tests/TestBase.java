package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.Homepage;
import pages.SignInPage;

public class TestBase {

	WebDriver driver;
	Homepage homepage;
	SignInPage signInPage;
	ExcelReader excelReader;

	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		this.driver = new ChromeDriver();
		this.homepage = new Homepage(driver);
		this.signInPage = new SignInPage(driver);
		excelReader = new ExcelReader("data/testPlan.xlsx");
		
		driver.manage().window().maximize();
	}

	@AfterClass
	public void posleKlase() {
		driver.close();

	}

}
