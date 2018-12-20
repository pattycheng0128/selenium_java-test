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
			System.out.println("�̪�����"+timeout+"�����i��");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("�����b�����W�X�{�F");
			
		}catch(Exception e) {
			System.out.println("�����S���b�����X�{");
		}
		return element;
		
	}
	//���o�Ӥ������I����
	public void clickWhenReady(By locator,int timeout) {
		
		try {
			WebElement element=null;
			System.out.println("�̪�����"+timeout+"�����i��");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until
					(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("�b�����W�I���F����");
			
		}catch(Exception e) {
			System.out.println("�����S���b�����X�{");
		}
		
	}
	
}
