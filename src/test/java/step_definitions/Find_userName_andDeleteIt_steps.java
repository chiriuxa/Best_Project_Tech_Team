package step_definitions;

import Utilities.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Admin_page;
import pages.Welcome_page;

public class Find_userName_andDeleteIt_steps {

    Admin_page admin_page = new Admin_page();


    @Given("i click on Admin header link")
    public void i_click_on_admin_header_link() {
        admin_page.adminLink.click();

    }

    @When("i write new admins name")
    public void i_write_new_admins_name() {
        admin_page.inputUserName.sendKeys(Config.getProperty("newUserName"));

    }

    @When("i click on search button")
    public void i_click_on_search_button() {
        admin_page.searchBtn.click();

    }

    @When("i select Admin from the checkBox")
    public void i_select_admin_from_the_check_box() {
        admin_page.checkBox.click();


    }

    @When("i click on Delete button")
    public void i_click_on_delete_button() {
        admin_page.deleteBtn.click();

    }

    @When("i click on Ok button")
    public void i_click_on_ok_button() {
        admin_page.okBtn.click();

    }

    @Then("i should see verification message")
    public void i_should_see_verification_message() {
        String actual = admin_page.verifyDltMsg.getAttribute("type");
        String expected = "uccessfully Deleted";
        Assert.assertTrue(actual.contains(expected));


    }


}
