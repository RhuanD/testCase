package br.old.dbserver.test.automacao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppObjects {
	
	private WebDriver driver;
	
	public AppObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitFiveSeconds() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public WebElement getFirstImageByXPath() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img"));//.click()
	}
	
	public WebElement getAddToCart() {
		return driver.findElement(By.id("add_to_cart"));//.click();
	}
	
	public WebElement getProceedToCheckoutByLinkText() {
		return driver.findElement(By.linkText("Proceed to checkout"));//.click();
	}
	
	public WebElement getInputEmailById() {
		return driver.findElement(By.id("email_create"));//.clear(); || .sendKeys(); || .submit();
	}
	
	public WebElement getRadioTypeButtonById() {
		return driver.findElement(By.id("id_gender1"));//.click();
	}
	
	public WebElement getInputCustomerFirstNameById() {
		return driver.findElement(By.id("customer_firstname"));//.sendKeys();
	}
	
	public WebElement getInputCustomerLastNameById() {
		return driver.findElement(By.id("customer_lastname"));//.sendKeys();
	}
	
	public WebElement getInputPasswordById() {
		return driver.findElement(By.id("passwd"));//.sendKeys();
	}
	
	public Select getSelectDaysById() {
		Select select = new Select(driver.findElement(By.id("days")));//.selectByIndex(13)
		return select;
	}
	
	public Select getSelectMonthById() {
		Select select = new Select(driver.findElement(By.id("months")));//.selectByIndex(11)
		return select;
	}
	
	public Select getSelectYearById() {
		Select select = new Select(driver.findElement(By.id("years")));//.selectByValue("1995")
		return select;
	}
	
	public WebElement getInputAddressById() {
		return driver.findElement(By.id("address1"));//.sendKeys();
	}
	
	public Select getSelectStateById() {
		Select select = new Select(driver.findElement(By.id("id_state")));//.selectByVisibleText("Texas");
		return select;
	}
	
	public WebElement getInputCityById() {
		return driver.findElement(By.id("city"));//.sendKeys();
	}
	
	public WebElement getInputPostCodeById() {
		return driver.findElement(By.id("postcode"));//.sendKeys();
	}
	
	public WebElement getInputMobilePhoneById() {
		return driver.findElement(By.id("phone_mobile"));//.sendKeys();
	}
	
	public WebElement getButtonAccountProceedById() {
		return driver.findElement(By.id("submitAccount"));//.click();
	}
	
	public WebElement getButtonAddressProceedByName() {
		return driver.findElement(By.name("processAddress"));//.click();
	}
	
	public WebElement getCheckboxCarrierById() {
		return driver.findElement(By.name("cgv"));//.click();
	}
	
	public WebElement getButtonCarrierProceedByName() {
		return driver.findElement(By.name("processCarrier"));//.click();
	}
	
	public WebElement getButtonPaymentProceedByClass() {
		return driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));//.click();
	}
	
	public WebElement getButtonCartNavigationProceedByXPath() {
		return driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));//.click();
	}
	
	public String getSourcePageElement() {
		return driver.getPageSource();
	}
}
