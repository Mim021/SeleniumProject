package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import tests.TestBase;

public class Cart extends TestBase {

	WebDriver driver;
	WebElement women;
	WebElement blouseAddToCart;
	WebElement addedToCartText;
	WebElement addSameProductPlus;
	WebElement proceedToCart;
	WebElement continueShopping;
	WebElement dressAdd;
	WebElement myCart;
	
	public Cart(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getCartIcon() {
		return driver.findElement(By.xpath("//a[@title='View my shopping cart']\"")); 
	}
	public WebElement getMyCartTable() {
		return driver.findElement(By.id("cart_summary")); 
	}
	public WebElement getDressImg() {
		return driver.findElement(By.xpath("//*[@id=\"product_3_13_0_446829\"]/td[2]/p/a")); 
	}
	public WebElement getDressPrice() {
		return driver.findElement(By.id("total_product_price_3_13_446829")); 
	}
	public WebElement getTshirtPrice() {
		return driver.findElement(By.id("total_product_price_1_1_446829")); 
	}
	public WebElement getTshirtImg() {
		return driver.findElement(By.xpath("//*[@id=\"product_1_1_0_446829\"]/td[1]/a/img")); 
	}
	public WebElement getDressAdd() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]/span")); 
	}
	public WebElement getContinueShopping() {
		return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")); 
	}
	public WebElement getPriceBlouse() {
		return driver.findElement(By.id("product_price_2_7_446829")); 
	}
	public WebElement getPriceBlousex3() {
		return driver.findElement(By.id("summary_products_quantity")); 
	}
	public WebElement getTshirtAdd() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")); 
	}
	public WebElement getBlouseImg() {
		return driver.findElement(By.xpath("//*[@id=\"product_2_7_0_446829\"]/td[1]/a/img")); 
	}
	public WebElement getproceedToCart() {
		return driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")); 
	}
	public WebElement getaddSameProductPlus() {
		return driver.findElement(By.id("cart_quantity_up_2_7_0_446829")); 
	}
	public WebElement getWomen() {
		return driver.findElement(By.xpath("//a[@title='Women']")); 
	}
	public WebElement getBlouseAddToCart() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span"));
	}
	public WebElement getAddedToCartText() {
		return driver.findElement(By.xpath("//i[@class='Product successfully added to your shopping cart']"));
	}
	public void AddFirstProduct(WebElement ele1) {
		this.getBlouseAddToCart().click();
		this.getContinueShopping().click();
		
	}
	public void AddSecondProduct(WebElement ele2) {
		this.getTshirtAdd().click();
		this.getContinueShopping().click();
		
	}
	public void AddThirdProduct(WebElement ele3) {
		this.getDressAdd().click();
		this.getproceedToCart().click();
		
	}
	public List<WebElement> getProductDeleteButton() {
		return driver.findElements(By.className("icon-trash"));
	}
	public boolean isElementPresent() {
		try {
			getMyCartTable();
			return true;
		} catch (Exception e) {
			return false;
		}
}
}