package Form_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practiceform_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://practice-automation.com/form-fields/");
		driver.findElement(By.xpath("//div[@id='main']//input[@id='g1103-name']"))
				.sendKeys("RUSHIKESH DILIP SAKHAREKAR");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(By.xpath("//span[text()='Water']")).click();
		driver.findElement(By.xpath("//span[text()='Milk']")).click();
		driver.findElement(By.xpath("//span[text()='Coffee']")).click();
		driver.findElement(By.xpath("//span[text()='Wine']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window,scrollBy(0,200)", "");
		driver.findElement(By.xpath("//span[text()='Red']")).click();
		driver.findElement(By.xpath("//span[text()='Blue']")).click();
		driver.findElement(By.xpath("//span[text()='Yellow']")).click();
		driver.findElement(By.xpath("//span[text()='Green']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[@id='g1103-doyouhaveanysiblings-button']"));
		Select dropdown = new Select(ele);
		dropdown.selectByValue("yes");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)", "");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rushikeshsakharekar1998@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='contact-form-comment-message']"))
				.sendKeys("SUBMITTED_SUCCESFULLY");
		driver.findElement(By.xpath("//div[@id='main']//button[text()='Submit']")).click();

	}

}
