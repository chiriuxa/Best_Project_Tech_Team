package step_definitions;

import Utilities.Config;
import Utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Time_Menu_Timesheets_Page;

public class Time_Menu_Timesheets_Steps {

    Time_Menu_Timesheets_Page time_menu_timesheets_page = new Time_Menu_Timesheets_Page();

    Actions actions = new Actions(Driver.getDriver());

    @Given("Hover over Timesheets link")
    public void hover_over_timesheets_link() {
        actions.moveToElement(time_menu_timesheets_page.timesheetsMenu);
    }

    @When("Press Employee Timesheets")
    public void press_employee_timesheets() {
       time_menu_timesheets_page.employeeTimesheets.click();
    }

    @When("Under Timesheets Pending Action Press first employee view link")
    public void under_timesheets_pending_action_press_first_employee_view_link() {
      time_menu_timesheets_page.employeeViewButton.click();
    }

    @When("Press edit button")
    public void press_edit_button() {
       time_menu_timesheets_page.timesheetEditButton.click();
    }

    @When("Press Remove Rows Button")
    public void press_remove_rows_button() {
        time_menu_timesheets_page.removeRowsButton.click();
    }

    @When("Select Record to remove text must be displayed")
    public void select_record_to_remove_text_must_be_displayed() {
        Assert.assertEquals(Config.getProperty("editTimesheetMenuWarningMessage"),time_menu_timesheets_page.warningMessage);
    }

    @When("Adding in first row for tuesday two hours")
    public void adding_in_first_row_for_tuesday_two_hours() {
         time_menu_timesheets_page.firstRowTuesdayHoursBox.clear();
        time_menu_timesheets_page.firstRowTuesdayHoursBox.sendKeys("2:00");

    }

    @When("Press save button")
    public void press_save_button() {
        time_menu_timesheets_page.editTimesheetSaveButton.click();
    }

    @When("Check if two hours has been added to first row tuesday")
    public void check_if_two_hours_has_been_added_to_first_row_tuesday() {
       Assert.assertEquals("2:00",time_menu_timesheets_page.timesheetsMenuFirstRowTuesdayValue.getText());
    }


}
