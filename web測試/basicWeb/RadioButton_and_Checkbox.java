package basicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_and_Checkbox {

	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://learn.letskodeit.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement bmwRadio=driver.findElement(By.id("bmwradio"));
		bmwRadio.click();
		
		WebElement bmwcheck=driver.findElement(By.id("bmwcheck"));
		bmwcheck.click();
		
		WebElement benzcheck=driver.findElement(By.id("benzcheck"));
		benzcheck.click();
		
		System.out.println("bmwRadioª¬ºA:"+bmwRadio.isSelected());
		System.out.println("bmwcheckª¬ºA:"+bmwcheck.isSelected());
		System.out.println("benzcheckª¬ºA:"+benzcheck.isSelected());
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

}
