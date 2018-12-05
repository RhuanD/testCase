package br.old.dbserver.test.automacao;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Helper.Helpers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testeCase {
	
	private static WebDriver driver;

	Tasks task = new Tasks(driver);
	VerificationPoint verify = new VerificationPoint(driver);
	AppObjects appObject = new AppObjects(driver);
	Helpers helper = new Helpers();
	
    @BeforeClass
    public static void setUpTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("http://www.automationpractice.com");
    }

    @AfterClass
    public static void tearDownTest(){
        driver.quit();
    }
	
	
    @Test
    public void setTest(){
    	task.clickFirstImage();
    	task.addToCart();
    	appObject.waitFiveSeconds();
    	task.proceedToCheckout();
    	task.proceedToCheckout();
    	task.inputEntryEmail(helper.generateRandomEmail());
    	task.submitEntryEmail();
    	task.generateCreation("Rhuan",  
    			"Dornelles", 
    			"aeho123", 
    			13, 
    			11, 
    			"1995", 
    			"Vicente Monteggia, "
    			+ "1072, Cavalhada", 
    			"Texas", 
    			"Porto Alegre", 
    			"75201", 
    			"5551992993131");
    	task.clickAddressProceedButton();
    	task.clickCheckboxCarrier();
    	task.clickCarrierProceedButton();
    	task.clickPaymentButton();
    	task.clickCheckoutBuyings();
    	verify.verifyCheckoutBuying();
    }
}
