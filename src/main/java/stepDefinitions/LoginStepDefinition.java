package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{

	WebDriver driver;

	 @Given("^the user is already on youtube Page$")
	 public void user_already_on_youtube_page() throws InterruptedException{
//		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","C://Work//DriverNew//chromedriver.exe");
//		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	 driver = new ChromeDriver();
//	 driver.get("https://www.freecrm.com/index.html");
	 Thread.sleep(3000);
	 driver.get("https://www.youtube.com");
	 Thread.sleep(3000);
	 }
	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","C://Work//Drivers//chromedriver.exe");
//		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	 driver = new ChromeDriver();
//	 driver.get("https://www.freecrm.com/index.html");
	 driver.get("https://ui.freecrm.com/");
	 Thread.sleep(3000);
	 }
	
	 @When("^title of login page is \"(.*)\"$")
	 public void title_of_login_page_is_free_CRM(String x) throws InterruptedException{
		 Thread.sleep(3000);
		 System.out.println("Title is: "+x);
	 String title = driver.getTitle();
	 System.out.println("Actual title is: "+title);
	 System.out.println("Expected title is: "+x);
//	 Assert.assertEquals("Free CRM in the cloud software boosts sales", title);
	 Assert.assertEquals(title, x);
	 }
	 

	 
	
//	 @Then("^user enters {String} and {String} $")
//	 public void user_enters_username_and_password(String arg1, String arg2) throws Throwable {
//		 
//		 System.out.println("Inside Then "+arg1+" "+arg2);
//		 
//	  
//	 }
	 
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	//"^the user enters \"(.*)\" and \"(.*)\"$"
//	 
	 @Then("^the user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password) throws InterruptedException{
		 Thread.sleep(3000);
		 System.out.println(username+" "+password);
//	 driver.findElement(By.name("email")).sendKeys(username);
//	 driver.findElement(By.name("password")).sendKeys(password);
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() throws InterruptedException {
	 WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login']"));
	 loginBtn.click();
	 Thread.sleep(1000);
//	 JavascriptExecutor js = (JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].click();", loginBtn);
	 }
	
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("CRMPRO", title);
	 }
	 
//	 @Then("^user moves to new contact page$")
//	 public void user_moves_to_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//		
//		}
//	 
//	 
//	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contacts_details(String firstname, String lastname, String position){
//		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	 }
//	 

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.close();
	 }
	
	
	

}
