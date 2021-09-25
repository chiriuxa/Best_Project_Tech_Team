package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_HomeBase_page {
    public Login_HomeBase_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id= "txtUsername")
    public WebElement username;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;

    @FindBy(xpath = "//div/h1")
    public WebElement dashboard;
}
