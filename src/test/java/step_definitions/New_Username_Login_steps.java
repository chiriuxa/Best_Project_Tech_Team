package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.Login_HomeBase_page;
import pages.Welcome_page;

public class New_Username_Login_steps {


    Login_HomeBase_page login_homeBase_page = new Login_HomeBase_page();
    Welcome_page welcome_page = new Welcome_page();
    Select select = new Select(Driver.getDriver().findElement(By.id("welcome")));

    @Given("i click on Welcome Paul dropdown")
    public void i_click_on_welcome_paul_dropdown() {
      // Driver.getDriver().navigate().refresh();


    }

    @When("i select Logout link")
    public void i_select_logout_link() {
        select.selectByIndex(2);

    }

    @When("i should see home base login page again")
    public void i_should_see_home_base_login_page_again() {
        String actual = Driver.getDriver().getCurrentUrl();
        String expected = "php/auth/login";
        Assert.assertTrue(actual.contains(expected));


    }

    @When("i write new created username")
    public void i_write_new_created_username() {
        login_homeBase_page.username.sendKeys(Config.getProperty("newUserName"));

    }

    @When("i write new created password")
    public void i_write_new_created_password() {
        login_homeBase_page.password.sendKeys(Config.getProperty("newPassword"));

    }

    @When("i click on the login button")
    public void i_click_on_the_login_button() {
        login_homeBase_page.loginBtn.click();

    }

    @Then("i should verify that i am logged in")
    public void i_should_verify_that_i_am_logged_in() {

        String actual = Driver.getDriver().getCurrentUrl();
        String expected = "index.php/dashboard";
        Assert.assertTrue(actual.contains(expected));


    }

}
