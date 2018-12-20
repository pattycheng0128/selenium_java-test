package ExecuteScript;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	private WebDriver driver;
	String baseUrl;
	private JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test() throws Exception {
		js.executeScript("window.location='http://www.google.com'");
		Thread.sleep(3000);

		WebElement textBox = (WebElement) js.executeScript("return document.getElementById('lst-ib')");
		textBox.sendKeys("test");

		// Size of window
		long height = (long) js.executeScript("return window.innerHeight");
		long width = (long) js.executeScript("return window.innerwidth");

		System.out.println("Window的高度:" + height);
		System.out.println("Window的寬度:" + width);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
