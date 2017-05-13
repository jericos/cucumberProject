package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pcasus on 13/05/2017.
 */
public class LoginSteps {
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

        System.out.println("Entro 1");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("Entro 3");
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        System.out.println("Entro 4");
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

    public class User{

        private String username;
        private String password ;

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
