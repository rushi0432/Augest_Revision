package Calender_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-automation.com/calendars/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='g1065-selectorenteradate']")).click();
		String monthyear = "August 2023";

		while (true) {
			String monthtitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if (monthtitle.equals(monthyear)) {
				break;
			} else {
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			}
		}
		String xpath = "//a[text()='" + 29 + "']";
		driver.findElement(By.xpath(xpath)).click();
	}
}