import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// To hit the browser. we have to run below two lines. 
		
		//System.setProperty("webdriver.chrome.driver", "path of the downloaded driver file");
		WebDriver driver = new ChromeDriver();
		
		
		// implicit wait because of line no 45
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		
		//To Load the webpage
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
// ----- ENTER WRONG ID PASS --------		
		
		//ID and Name Locator
		driver.findElement(By.id("inputUsername")).sendKeys("Kaushik");
		// .sendKeys used to input anything 
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		
		
		
		//Class Locator
		driver.findElement(By.className("submit")).click();
		// .click()  --> this method is used to click a button
		
		
		//CSS Selector
		
		//By ClassName ---> tagname.className
		//By ID name ---> tagname#id
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//we will Get error because the error message will only pop out after entering the userId and Pass. but this line will try to find the message so fast. 
		
		
// --- FOGET PASS --- 		
		//Link Text Locatpr 
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		//It is used to pause the code for a set of time. 1000 = 1 sec
		Thread.sleep(1000);
		
		// X path
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Kaushik");
		
			
		//clear inputs 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
		
		
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("John");
		
		
		
		//Chile items or Nth items
		//Xpath
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("kaushik@1234");
		
		
		
		//Parent/child Selector by Xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("933333232");
		
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		
		//Parent/child Selector by CSS selector
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		
		Thread.sleep(1000);
		
// ------Entering right ID PASS -------- 
		
		
		// changing ID to CSS selector using #
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		
		
		// Regular expression for partial attribute 
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		// Regular expression xpath
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
	}

}
