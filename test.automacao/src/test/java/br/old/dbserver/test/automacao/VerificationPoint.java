package br.old.dbserver.test.automacao;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class VerificationPoint {
	
	private WebDriver driver;
	
	private AppObjects appObject;
	
	public VerificationPoint(WebDriver driver) {
		this.appObject = new AppObjects(driver);
		this.driver = driver;
	}
    
    public void verifyCheckoutBuying() {
    	boolean isThisTrue = appObject.getSourcePageElement().contains("Your order on My Store is complete.");
    	assertTrue(isThisTrue);
    }
}
