package basicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperation {

	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://tw.news.yahoo.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.id("uh-signedin")).click();
		driver.findElement(By.id("login-username")).sendKeys("test@yahoo.com.tw");
		driver.findElement(By.id("login-username")).clear();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
