package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create the instance of firefoxdriver
		WebDriver driver = new FirefoxDriver();

		// 2. Launch the browser with website
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// 3. click on New Tab button
		
		WebElement NewTab = driver.findElement(By.xpath("//button[text()='New Tab']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", NewTab);
		NewTab.click();
		
		//4. Find all the window handles and switch to the tab
		
		List<String> AllWin = new ArrayList<>(driver.getWindowHandles());
		
		String Parent = AllWin.get(0);
		String Child = AllWin.get(1);
		
		driver.switchTo().window(Child);
		
		WebElement ChildHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println(ChildHeader.getText());
		
		driver.close();
		driver.switchTo().window(Parent);
		
		// 5. Do the same thing on New Window Button

	
	}

}
