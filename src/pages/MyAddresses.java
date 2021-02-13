package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.MyAccount;

public class MyAddresses {

	WebDriver driver;
	WebElement updateAddressButton;
	WebElement addNewAddressButton;
	WebElement removeAddressesButton;
	WebElement FirstNameInputField;
	WebElement LastNameInputField;
	WebElement CompanyInputField;
	WebElement AddressInputField;
	WebElement AddressLine2InputField;
	WebElement CityInputField;
	WebElement StateMenu;
	WebElement ZipCodeInputField;
	WebElement HomePhoneInputField;
	WebElement MobilePhoneInputField;
	WebElement AdditionalInfoInputField;
	WebElement AssignTitleInputField;
	WebElement SaveButton;
	WebElement newFirstName;
	WebElement newLastName;
	WebElement newAddress;
	WebElement newCity;
	WebElement newState;
	WebElement newZipCode;
	WebElement newHomePhone;
	WebElement newAssignTitle;
	WebElement updateFirstName;
	WebElement updateLastName;
	WebElement updateAddress;
	WebElement updateCity;
	WebElement updateState;
	WebElement updateZipCode;
	WebElement updateMobilePhone;
	WebElement updateAssignTitle;
	WebElement assignTitleLabel;
	WebElement assignTitleLabelNew;
	WebElement newUpdateButton;
	WebElement newTitleLabel;
	WebElement newDelete;
	WebElement assignTitleLabelUpdate;
	WebElement addressBox;
	
	public MyAddresses(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getAddressBox() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul"));
	}
	public WebElement getNewDelete() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[9]/a[2]/span"));
	}
	public WebElement getNewTitleLabel() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[1]/h3"));
	}
	public WebElement getNewUpdateButton() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/div/div[2]/ul/li[9]/a[1]"));
	}
	public WebElement getAssignTitleLabelUpdate() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/div/div[2]/ul/li[1]/h3"));
	}
	public WebElement getAssignTitleLabelNew() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/div/div[2]/ul/li[1]/h3"));
	}

	public WebElement getupdateAddressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span"));
	}

	public WebElement getaddNewAddressButton() {
		return driver.findElement(By.xpath("//a[@title=\"Add an address\"]"));
	}

	public WebElement getRemoveAddressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]/span"));
	}

	public WebElement getFirstNameInputField() {
		return driver.findElement(By.id("firstname"));
	}

	public WebElement getLastNameInputField() {
		return driver.findElement(By.id("lastname"));
	}

	public WebElement getCompanyInputField() {
		return driver.findElement(By.id("company"));
	}

	public WebElement getAddressInputField() {
		return driver.findElement(By.id("address1"));
	}

	public WebElement getAddressLine2InputField() {
		return driver.findElement(By.id("address2"));
	}

	public WebElement getCityInputField() {
		return driver.findElement(By.id("city"));
	}

	public WebElement getStateMenu() {
		return driver.findElement(By.id("id_state"));
	}

	public WebElement getStateNJ() {
		return driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[32]"));
	}

	public WebElement getZipCodeInputField() {
		return driver.findElement(By.id("postcode"));
	}

	public WebElement getHomePhoneInputField() {
		return driver.findElement(By.id("phone"));
	}

	public WebElement getMobilePhoneInputField() {
		return driver.findElement(By.id("phone_mobile"));
	}

	public WebElement getAdditionalInfoInputField() {
		return driver.findElement(By.id("other"));
	}

	public WebElement getAssignTitleInputField() {
		return driver.findElement(By.id("alias"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitAddress"));
	}

	public void getNewAddress(String newAddress) {
		this.getAddressInputField().clear();
		this.getAddressInputField().sendKeys(newAddress);
	}

	public void getNewFirstName(String newFirstName) {
		this.getFirstNameInputField().clear();
		this.getFirstNameInputField().sendKeys(newFirstName);
	}

	public void getNewLastName(String newLastName) {
		this.getLastNameInputField().clear();
		this.getLastNameInputField().sendKeys(newLastName);
	}

	public void getNewCity(String newCity) {
		this.getCityInputField().clear();
		this.getCityInputField().sendKeys(newCity);
	}

	public void getNewState(String newState) {
		this.getStateMenu().sendKeys(newState);
	}

	public void getNewZipCode(String newZipCode) {
		this.getZipCodeInputField().clear();
		this.getZipCodeInputField().sendKeys(newZipCode);
	}

	public void getNewHomePhone(String newHomePhone) {
		this.getHomePhoneInputField().clear();
		this.getHomePhoneInputField().sendKeys(newHomePhone);
	}
	public void getNewAssignTitle(String newAssignTitle) {
		this.getAssignTitleInputField().clear();
		this.getAssignTitleInputField().sendKeys(newAssignTitle);
	}
	public void getUpdateFirstName(String updateFirstName) {
		this.getFirstNameInputField().clear();
		this.getFirstNameInputField().sendKeys(updateFirstName);
	}

	public void getUpdateLastName(String updateLastName) {
		this.getLastNameInputField().clear();
		this.getLastNameInputField().sendKeys(updateLastName);
	}

	public void getUpdateAddress(String updateAddress) {
		this.getAddressInputField().clear();
		this.getAddressInputField().sendKeys(updateAddress);
	}

	public void getUpdateCity(String updateCity) {
		this.getCityInputField().clear();
		this.getCityInputField().sendKeys(updateCity);
	}

	public void getUpdateState(String updateState) {
		this.getStateMenu().sendKeys(updateState);
	}

	public void getUpdateZipCode(String updateZipCode) {
		this.getZipCodeInputField().clear();
		this.getZipCodeInputField().sendKeys(updateZipCode);
	}

	public void getUpdateMobilePhone(String updateMobilePhone) {
		this.getMobilePhoneInputField().clear();
		this.getMobilePhoneInputField().sendKeys(updateMobilePhone);
	}

	public void getUpdateAssignTitle(String updateAssignTitle) {
		this.getAssignTitleInputField().clear();
		this.getAssignTitleInputField().sendKeys(updateAssignTitle);
	}

	
}
