package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_page {
    public PIM_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


     @FindBy(xpath = "(//li/a/b)[2]")
    public WebElement pimLink;

    @FindBy(id = "empsearch_id")
    public WebElement idInput;

    @FindBy(id = "searchBtn")
    public WebElement searchBtn;


    @FindBy(xpath = "(//tr/td/a)[2]")
    public WebElement verifyName;



}
