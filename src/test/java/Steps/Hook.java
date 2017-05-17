package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {

        this.base = base;
    }

    @Before
    public void InitializeTest(){
//        System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
//        base.Driver = new FirefoxDriver();
        base.Driver = new ChromeDriver();

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
