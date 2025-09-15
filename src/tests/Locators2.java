package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "balajinale";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("Balaji@6305");
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		driver.findElement(By.cssSelector("span input[value='agreeTerms']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("form input[placeholder$='Name']")).sendKeys("Balaji Nale");
		driver.findElement(By.cssSelector("form input[placeholder$='Email']")).sendKeys("balajinale6305@gmail.com");
		driver.findElement(By.cssSelector("form input[placeholder$='Phone Number']")).sendKeys("9049780195");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p[class$='infoMsg']")).getText());
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.cssSelector("form input[placeholder$='Password']")).clear();
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
//		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("p[class$='infoMsg']")).getText();
		
		String[] passwordArray = passwordText.split("'");
//		String[] passwordArray1 = passwordArray[1].split("'");
//		passwordArray1[0];
		String password = passwordArray[1].split("'")[0];
		return password;
		

	}

}
