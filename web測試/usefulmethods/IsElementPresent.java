package usefulmethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.GenericMethods;

public class IsElementPresent {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethods gm;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		gm = new GenericMethods(driver);

		// 窗口最大化
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		driver.get(baseUrl);
		boolean result1 = gm.isElementPresent("id", "name");
		System.out.println("元素是否存在:" + result1);
		
		boolean result2 = gm.isElementPresent("id", "name2");
		System.out.println("元素是否存在:" + result2);
	}

	@After
	public void tearDown() throws Exception {
//		Thread.sleep(2000);
//		driver.quit();
	}
}
