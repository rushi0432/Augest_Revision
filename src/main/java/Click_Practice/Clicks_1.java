package Click_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clicks_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://practice-automation.com/click-events/");

		driver.findElement(By.xpath("//b[text()='Cat']")).click();
		WebElement ele1 = driver.findElement(By.xpath("//h2[text()='Meow!']"));
		System.out.println(ele1.getText());

		driver.findElement(By.xpath("//b[text()='Dog']")).click();
		WebElement ele2 = driver.findElement(By.xpath("//h2[text()='Woof!']"));
		System.out.println(ele2.getText());

		driver.findElement(By.xpath("//b[text()='Pig']")).click();
		WebElement ele3 = driver.findElement(By.xpath("//h2[text()='Oink!']"));
		System.out.println(ele3.getText());

		driver.findElement(By.xpath("//b[text()='Cow']")).click();
		WebElement ele4 = driver.findElement(By.xpath("//h2[text()='Moo!']"));
		System.out.println(ele4.getText());

	}

}
