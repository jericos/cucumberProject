package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import Transformation.SalaryCountsTransform;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginSteps extends BaseUtil {

    private BaseUtil base;

    public LoginSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

       base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("Entro 3");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
//        System.out.println("The driver is "+base.StepInfo);
    }


    @And("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {

/*        List<List<String>> data = table.raw();
        System.out.println("The value is "+data.get(0).get(0).toString());
        System.out.println("The value is "+data.get(0).get(1).toString());*/

        //Create an Arraylist
        List<User> users = new ArrayList<User>();
        //Store all the users
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("The value is "+user.username);
            System.out.println("The value is "+user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) throws Throwable {
        System.out.println("Username is : "+userName);
        System.out.println("Password is : "+password);

    }

    @And("^I enter the users email address as Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {
        System.out.println("The email Address is "+email);
    }

    @And("^I verify the count of my salary digits for Rs (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsForRs(@Transform(SalaryCountsTransform.class) int salary) throws Throwable {

        System.out.println("My salary digits count is "+salary);
    }

    public class User{

        private String username;
        private String password;

        public User(String userName, String passWord){
            username = userName;
            password = passWord;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}
