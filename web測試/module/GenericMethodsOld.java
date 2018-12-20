package module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethodsOld {
	WebDriver driver;
	WebElement element;

	// 無參數建構式
	public GenericMethodsOld() {
	};

	// 有參數的建構式
	public GenericMethodsOld(WebDriver driver) {
		this.driver = driver;
	};

	public WebElement getElement(String type, String locator) {
		type = type.toLowerCase();// 都轉為小寫
		if (type.equals("id")) {
			System.out.println("用id查找元素" + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("用xpath查找元素" + locator);
			return this.driver.findElement(By.xpath(locator));
		} else {
			System.out.println("定位的路徑有誤");
			return element;
		}
	}

	// 這個集合是用來判斷元素是否存在，不存在會顯示0，不會出現任何錯誤
	public List<WebElement> getElementList(String type, String locator) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("用id查找元素" + locator);
			return this.driver.findElements(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("用xpath查找元素" + locator);
			return this.driver.findElements(By.xpath(locator));
		} else {
			System.out.println("定位的路徑有誤");
			return null;
		}

	}

	// 用來確認元素是否存在，回傳true或false
	public boolean isElementPresent(String type, String locator) {
		List<WebElement> elementList = getElementList(type, locator);
		int size = elementList.size();
		if (size > 0) {
			return true;
		} else {
			return false;
		}

	}

}
