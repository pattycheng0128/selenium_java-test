package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		String baseUrl="http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium自動化課程\\Java語法\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseUrl);
		

	}

}
