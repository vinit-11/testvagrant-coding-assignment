package base.testvagrant;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {


	public static WebDriver driver;
	public static Properties prop;


	public TestBase() {


		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("E:\\eclipse\\Pushpa\\src\\main\\java\\config\\testvagrant\\config.properties");
			prop.load(ip);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}


	public  static void initialization() {				//static


		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

}
