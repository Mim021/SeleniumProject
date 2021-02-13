package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends TestBase {

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

	}

	@Test(priority = 0)
	public void addProduct() throws InterruptedException {

		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		String textForAssert2 = excelReader.getData("Cart", 5, 7);

		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		cart.getWomen().click();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele);
		action.moveToElement(ele).build().perform();
		cart.getBlouseAddToCart().click();
		Thread.sleep(5000);
		cart.getproceedToCart().click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;      		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		Assert.assertEquals(cart.getBlouseImg().getText(), true);
		Assert.assertEquals(cart.getPriceBlouse().getText(), textForAssert2);

	}

	@Test(priority = 5)
	public void deleteProductFromCart() throws InterruptedException {

		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);

		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		myAccount.getCartButton().click();
		Thread.sleep(3000);
		List<WebElement> deleteProduct = cart.getProductDeleteButton();
		for (int i = 0; i < deleteProduct.size(); i++) {
			deleteProduct.get(i).click();
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
		}

		Assert.assertEquals(cart.isElementPresent(), false);

	}

	@Test(priority = 10)
	public void add3SameProduct() throws InterruptedException {

		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		String textForAssert2 = excelReader.getData("Cart", 12, 7);
		
		homepage.navigateToSignInTab();
		Thread.sleep(2000);
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		Thread.sleep(3000);
		cart.getWomen().click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a"));
		Actions action = new Actions(driver);
		action.moveToElement(ele);
		action.moveToElement(ele).build().perform();

		Thread.sleep(2000);
		cart.getBlouseAddToCart().click();
		Thread.sleep(2000);
		cart.getproceedToCart().click();
		Thread.sleep(3000);

		for (int i = 1; i < 3; i++) {
			cart.getaddSameProductPlus().click();
			Thread.sleep(3000);
		}
		Thread.sleep(7000);
	
		Assert.assertEquals(cart.getBlouseImg().isDisplayed(), true);
		Assert.assertEquals(cart.getPriceBlousex3().getText(), textForAssert2);
		
	}

	@Test(priority = 15)
	public void add3DifferentProducts() throws InterruptedException {

		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);
		
		homepage.navigateToSignInTab();
		signInPage.signIn(email, password);
		signInPage.signInButtonClick();
		cart.getWomen().click();

		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(ele1);
		action.moveToElement(ele1).build().perform();
		cart.AddFirstProduct(ele1);
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]"));
		action.moveToElement(ele2);
		action.moveToElement(ele2).build().perform();
		cart.AddSecondProduct(ele2);
		WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]"));
		action.moveToElement(ele3);
		action.moveToElement(ele3).build().perform();
		cart.AddThirdProduct(ele3);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;      		
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		Assert.assertEquals(cart.getBlouseImg().isDisplayed(), true);
		Assert.assertEquals(cart.getTshirtImg().isDisplayed(), true);
		Assert.assertEquals(cart.getDressImg().isDisplayed(), true);
	
	}

	@Test(priority = 20)
	public void deleteProductsFromCart() throws InterruptedException {

		String email = excelReader.getData("LogIn", 4, 5);
		String password = excelReader.getData("LogIn", 5, 5);

		add3DifferentProducts();
		
		Thread.sleep(2000);

		List<WebElement> deleteProduct = cart.getProductDeleteButton();
		for (int i = 0; i < deleteProduct.size(); i++) {
			deleteProduct.get(i).click();
		
			Thread.sleep(3000);
		}
		Assert.assertEquals(cart.isElementPresent(), false);
	}

	@AfterMethod
	public void afterTest() throws InterruptedException {

		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}