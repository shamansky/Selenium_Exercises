package Section05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L09_Assertion_pt1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\repos\\\\\\\\\\\\\\\\personal\\\\\\\\\\\\\\\\Selenium\\\\\\\\\\\\\\\\Sal Course\\\\\\\\\\\\\\\\Resources\\\\\\\\\\\\\\\\driver_v1\\\\\\\\\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk");
		
		String pageTitle = driver.getTitle();
		
//		Assert.assertEquals("Homepage1", pageTitle);
		org.junit.Assert.assertEquals("Homepage", pageTitle);
	
	}

}
