package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Login_HomeBase_page;

public class Login_HomeBase_steps {

    Login_HomeBase_page login_homeBase_page = new Login_HomeBase_page();


    @Given("I am in the Login page")
    public void i_am_in_the_login_page() {
        Driver.getDriver().get(Config.getProperty("url"));

    }

    @When("enter username in the input box")
    public void enter_username_in_the_input_box() {
        login_homeBase_page.username.sendKeys(Config.getProperty("userName"));

    }
    @When("enter password in the input")
    public void enter_password_in_the_input() {
        login_homeBase_page.password.sendKeys(Config.getProperty("password"));
    }


    @When("click on the Login button")
    public void click_on_the_login_button() {
        login_homeBase_page.loginBtn.click();

    }

    @Then("verify that i am logged in")
    public void verify_that_i_am_logged_in() {
        Assert.assertTrue(login_homeBase_page.dashboard.getText().contains("Dashboard"));



    }

}
