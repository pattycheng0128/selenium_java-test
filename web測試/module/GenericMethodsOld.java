package module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethodsOld {
	WebDriver driver;
	WebElement element;

	// �L�Ѽƫغc��
	public GenericMethodsOld() {
	};

	// ���Ѽƪ��غc��
	public GenericMethodsOld(WebDriver driver) {
		this.driver = driver;
	};

	public WebElement getElement(String type, String locator) {
		type = type.toLowerCase();// ���ର�p�g
		if (type.equals("id")) {
			System.out.println("��id�d�䤸��" + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("��xpath�d�䤸��" + locator);
			return this.driver.findElement(By.xpath(locator));
		} else {
			System.out.println("�w�쪺���|���~");
			return element;
		}
	}

	// �o�Ӷ��X�O�ΨӧP�_�����O�_�s�b�A���s�b�|���0�A���|�X�{������~
	public List<WebElement> getElementList(String type, String locator) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("��id�d�䤸��" + locator);
			return this.driver.findElements(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("��xpath�d�䤸��" + locator);
			return this.driver.findElements(By.xpath(locator));
		} else {
			System.out.println("�w�쪺���|���~");
			return null;
		}

	}

	// �ΨӽT�{�����O�_�s�b�A�^��true��false
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
