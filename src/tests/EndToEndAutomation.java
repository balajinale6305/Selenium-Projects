package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EndToEndAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79 r-1ozqkpa']")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'AGR')]")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'AMD')]")).click();
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"))
				.click();
		driver.findElement(By.xpath("//div[contains(text(), 'Adult')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Select Date']")).isEnabled());
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath(
				"//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-11ict49 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-k8qxaj r-glunga r-bnwqim']/div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/div/div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']/div[2]"))
				.click();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='USD'])[1]"))
				.click();
		driver.findElement(By.xpath("(//*[name()='circle'])[5]")).click();
		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]"))
				.click();
		driver.close();
		System.out.println("Ran Successfully");

	}

}
