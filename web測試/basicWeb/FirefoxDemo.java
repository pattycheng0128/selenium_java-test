package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "D:\\Selenium�۰ʤƽҵ{\\Java�y�k\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String baseUrl="http://www.google.com";
		driver.get(baseUrl);
		

	}

}
