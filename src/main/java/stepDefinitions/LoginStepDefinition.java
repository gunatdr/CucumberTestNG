//package stepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//import org.testng.asserts.SoftAssert;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition{
//
//	WebDriver driver;
//	SoftAssert softAssert = new SoftAssert();
//	 @Given("^the user is already on youtube Page$")
//	 public void user_already_on_youtube_page() throws InterruptedException{
////		 WebDriver driver;
//		 System.setProperty("webdriver.chrome.driver","C://Work//DriverNew//chromedriver.exe");
////		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
//	 driver = new ChromeDriver();
////	 driver.get("https://www.freecrm.com/index.html");
//	 Thread.sleep(3000);
//	 driver.get("https://www.youtube.com");
//	 Thread.sleep(3000);
//	 }
//	
//	 @Given("^user is already on Login Page$")
//	 public void user_already_on_login_page() throws InterruptedException{
//		 System.setProperty("webdriver.chrome.driver","C://Work//Drivers//chromedriver.exe");
////		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
//	 driver = new ChromeDriver();
////	 driver.get("https://www.freecrm.com/index.html");
//	 driver.get("https://ui.freecrm.com/");
//	 Thread.sleep(3000);
//	 }
//	
//	 @When("^title of login page is \"(.*)\"$")
//	 public void title_of_login_page_is_free_CRM(String x) throws InterruptedException{
//		 Thread.sleep(3000);
//		 System.out.println("Title is: "+x);
//	 String title = driver.getTitle();
//	 System.out.println("Actual title is: "+title);
//	 System.out.println("Expected title is: "+x);
//	 
//	 
//	 softAssert.assertEquals(title, "Free CRM in the cloud software boosts sales","Assert condition failed");
////	 Assert.assertEquals(title, x);
//	 System.out.println("Assertion done.");
//
//	 }
//	 
//	 
//	 
//	 //login_ScenarioOutline using Scenario Outline and Examples keyword
//	 //Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\"
//	//"^the user enters \"(.*)\" and \"(.*)\"$"
////	 
//	 @Then("^the user enters \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_username_and_password(String username, String password) throws InterruptedException{
//		 Thread.sleep(3000);
//		 System.out.println(username+" "+password);
////	 driver.findElement(By.name("email")).sendKeys(username);
////	 driver.findElement(By.name("password")).sendKeys(password);
//	 }
//	 
//
////	 //login_asMaps using DataTable asMaps method
////		@Then("^user enters username and password$")
////		public void user_enters_username_and_password(DataTable credentials) {			
//////			List<Map<String, String>> rows = credentials.asMaps(String.class, String.class);		     
//////		    for (Map<String, String> columns : rows) {
////////		        store.addBook(new Book(columns.get("title"), columns.get("author")));
//////		        System.out.println("User name is: "+columns.get("username"));
//////				System.out.println("Pass word is: "+columns.get("password"));
//////		    }	
////			
////			
////		    
//////			for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
//////				System.out.println("User name is: "+data.get("username"));
//////				System.out.println("Pass word is: "+data.get("password"));
////////				driver.findElement(By.name("username")).sendKeys(data.get("username"));
////////				driver.findElement(By.name("password")).sendKeys(data.get("password"));
//////			}
////
////		}
////
////	 @Then("^user clicks on login button$")
////	 public void user_clicks_on_login_button() throws InterruptedException {
////	 WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login']"));
////	 loginBtn.click();
////	 Thread.sleep(1000);
//////	 JavascriptExecutor js = (JavascriptExecutor)driver;
//////	 js.executeScript("arguments[0].click();", loginBtn);
////	 }
//	
//	
//	 @Then("^user is on home page$")
//	 public void user_is_on_hopme_page(){
//	 String title = driver.getTitle();
//	 System.out.println("Home Page title ::"+ title);
//	 Assert.assertEquals("CRMPRO", title);
//	 }
//	 
////	 @Then("^user moves to new contact page$")
////	 public void user_moves_to_new_contact_page() {
////		driver.switchTo().frame("mainpanel");
////		Actions action = new Actions(driver);
////		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
////		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
////		
////		}
////	 
////	 
//
//	 @Then("^Close the browser$")
//	 public void close_the_browser(){
//		 
//		 driver.close();
////		 softAssert.assertAll();
//	 }
//	
//	
//	
//
//}
