package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		// 1. Create the instance of firefoxdriver
		WebDriver driver = new FirefoxDriver();

		// 2. Launch the browser with facebook
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement SignUp = driver.findElement(By.linkText("Create new account"));
		SignUp.click();
		
		//3. Print the values of all the months using find elements
		
		List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for(WebElement month:Months) {
			
			System.out.println(month.getText());
		}
		
		//4. Find out the default value of the year selected using xpath
		
		//select[@id='year']/option[@selected='1']
		

	}

}
