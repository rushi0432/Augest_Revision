package Form_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiceform_3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa-practice.netlify.app/register");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window,scrollBy(0,100)", "");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("RUSHIKESH");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("SAKHAREKAR");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7083030751");
		WebElement ele = driver.findElement(By.xpath("//select[@id='countries_dropdown_menu']"));
		Select dropdown = new Select(ele);
		dropdown.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("rushikeshsakharekar1998@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("rushi@123");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		driver.findElement(By.xpath("//button[@id='registerBtn']")).click();
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='message']"));
		System.out.println(ele2.getText());

	}

}
