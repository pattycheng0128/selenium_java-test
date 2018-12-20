package usefulmethods;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import module.GenericMethodsOld;

public class ElementListDemo {

	private WebDriver driver;
	private String baseUrl;
	private GenericMethodsOld gm;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		gm = new GenericMethodsOld(driver);

		// 窗口最大化
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		driver.get(baseUrl);

		List<WebElement> element = gm.getElementList("id", "mousehover");
		int size = element.size();
		System.out.println("集合的大小是:" + size);
	}

	@After
	public void tearDown() throws Exception {
//		Thread.sleep(2000);
//		driver.quit();
	}
}
