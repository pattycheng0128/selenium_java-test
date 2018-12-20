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

public class MultipleSelect {

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
		WebElement element=driver.findElement(By.id("multiple-select-example"));
		Select sel=new Select(element);
		
		System.out.println("Select Apple");
		sel.selectByIndex(0);
		
		Thread.sleep(2000);
		System.out.println("Select Apple");
		sel.deselectByIndex(0);
		
		System.out.println("Select Peach");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Select Peach");
		sel.deselectByIndex(2);
		
		System.out.println("Select Orange");
		sel.selectByIndex(0);
		
		System.out.println("Select Orange");
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		System.out.println("Select Peach");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("Print all selected options");
		List<WebElement> selectOption=sel.getAllSelectedOptions();
		for(WebElement option:selectOption) {
			System.out.println("option內容:"+option.getText());
		}
		Thread.sleep(2000);
		System.out.println("deselect All");
		sel.deselectAll();
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
