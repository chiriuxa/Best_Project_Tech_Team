package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class Admin_page {
    public  Admin_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li/a[@id=\"menu_admin_viewAdminModule\"]/b)[1]")
    public WebElement adminLink;

    @FindBy(id= "btnAdd" )
    public WebElement addBtn;

    @FindBy(id= "systemUser_employeeName_empName")
    public WebElement employeeName;

    @FindBy(id= "systemUser_userName")
    public WebElement username;


    @FindBy(id= "systemUser_password")
    public WebElement password;


    @FindBy(id = "systemUser_confirmPassword")
    public WebElement confirmPassword;


    @FindBy(xpath = "//p/input[@value=\"Save\"]")
    public WebElement saveBtn;

    @FindBy(id = "searchSystemUser_userName")
    public WebElement inputUserName;

    @FindBy(id = "searchBtn")
    public WebElement searchBtn;

    @FindBy(id = "ohrmList_chkSelectAll")
    public WebElement checkBox;

    @FindBy(id = "btnDelete")
    public WebElement deleteBtn;

    @FindBy(xpath = "//div[@id=\"deleteConfModal\"]/div/input[@id=\"dialogDeleteBtn\"]")
    public WebElement okBtn;

    @FindBy(css = "div>form>script[type=\"text/javascript\"]")
    public WebElement verifyDltMsg;










}
