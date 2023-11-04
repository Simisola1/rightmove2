package co.uk.rightmove.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class SearchPropertyForSaleSteps {
    @Then("the details of the selected property are displayed")
    public void the_details_of_the_selected_property_are_displayed() {

    }

    @When("I click on the second result")
    public void i_click_on_the_second_result() {

    }

    @Given("I navigate to the homepage")
    public void i_navigate_to_the_homepage() {
       // WebDriver driver = WebDriverManager.chromedriver().create();//
       // driver.navigate().to("https://www.rightmove.co.uk/");//

    }

    @When("I enter {string} in the search field")
    public void i_enter_in_the_search_field(String string) {

    }

    @When("I click on the For Sale button")
    public void i_click_on_the_for_sale_button() {

    }

    @When("I ensure that the search criteria page is displayed")
    public void i_ensure_that_the_search_criteria_page_is_displayed() {

    }

    @When("I select radius {string} of the location")
    public void i_select_radius_of_the_location(String string) {

    }

    @When("I select minimum price of {string}")
    public void i_select_minimum_price_of(String string) {

    }

    @When("I select maximum price of {string}")
    public void i_select_maximum_price_of(String string) {

    }

    @When("I select minimum number of bedrooms as {string}")
    public void i_select_minimum_number_of_bedrooms_as(String string) {

    }

    @When("I select maximum number of bedrooms as {string}")
    public void i_select_maximum_number_of_bedrooms_as(String string) {

    }

    @When("I select property type as {string}")
    public void i_select_property_type_as(String string) {

    }

    @When("I select {string} as added to site option")
    public void i_select_as_added_to_site_option(String string) {

    }

    @When("I click on Find properties button")
    public void i_click_on_find_properties_button() {

    }

    @When("I verify that the search results page is displayed")
    public void i_verify_that_the_search_results_page_is_displayed() {

    }
}


