package waittype;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ImplicitlyWaitDemo {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseUrl = "https://www.lativ.com.tw/";
		// 窗口最大化
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\'stateByLogin\']/a")).click();
		driver.findElement(By.id("login_ac")).sendKeys("test");
		
	}

	@After
	public void tearDown() throws Exception {
//		Thread.sleep(2000);
//		driver.quit();
	}
}
