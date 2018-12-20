package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.ie.driver", "D:\\Selenium自動化課程\\Java語法\\Selenium\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		String baseUrl="http://www.google.com";
		driver.get(baseUrl);
		

	}

}
