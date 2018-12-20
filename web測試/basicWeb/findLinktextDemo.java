package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class findLinktextDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		String url="https://jenkins.io/";
		driver.get(url);
//		driver.findElement(By.linkText("Documentation")).click();
		driver.findElement(By.partialLinkText("Documentation")).click();
		driver.close();
		

	}

}
