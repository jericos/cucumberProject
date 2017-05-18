package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

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
//        base.Driver = new ChromeDriver();

        Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Google Nexus 5");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");

        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("mobileEmulation", mobileEmulation);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//        WebDriver driver = new ChromeDriver(capabilities);
        base.Driver = new ChromeDriver(capabilities);

    }

    @After
    public void TearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            //Take Screenshot
            System.out.println(scenario.getName());
        }
//        base.Driver.quit();
    }
}