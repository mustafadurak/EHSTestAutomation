package EHS.step_definitions;

import EHS.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before //Execute method before each scenario.
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After //Execute method after each scenario.
    public void tearDown(Scenario scenario){

        Driver.closeDriver();

    }

}
