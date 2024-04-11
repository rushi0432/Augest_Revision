package Alerts_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/popups/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// driver.findElement(By.xpath("//button[@id='alert']")).click();
		// Alert alt = driver.switchTo().alert();
		// alt.accept();

		// driver.findElement(By.xpath("//button[@id='confirm']")).click();
		// Alert alt = driver.switchTo().alert();
		// alt.accept();

		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("submitted");
		System.out.println(alt.getText());
		alt.accept();
		

	}

}
