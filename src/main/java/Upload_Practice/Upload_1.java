package Upload_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://practice-automation.com/file-upload/");
		driver.findElement(By.xpath("//input[@id='file_upload']"))
				.sendKeys("E:\\dj is my life\\camera photos\\img1458980696774.jpg");

		driver.findElement(By.xpath("//input[@value='Upload It!']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[text()='File upload complete!']"));
		System.out.println(ele.getText());

	}

}
