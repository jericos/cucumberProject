package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class CommonSteps extends BaseUtil{

    private BaseUtil base;

    public CommonSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I access to prototype protected$")
    public void iAccessToPrototypeProtected() throws Throwable {

        base.Driver.navigate().to("https://marvelapp.com/38hfdih/screen/28082949");
        Thread.sleep(2000);
        base.Driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("huayacucho");
        base.Driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        Thread.sleep(2000);
        base.Driver.findElement(By.xpath("//div[@class='AddToHomeScreen__closeAndroid___2VyOW c-blue fontSize-m']")).click();
        Thread.sleep(2000);
        base.Driver.findElement(By.xpath("//div[@class='Hotspot__hotspot___1uv7p']")).click();
    }
}
