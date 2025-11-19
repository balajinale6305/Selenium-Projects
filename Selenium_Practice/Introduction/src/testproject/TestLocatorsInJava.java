package testproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestLocatorsInJava{

	public static void main(String[] args) throws InterruptedException{
//			System.setProperty("webdriver.chrome.driver", "/Users/Shree/Downloads/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://rahulshettyacademy.com/");
			driver.findElement(By.xpath("//a[@class='theme-btn register-btn']")).click();
			driver.findElement(By.cssSelector("input[id='email']")).sendKeys("balajinale17@gmail.com");
			driver.findElement(By.cssSelector("input[id='email']")).clear();
			driver.findElement(By.xpath("//div/input")).sendKeys("balajinale6305@gmail.com");
			driver.findElement(By.xpath("//div/button")).click();
//			driver.findElement(By.cssSelector("input[class='form-input p-v-1-xs p-l-2-xs p-r-4-xs col-12-xs bodyMain']")).sendKeys("balajinale6305@gmail.com");
//			driver.findElement(By.cssSelector("input[class='password form-input p-v-1-xs p-l-2-xs p-r-6-xs col-12-xs bodyMain'")).sendKeys("Balaji@6305");
//			driver.findElement(By.name("commit")).click();
//			System.out.println(driver.findElement(By.cssSelector("span.text-with-icon")).getText());
//			driver.findElement(By.linkText("Forgot Password")).click();
//			Thread.sleep(500);
//			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("balajinale17@gmail.com");
//			driver.findElement(By.xpath("//input[@name='commit']")).click();
//			driver.close();
			
			
	}
}
