package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class findClassDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new InternetExplorerDriver();
		String url="https://jenkins.io/node/";
		driver.get(url);
		driver.findElement(By.className("navbar-brand")).click();

	}

}
