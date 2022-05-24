package pages.testvagrant;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import base.testvagrant.TestBase;

public class WikiPage extends TestBase{
	
	@FindBy(xpath="//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")
	WebElement wikiRelease;
	
	
	
	@FindBy(xpath="//table[@class='infobox vevent']//tbody//tr[14]//td")
	WebElement wikiCountry;
	
	
	public WikiPage() {
		PageFactory.initElements(driver, this); 
	}

	
	public String compareWiki() {
		driver.get(prop.getProperty("wikiurl"));
		return wikiRelease.getText();
	}
		
	
	
	public String compareWikiRegion() {
		driver.get(prop.getProperty("wikiurl"));
		return wikiCountry.getText();
	}
	
	
	}



