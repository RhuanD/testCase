package br.old.dbserver.test.automacao;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testeCase {
	
	private static WebDriver driver;

	Tasks task = new Tasks(driver);
	VerificationPoint verify = new VerificationPoint(driver);
	AppObjects appObject = new AppObjects(driver);
	
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
    	task.inputEntryEmail("agoravai1@mail.com");
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
