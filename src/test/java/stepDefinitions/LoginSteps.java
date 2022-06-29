package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginSteps {

    @Given("^user is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("navigated to login url");
    }

    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String username, String password) {
        System.out.println("Username = " + username);
        System.out.println("Password = " + password);

    }

    @Then("^home page is populate$")
    public void home_page_is_populate() throws Throwable {
        System.out.println("populate");
    }

    @And("^cards are \"([^\"]*)\"$")
    public void cards_are_something(String strArg1) {
        System.out.println("And cards are " + strArg1);

    }



}
