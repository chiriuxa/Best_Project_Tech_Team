package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Admin_page;

public class AddingUsername_steps {

    Admin_page admin_page = new Admin_page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);


    @Given("i click on Admin Header link")
    public void i_click_on_admin_header_link() {
        admin_page.adminLink.click();

    }

    @When("i click on the Add button")
    public void i_click_on_the_add_button() {
        admin_page.addBtn.click();

    }

    @When("i select user role from dropdown")
    public void i_select_user_role_from_dropdown() {
        Select select = new Select(Driver.getDriver().findElement(By.id("systemUser_userType")));
        select.selectByVisibleText("Admin");

    }

    @When("i type employee name")
    public void i_type_employee_name() {
        admin_page.employeeName.sendKeys(Config.getProperty("employeeName"));

    }

    @When("i type username")
    public void i_type_username() {
        admin_page.username.sendKeys(Config.getProperty("newUserName"));


    }

    @When("i select status from dropdown")
    public void i_select_status_from_dropdown() {
        Select select = new Select(Driver.getDriver().findElement(By.id("systemUser_status")));
        select.selectByIndex(0);

    }

    @When("i type the password")
    public void i_type_the_password() {
        admin_page.password.sendKeys(Config.getProperty("newPassword"));

    }

    @When("i confirm the password")
    public void i_confirm_the_password() {
        admin_page.confirmPassword.sendKeys(Config.getProperty("newPassword"));

    }

    @When("i click on the Save button")
    public void i_click_on_the_save_button() {

        wait.until(ExpectedConditions.visibilityOf(admin_page.saveBtn));

        admin_page.saveBtn.click();

    }

    @Then("i should verify newUserAdmin in the list")
    public void i_should_verify_new_user_admin_in_the_list() {


        String actual = Driver.getDriver().getCurrentUrl();
        String expected = "Users";

        Assert.assertTrue(actual.contains(expected));


    }

}
