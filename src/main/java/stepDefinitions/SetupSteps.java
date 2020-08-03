package stepDefinitions;

import Utils.Controller;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SetupSteps {
    Controller controller;
//    User user;
//    public Setup(Controller controller, User user) {
//        this.controller = controller;
//        this.user = user;
//    }
    
    public SetupSteps(Controller controller) {
      this.controller = controller;
//      this.user = user;
  }
    
    @Before
    public void setup() {
    	System.out.println("Setup method with Before anatation.");
        controller.setupChrome();
    }
    @After
    public void teardown() {
    	System.out.println("teardown method with After anatation.");
        controller.teardownController();
    }
}
