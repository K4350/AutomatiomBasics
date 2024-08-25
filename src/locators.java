import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// To hit the browser. we have to run below two lines. 
		
		//System.setProperty("webdriver.chrome.driver", "path of the downloaded driver file");
		WebDriver driver = new ChromeDriver();
		
		
		
		//To Load the webpage
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		//ID and Name Locator
		driver.findElement(By.id("inputUsername")).sendKeys("Kaushik");
		// .sendKeys used to input anything 
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		
		
		
		//Class Locator
		driver.findElement(By.className("submit")).click();
		// .click()  --> this method is used to click a button
		
		
		//CSS Selector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
		
		
		 
		
		
		
		

	}

}
