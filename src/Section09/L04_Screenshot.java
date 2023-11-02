package Section09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\repos\\personal\\Selenium\\Sal Course\\Resources\\driver_v1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/");
		driver.manage().window().maximize();

		takeSnapShot(driver);

	}

	public static void takeSnapShot(WebDriver webdriver) throws IOException {
		File srcFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);

		File destFile = new File("C:\\repos\\personal\\Selenium\\Sal Course\\Resources\\Screenshots\\"
				+ timestamp() + ".png");

		FileUtils.copyFile(srcFile, destFile);

	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
