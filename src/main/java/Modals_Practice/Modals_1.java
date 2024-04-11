package Modals_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Modals_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://practice-automation.com/modals/");
		// driver.findElement(By.xpath("//button[@id='simpleModal']")).click();
		// WebElement ele = driver.findElement(By.xpath("//p[text()='Hi, I’m a simple modal.']"));
		// System.out.println(ele.getText());

		driver.findElement(By.xpath("//button[@id='formModal']")).click();
		driver.findElement(By.xpath("//input[@id='g1051-name']")).sendKeys("RUSHIKESH SAKHAREKAR");
		driver.findElement(By.xpath("//input[@id='g1051-email']")).sendKeys("rushikeshsakharekar1998@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='contact-form-comment-g1051-message']")).sendKeys("submitted");
		driver.findElement(By.xpath("//p//button[@type='submit']")).click();

	}

}
