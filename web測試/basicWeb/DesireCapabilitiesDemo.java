package basicWeb;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesireCapabilitiesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium自動化課程\\Java語法\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.google.com";
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WIN10);
		driver = new FirefoxDriver(caps);
		driver.manage().window().maximize();
		driver.get(baseUrl);

	}

}
