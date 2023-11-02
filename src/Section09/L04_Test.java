package Section09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\repos\\personal\\Selenium\\Sal Course\\Resources\\driver_v1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.xtm.cloud/saas-manager/login.jsp?type=SESSION_EXPIRED#!/login");
		
		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://automationtesting.co.uk/contactForm.html");
//		
		driver.findElement(By.xpath("/html//input[@id='client']")).sendKeys("Verint1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("form .ng-scope:nth-of-type(2) .form-control")).sendKeys("GeorgeADMIN");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("form .ng-scope:nth-of-type(3) .form-control")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("form#login > .btn.btn-block.btn-primary.btn-xtm.ng-binding.ng-scope")).click();
//
//		WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
////		submit.click();
//		WebElement reset = driver.findElement(By.cssSelector("[type='reset']"));
//
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].click(), arguments[1].click()", reset, submit);



	}

}
