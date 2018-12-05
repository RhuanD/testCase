package br.old.dbserver.test.automacao;

import java.nio.charset.Charset;
import java.util.Random;

import org.openqa.selenium.WebDriver;

public class Tasks {
	
	private WebDriver driver;
	
	private AppObjects appObjects;
	
	public Tasks(WebDriver driver) {
		this.appObjects = new AppObjects(driver);
		this.driver = driver;
	}
	
	public void clickFirstImage() {
		appObjects.getFirstImageByXPath().click();
	}
	
	public void addToCart() {
		appObjects.getAddToCart().click();
	}
	
	public void proceedToCheckout() {
		appObjects.getProceedToCheckoutByLinkText().click();
	}
	
	public void inputEntryEmail(String email) {
		appObjects.getInputEmailById().sendKeys(email);
	}
	
	public void submitEntryEmail() {
		appObjects.getInputEmailById().submit();
	}
	
	public void clickAddressProceedButton() {
		appObjects.getButtonAddressProceedByName().click();
	}
	
	public void clickCheckboxCarrier() {
		appObjects.getCheckboxCarrierById().click();
	}
	
	public void clickCarrierProceedButton() {
		appObjects.getButtonCarrierProceedByName().click();
	}
	
	public void clickPaymentButton() {
		appObjects.getButtonPaymentProceedByClass().click();
	}
	
	public void clickCheckoutBuyings() {
		appObjects.getButtonCartNavigationProceedByXPath().click();
	}
	
	public void generateCreation(String firstName, String lastName, String password, int day, int month, String year, String address, String state, String city, String postcode, String phoneNumber) {
		appObjects.getRadioTypeButtonById().click();
		appObjects.getInputCustomerFirstNameById().sendKeys(firstName);
		appObjects.getInputCustomerLastNameById().sendKeys(lastName);
		appObjects.getInputPasswordById().sendKeys(password);
		appObjects.getSelectDaysById().selectByIndex(day);
		appObjects.getSelectMonthById().selectByIndex(month);
		appObjects.getSelectYearById().selectByValue(year);
		appObjects.getInputAddressById().sendKeys(address);
		appObjects.getSelectStateById().selectByVisibleText(state);
		appObjects.getInputCityById().sendKeys(city);
		appObjects.getInputPostCodeById().sendKeys(postcode);
		appObjects.getInputMobilePhoneById().sendKeys(phoneNumber);
		appObjects.getButtonAccountProceedById().click();
	}
}
