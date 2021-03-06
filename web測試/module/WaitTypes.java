package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	
	WebDriver driver;
	
	public WaitTypes(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement waitForElement(By locator,int timeout) {
		WebElement element=null;
		try {
			System.out.println("最長等待"+timeout+"秒元素可用");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("元素在頁面上出現了");
			
		}catch(Exception e) {
			System.out.println("元素沒有在頁面出現");
		}
		return element;
		
	}
	//找到這個元素並點擊它
	public void clickWhenReady(By locator,int timeout) {
		
		try {
			WebElement element=null;
			System.out.println("最長等待"+timeout+"秒元素可用");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until
					(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("在頁面上點擊了元素");
			
		}catch(Exception e) {
			System.out.println("元素沒有在頁面出現");
		}
		
	}
	
}
