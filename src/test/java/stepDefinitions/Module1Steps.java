package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import helpers.NavigateActions;
import helpers.SearchActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.Homepage;

public class Module1Steps {
	@Steps
	NavigateActions navigate;
	
	@Steps
	SearchActions searchactions;
	
	Homepage homepage;

	@Given("I am on homescreen")
	public void i_am_on_homescreen() {
		System.out.println("I am on homescreen.");
		navigate.toTheDuckDuckgo();
	}

	@Then("I duckduckgo logo should be visible")
	public void i_duckduckgo_logo_should_be_visible() {
		assertTrue(homepage.isHeadingVisible());
	}

	@When("I enter cucumber in search field and press enter")
	public void i_enter_cucumber_in_search_field() {
		searchactions.searchKeywordPressEnter(homepage.getSearchfield(), "Cucumber");
	}

	@Then("Search results are displayed")
	public void search_results_are_displayed() {
		System.out.println("Implement code to verify search results.");
	}

	@When("I press enter in search field without entering data")
	public void i_press_enter_in_search_field_without_entering_data() {
		searchactions.pressEnterWithoutEnteringKeyword(homepage.getSearchfield());
	}

	@Then("Pointer remains on same page")
	public void pointer_remains_on_same_page() {
		assertTrue(homepage.isHeadingVisible());
	}
}
