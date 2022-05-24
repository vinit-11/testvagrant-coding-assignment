package pages.testvagrant;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.testvagrant.TestBase;

public class ImdbPage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'January 7, 2022 (United States)')]")
	WebElement imdbReleaseDetail;
	
	@FindBy(xpath="//div//table//tbody//tr[6]//td[@class='release-date-item__date']")
	WebElement imdbRelease;
	
	@FindBy(xpath="//li//span[contains(text(),'Country of origin')]//parent::li//div//ul//li//a")
	WebElement imdbCountry;
	

	public ImdbPage() {
		PageFactory.initElements(driver, this);  //LoginPage.class
	}
	
	
	public String compareImdb() throws Exception {
		driver.navigate().to(prop.getProperty("imdburl"));
		Thread.sleep(2000);
		imdbReleaseDetail.click();
		Thread.sleep(2000);
		return imdbRelease.getText();
	}

	public String compareImdbRegion() throws Exception {
		driver.get(prop.getProperty("imdburl"));
		
		return imdbCountry.getText();
	}
	
	
	
}
