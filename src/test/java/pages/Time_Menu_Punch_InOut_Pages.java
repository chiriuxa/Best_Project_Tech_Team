package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Time_Menu_Punch_InOut_Pages {

    public Time_Menu_Punch_InOut_Pages(){
        PageFactory.initElements(Driver.getDriver(), this);}


   @FindBy(xpath = "//*[@id='mainMenuFirstLevelUnorderedList']/li[4]")
    public WebElement timeMenu;

    @FindBy(xpath = "//*[@id='menu_attendance_Attendance']")
    public WebElement attendanceSubMenu;

    @FindBy(xpath = "//*[@id='menu_attendance_punchIn']")
    public WebElement punchInOutSubMenu;

    @FindBy(xpath = "//*[@class='head']/h1")
    public WebElement punchInText;

    @FindBy(xpath = "//*[@id='attendance_note']")
    public WebElement punchInNoteTextArea;

    @FindBy(xpath = "//*[@id='btnPunch']")
    public WebElement punchInOutButton;

    @FindBy(xpath = "//*[@id='punchTimeForm']/fieldset/p")
    public WebElement getPunchInOutButtonText;

    @FindBy(xpath = "//*[@id = 'punchTimeForm']/fieldset/ol/li[2]/label[2]")
    public WebElement noteText;

}
