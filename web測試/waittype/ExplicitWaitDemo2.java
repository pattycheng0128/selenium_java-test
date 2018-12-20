package waittype;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import module.WaitTypes;

public class ExplicitWaitDemo2 {

	private WebDriver driver;
	private String baseUrl;
	private WaitTypes wt;// 這句不能直接加在public裡面，因為會是區域變數

	@Before
	public void setUp() throws Exception {

		driver = new ChromeDriver();
		baseUrl = "https://www.lativ.com.tw/";
		wt = new WaitTypes(driver);

		// 窗口最大化
		driver.manage().window().maximize();

	}

	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.xpath("//*[@id=\'stateByLogin\']/a"));
		loginLink.click();
		WebElement emailField = wt.waitForElement(By.id("login_ac"), 3);
		emailField.sendKeys("test");

	}

	@After
	public void tearDown() throws Exception {
//		Thread.sleep(2000);
//		driver.quit();
	}
}
