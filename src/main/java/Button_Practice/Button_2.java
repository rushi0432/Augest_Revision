package Button_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa-practice.netlify.app/radiobuttons");
		driver.findElement(By.xpath("//input[@id='radio-button1']")).click();
		driver.findElement(By.xpath("//input[@id='radio-button2']")).click();
		driver.findElement(By.xpath("//input[@id='radio-button3']")).click();

	}

}
