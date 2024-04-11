package Form_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiceform_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window,scrollBy(0,200)", "");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("RUSHIKESH");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SAKHAREKAR");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='1']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window,scrollBy(0,300)", "");
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("E:\\PASSPORT.jpg");
		driver.findElement(By.xpath("//input[@value='RC']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium IDE']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@name='continents']"));
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		Alert alt = driver.switchTo().alert();
		alt.dismiss();

	}

}

// https:// practice-automation.com/
// https:// qa-practice.netlify.app/
// https://only-testing-blog.blogspot.com/2014/01/textbox.html
// https://jqueryui.com/demos/