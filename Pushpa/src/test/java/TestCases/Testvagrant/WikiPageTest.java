package TestCases.Testvagrant;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.testvagrant.TestBase;
import pages.testvagrant.ImdbPage;
import pages.testvagrant.WikiPage;

public class WikiPageTest extends TestBase {


	WikiPage wikipage;
	ImdbPage imdbpage;
	WikiPageTest wikipagetest;
	
	
	public WikiPageTest() {
		super();
	}


	@BeforeMethod
	public void setUp() {


		initialization();

		wikipage=new WikiPage();
		imdbpage=new ImdbPage();
		wikipagetest=new WikiPageTest();
	}



	@Test
	public void compareReleaseDate() throws Exception {
		Assert.assertEquals(wikipage.compareWiki(),imdbpage.compareImdb(),"Release date is not match");
	}
	

	@Test
	public void compareCountry() throws Exception {
		Assert.assertEquals(wikipage.compareWikiRegion(),imdbpage.compareImdbRegion(),"Release country is not match");
		
	
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
