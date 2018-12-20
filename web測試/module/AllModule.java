package module;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllModule {

	private WebDriver driver;
	
	public AllModule(WebDriver driver) {
		this.driver=driver;
	}


	// 判斷用什麼方式來查找元素
	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("用id查找元素:" + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("name")) {
			System.out.println("用name查找元素: " + locator);
			return this.driver.findElement(By.name(locator));
		} else if (type.equals("xpath")) {
			System.out.println("用xpath查找元素: " + locator);
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("css")) {
			System.out.println("用css查找元素: " + locator);
			return this.driver.findElement(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			System.out.println("用classname查找元素: " + locator);
			return this.driver.findElement(By.className(locator));
		} else if (type.equals("tagname")) {
			System.out.println("用tagname查找元素: " + locator);
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("linktext")) {
			System.out.println("用linktext查找元素: " + locator);
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			System.out.println("用partiallinktext查找元素: " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		} else {
			System.out.println("定位的类型不支持");
			return null;
		}
	}

	// 這個集合是用來判斷元素是否存在，不存在會顯示0，不會出現任何錯誤
	public List<WebElement> getElementList(String type, String locator) {
		type = type.toLowerCase();
		List<WebElement> elementList = new ArrayList<WebElement>();
		if (type.equals("id")) {
			elementList = this.driver.findElements(By.id(locator));
		} else if (type.equals("name")) {
			elementList = this.driver.findElements(By.name(locator));
		} else if (type.equals("xpath")) {
			elementList = this.driver.findElements(By.xpath(locator));
		} else if (type.equals("css")) {
			elementList = this.driver.findElements(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			elementList = this.driver.findElements(By.className(locator));
		} else if (type.equals("tagname")) {
			elementList = this.driver.findElements(By.tagName(locator));
		} else if (type.equals("linktext")) {
			elementList = this.driver.findElements(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			elementList = this.driver.findElements(By.partialLinkText(locator));
		} else {
			System.out.println("定位的类型不支持");
		}

		if (elementList.isEmpty()) {
			System.out.println("用" + type + ": " + locator + "沒有找到元素");
		} else {
			System.out.println("元素用  " + type + ": " + locator + " 找到了");
		}
		return elementList;

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

	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("最長等待" + timeout + "秒元素可用");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("元素在頁面上出現了");

		} catch (Exception e) {
			System.out.println("元素沒有在頁面出現");
		}
		return element;

	}

	// 找到這個元素並點擊它
	public void clickWhenReady(By locator, int timeout) {

		try {
			WebElement element = null;
			System.out.println("最長等待" + timeout + "秒元素可用");
			WebDriverWait wait = new WebDriverWait(driver, 3);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out.println("在頁面上點擊了元素");

		} catch (Exception e) {
			System.out.println("元素沒有在頁面出現");
		}

	}

}
