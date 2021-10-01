package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Time_Menu_Timesheets_Page {

    public Time_Menu_Timesheets_Page() {PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//*[@id='menu_time_Timesheets']")
    public WebElement timesheetsMenu;

    @FindBy (xpath = "//*[@id='menu_time_viewEmployeeTimesheet']")
    public WebElement employeeTimesheets;

    @FindBy(xpath = "(//*[@class='head'])[2]/h1")
    public WebElement timesheetsPendingActionText;

    @FindBy(xpath = "(//*[@class='table']/tbody/tr/td[3])[1]")
    public WebElement employeeViewButton;

    @FindBy(xpath = "(//*[@class='table']/tbody/tr)[1]/td[2]")
    public WebElement pendingMenuTimesheetPeriod;

    @FindBy(xpath = "//*[@id='startDates']")
    public WebElement editTimesheetPeriodMenu;

    @FindBy(xpath = "//*[@id = 'btnEdit']")
    public WebElement timesheetEditButton;

    @FindBy(xpath = "//*[@id = 'submitRemoveRows']")
    public WebElement removeRowsButton;

    @FindBy(xpath = "//*[@id = 'divMessageBar']")
    public WebElement warningMessage;

    @FindBy (xpath = "(//*[@class= 'tableWrapper']/table/tbody/tr/td[5]/input)[1]")
    public WebElement firstRowTuesdayHoursBox;

    @FindBy (xpath = "//*[@id= 'submitSave']")
    public WebElement editTimesheetSaveButton;

    @FindBy(xpath = "(//*[@class= 'tableWrapper']/table/tbody/tr/td[4])[1]")
    public WebElement timesheetsMenuFirstRowTuesdayValue;



}
