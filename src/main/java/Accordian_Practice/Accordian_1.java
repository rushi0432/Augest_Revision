package Accordian_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Accordian_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://practice-automation.com/accordions/");
		driver.findElement(By.xpath("//summary[text()='Click to see more']")).click();
		WebElement ele = driver.findElement(By.xpath("//p[text()='This is an accordion item.']"));
		System.out.println(ele.getText());

	}

}