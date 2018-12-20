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

public class ElementDisplayed {

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
		WebElement textBox=driver.findElement(By.id("displayed-text"));
		System.out.println("TextBox是否顯示:"+textBox.isDisplayed());
		
		Thread.sleep(4000);
		WebElement hideButton=driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("點擊這個隱藏按鈕");
		System.out.println("TextBox是否顯示:"+textBox.isDisplayed());
		
		Thread.sleep(4000);
		WebElement showButton=driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("點擊這個顯示按鈕");
		System.out.println("TextBox是否顯示:"+textBox.isDisplayed());
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

}
