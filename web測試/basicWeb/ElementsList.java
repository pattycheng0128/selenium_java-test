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

public class ElementsList {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		boolean isCheck=false;
		List<WebElement> checkBox = driver
				.findElements(By.xpath("//input[contains(@type,'checkbox') and contains(@name,'cars')]"));
		int size = checkBox.size();
		System.out.println("¶°¦Xsize:" + size);
		for(int i=0;i<size;i++) {
			isCheck=checkBox.get(i).isSelected();
			if(!isCheck) {
				checkBox.get(i).click();
				Thread.sleep(2000);
			}
		}

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();

	}

}
