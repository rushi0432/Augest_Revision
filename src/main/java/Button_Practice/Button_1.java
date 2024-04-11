package Button_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa-practice.netlify.app/checkboxes");
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();

	}

}
