package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create the instance of chromedriver
		WebDriver driver = new FirefoxDriver();

		// 2. Launch the browser with facebook
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement SignUp = driver.findElement(By.linkText("Create new account"));
		SignUp.click();
		
		// 3. Enter First Name using CSS Selector
		WebElement FirstName = driver.findElement(By.cssSelector("input[name=firstname]"));
		FirstName.sendKeys("Arnel");
		
		// 4. Enter First Name using CSS Selector
		WebElement LastName = driver.findElement(By.cssSelector("input[name=lastname]"));
		LastName.sendKeys("Belen");
		
		//5. Enter Date using CSS
		WebElement Date = driver.findElement(By.cssSelector("select#day"));
		Select ddDate = new Select(Date);
		ddDate.selectByVisibleText("5");
		
		//6. Enter Month using CSS
		WebElement Month = driver.findElement(By.cssSelector("select#month"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("Jul");
		
		
		//7. Enter Year using CSS
		WebElement Year = driver.findElement(By.cssSelector("select#year"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("1980");
		
		
		//8.Select the Gender
		WebElement Gender = driver.findElement(By.cssSelector("input[value='2']"));
		Gender.click();

	}

}
