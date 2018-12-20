package basicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingBetweenPages {

	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://tw.yahoo.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Page title:" + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Now URL:"+currentUrl);
		//連到Login頁面
		String urlToNavigate="https://login.yahoo.com/config/login?.src=twfp&.lang=zh-Hant-TW&.intl=tw&.done=https://tw.yahoo.com/";
		driver.navigate().to(urlToNavigate);
		System.out.println("開啟登入頁面");
		
		currentUrl=driver.getCurrentUrl();
		System.out.println("Now URL:"+currentUrl);
		
		//返回前一頁面
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("返回前一頁面");
		currentUrl=driver.getCurrentUrl();
		System.out.println("Now URL:"+currentUrl);
		
		//跳轉到下一頁面
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("跳轉到下一頁面");
		currentUrl=driver.getCurrentUrl();
		System.out.println("Now URL:"+currentUrl);
		
		//刷新頁面
		driver.navigate().refresh();
		System.out.println("刷新頁面");
		currentUrl=driver.getCurrentUrl();
		System.out.println("Now URL:"+currentUrl);
		
		//getpageSource顯示當下頁面的所有資訊
//		String pageSource=driver.getPageSource();
//		System.out.println("pageSource:"+pageSource);
		

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
