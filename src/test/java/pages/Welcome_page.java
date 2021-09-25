package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class Welcome_page {
    public Welcome_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "welcome")
    public WebElement welcomeAdmin;

}
