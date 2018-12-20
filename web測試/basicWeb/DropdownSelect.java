package basicWeb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

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
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);

		Thread.sleep(2000);
		System.out.println("Select BMW by value");
		sel.selectByValue("bmw");

		Thread.sleep(2000);
		System.out.println("Select Benz by index");
		sel.selectByIndex(1);

		Thread.sleep(2000);
		System.out.println("Select Honda by visible");
		sel.selectByVisibleText("Honda");

		List<WebElement> option = sel.getOptions();
		int size = option.size();
		for (int i = 0; i < size; i++) {
			String optionText = option.get(i).getText();
			System.out.println(optionText);
		}

	}

	@After
	public void tearDown() throws Exception {
	}
}
