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
			System.out.println("程单"+timeout+"じノ");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("じ瞷");
			
		}catch(Exception e) {
			System.out.println("じ⊿Τ瞷");
		}
		return element;
		
	}
	//т硂じ翴阑ウ
	public void clickWhenReady(By locator,int timeout) {
		
		try {
			WebElement element=null;
			System.out.println("程单"+timeout+"じノ");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until
					(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("翴阑じ");
			
		}catch(Exception e) {
			System.out.println("じ⊿Τ瞷");
		}
		
	}
	
}
