package Section05;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L12_Accordion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\repos\\\\\\\\personal\\\\\\\\Selenium\\\\\\\\Sal Course\\\\\\\\Resources\\\\\\\\driver_v1\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/accordion.html");

//		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
//		
//		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
//		
//		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
		
		for (int i=0; i<10; i++) {
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)")).click();
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(3)")).click();
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(5)")).click();
		}
	}

}
