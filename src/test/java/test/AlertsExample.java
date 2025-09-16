package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 1. Create the instance of firefoxdriver
		WebDriver driver = new FirefoxDriver();

		// 2. Launch the browser with website
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		// Click on first alert button
		
		WebElement Button1 = driver.findElement(By.id("alertButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Button1);
		Button1.click();
		
		Alert alt1 = driver.switchTo().alert();
		Thread.sleep(5000);
		alt1.accept();
		
		// Click on third alert button and on alert click on cancel by alrt.dismiss()

	}

}
