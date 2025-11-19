package testproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumIntro{

	public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver", "/Users/Shree/Downloads/chromedriver-win64/chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
		    WebDriver driver = new EdgeDriver();
			driver.get("https://www.facebook.com/login.php/");
			Thread.sleep(500);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
	}

}
