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

import module.AllModule;

public class AutoComplete {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.skyscanner.com.tw/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		String searchingText="福岡 (FUK)";//實際要找的內容
		String partialText="日本";//輸入日本會列出一些內容
		WebElement text=driver.findElement(By.id("destination-fsc-search"));
		Thread.sleep(1000);
		text.sendKeys(partialText);
		Thread.sleep(1000);
		
		//ul
		WebElement element=driver.findElement(By.id("react-autowhatever-destination-fsc-search"));
		List<WebElement> results=element.findElements(By.tagName("li"));
		int size=results.size();
		System.out.println("集合的大小:"+size);
		
		for(int i=0;i<size;i++) {
			System.out.println(results.get(i).getText());
		}
		
		
		Thread.sleep(3000);
		for(WebElement result:results) {
			if(result.getText().equals(searchingText)) {
				System.out.println("選擇的是"+result.getText());
				result.click();
				break;
			}
		}
		
		
		
	}

	@After
	public void tearDown() throws Exception {
	}

}
