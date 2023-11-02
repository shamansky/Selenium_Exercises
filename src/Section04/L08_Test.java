package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L08_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\repos\\\\personal\\\\Selenium\\\\Sal Course\\\\Resources\\\\driver_v1\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/");
		
//		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div[1]/button")).click();
		
		driver.findElement(By.linkText("LOADER")).click();
	}
	}
