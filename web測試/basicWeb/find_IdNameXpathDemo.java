package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class find_IdNameXpathDemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new InternetExplorerDriver();
		String baseUrl = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium Webdriver");//id�w��
//		driver.findElement(By.name("btnK")).click();//name�w��
		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[3]/center/input[1]")).click();

	}

}
