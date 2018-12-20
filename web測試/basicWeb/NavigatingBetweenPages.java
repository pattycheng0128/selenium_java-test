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
		//�s��Login����
		String urlToNavigate="https://login.yahoo.com/config/login?.src=twfp&.lang=zh-Hant-TW&.intl=tw&.done=https://tw.yahoo.com/";
		driver.navigate().to(urlToNavigate);
		System.out.println("�}�ҵn�J����");
		
		currentUrl=driver.getCurrentUrl();
		System.out.println("Now URL:"+currentUrl);
		
		//��^�e�@����
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("��^�e�@����");
		currentUrl=driver.getCurrentUrl();
		System.out.println("Now URL:"+currentUrl);
		
		//�����U�@����
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("�����U�@����");
		currentUrl=driver.getCurrentUrl();
		System.out.println("Now URL:"+currentUrl);
		
		//��s����
		driver.navigate().refresh();
		System.out.println("��s����");
		currentUrl=driver.getCurrentUrl();
		System.out.println("Now URL:"+currentUrl);
		
		//getpageSource��ܷ�U�������Ҧ���T
//		String pageSource=driver.getPageSource();
//		System.out.println("pageSource:"+pageSource);
		

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
