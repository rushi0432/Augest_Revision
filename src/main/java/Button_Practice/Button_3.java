package Button_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_3 {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://qa-practice.netlify.app/double-click");
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='double-click-btn']"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='double-click-result']"));
		System.out.println(ele2.getText());
		
		
	}

}
