package basicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementState {
	
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		baseUrl="https://www.google.com.tw";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
	

	@Test
	public void test() {
		WebElement e1=driver.findElement(By.id("lst-ib"));
		System.out.println("e1 is enable?"+e1.isEnabled());
		e1.sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='sbtc']//li[11]/div/span[1]/span/input")).click();;

	}

	@After
	public void tearDown() throws Exception {
		
	}
	
}
