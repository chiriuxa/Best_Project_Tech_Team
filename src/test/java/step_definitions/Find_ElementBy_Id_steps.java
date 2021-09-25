package step_definitions;

import Utilities.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.filefilter.ConditionalFileFilter;
import org.junit.Assert;
import pages.PIM_page;

public class Find_ElementBy_Id_steps {

    PIM_page pim_page = new PIM_page();


    @Given("i click on PIM header link")
    public void i_click_on_pim_header_link() {
        pim_page.pimLink.click();

    }

    @When("i write an id on the ID input box")
    public void i_write_an_id_on_the_id_input_box() {
        pim_page.idInput.sendKeys(Config.getProperty("id"));

    }

    @When("i click on the search button")
    public void i_click_on_the_search_button() {
        pim_page.searchBtn.click();

    }

    @When("i should see element appeared on the search list")
    public void i_should_see_element_appeared_on_the_search_list() {
        String actual = pim_page.verifyName.getText();
        String expected = "Lisa";
        Assert.assertTrue(actual.equals(expected));

    }


}
