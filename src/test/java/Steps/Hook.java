package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
//        System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
//        System.setProperty("webdriver.gecko.driver", "D:\\executeAutomation\\lib\\geckodriver.exe");
        System.setProperty("webdriver.firefox.marionette", "/lib/geckodriver.exe");
//        capabilities.setCapability("marionette", false);
        Driver = new FirefoxDriver();

    }

    @After
    public void TearDownTest(Scenario scenario){
        System.out.println("Closing the browser: MOCK");
        if(scenario.isFailed()){
            //Take Screenshot
            System.out.println(scenario.getName());
        }
        System.out.println(scenario.getName());
    }
}
