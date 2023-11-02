package Section08;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L01_TravelWebsitePt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\repos\\personal\\Selenium\\Sal Course\\Resources\\driver_v1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.easyjet.com/en/");
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("ensCloseBanner"))).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[1].scrollIntoView()", driver.findElement(By.id("ensCloseBanner"))); 
		
		
		driver.findElement(By.id("ensCloseBanner")).click();
		
		
//		driver.findElement(By.cssSelector("input[name='origin']")).click();
//		driver.findElement(By.cssSelector("input[name='origin']")).sendKeys("London");
//		
//		List<WebElement> origins = new WebDriverWait(driver, Duration.ofSeconds(20))
//				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
//
//		
//		for(WebElement origin:origins) {
//			if(origin.getText().contains("Luton")) {
//				origin.click();
//			}
//		}
		
	}

}
