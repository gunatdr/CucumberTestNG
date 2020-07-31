package stepDefinitions;

import Utils.Controller;
import cucumber.api.java.en.When;

public class LoginSteps {
    Controller controller;
//    User user;
//    LoginWorkflow loginPage;
//    public LoginSteps(Controller controller, User user) {
//        this.controller = controller;
//        this.user = user;
//        loginPage = new LoginPage(this.controller);
//    }
    
    public LoginSteps(Controller controller) {
        this.controller = controller;
    }
    @When("^I login$")
    public void login() {
    	controller.getDriver().get("https://www.youtube.com");
    	System.out.println("Opened youtube page");
   	 //	Thread.sleep(3000);
    	
//        this.loginPage.loadEnvironment();
//        this.loginPage.login(this.user);
    }
}