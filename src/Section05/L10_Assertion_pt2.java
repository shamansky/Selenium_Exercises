package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class L10_Assertion_pt2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\repos\\\\\\\\personal\\\\\\\\Selenium\\\\\\\\Sal Course\\\\\\\\Resources\\\\\\\\driver_v1\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk");
		
		driver.findElement(By.linkText("TEST STORE")).click();
		driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
		driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();
		Thread.sleep(2000);
		
		String total = driver.findElement(By.cssSelector(".product-total > .value")).getText();
		
		Assert.assertEquals("$26.12", total);
		
	}

}
