package Drag_drop_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://practice-automation.com/gestures/");
		WebElement ele = driver.findElement(By.xpath("//div[@id='moveMeHeader']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele, 300, 10).perform();

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window,scrollBy(0,450)", "");
//		Actions act = new Actions(driver);
//		WebElement ele2 = driver.findElement(By.xpath("//div[@id='div1']"));
//		WebElement ele3 = driver.findElement(By.xpath("//div[@id='div2']"));
//		act.dragAndDrop(ele2, ele3).perform();
//		act.clickAndHold(ele2).moveToElement(ele3).release().build().perform();

	}

}
