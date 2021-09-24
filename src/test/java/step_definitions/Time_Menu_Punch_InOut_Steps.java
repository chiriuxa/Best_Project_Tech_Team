package step_definitions;

import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Time_Menu_Punch_InOut_Pages;

public class Time_Menu_Punch_InOut_Steps {

    Time_Menu_Punch_InOut_Pages time_menu_punch_inOut_pages = new Time_Menu_Punch_InOut_Pages();

    Actions actions = new Actions(Driver.getDriver());


    @Given("Click on time header link")
    public void click_on_time_header_link() {
        time_menu_punch_inOut_pages.timeMenu.click();

    }

    @When("Hover over Attendance drop down")
    public void hover_over_attendance_drop_down() {
        actions.moveToElement(time_menu_punch_inOut_pages.attendanceSubMenu).perform();

    }

    @When("Selecting Punch In Out")
    public void selecting_punch_in_out() {
        time_menu_punch_inOut_pages.punchInOutSubMenu.click();

    }

    @When("Verifying Punch In text Is displayed")
    public void verifying_punch_in_text_is_displayed(){
        Assert.assertEquals("Punch In",time_menu_punch_inOut_pages.punchInText.getText());

    }

    @When("Adding a note")
    public void adding_a_note() {
        time_menu_punch_inOut_pages.punchInNoteTextArea.sendKeys("I'm in");

    }

    @When("Click on In button")
    public void click_on_in_button() {
        time_menu_punch_inOut_pages.punchInOutButton.click();

    }

}
