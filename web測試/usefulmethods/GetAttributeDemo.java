package usefulmethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		// 窗口最大化
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement element=driver.findElement(By.id("product"));
		String attributeValue=element.getAttribute("name");
		System.out.println("屬性值是:"+attributeValue);

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}


}
