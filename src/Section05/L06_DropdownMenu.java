package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L06_DropdownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\repos\\\\\\\\personal\\\\\\\\Selenium\\\\\\\\Sal Course\\\\\\\\Resources\\\\\\\\driver_v1\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/dropdown.html");
		
		Select menuItem = new Select(driver.findElement(By.cssSelector("#cars")));
		
		//menuItem.selectByVisibleText("Honda");
		menuItem.selectByValue("jeep");
		
	}

}
