package stepDefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import helpers.NavigateActions;
import helpers.SearchActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.AmazonHomepage;
import pages.Homepage;

public class Module2_AmazonTestSteps {
	AmazonHomepage amazonhomepage;
	Homepage homepage;

	@Steps(shared = true)
	NavigateActions navigate;

	@Steps(shared = true)
	SearchActions searchactions;

	String productname;

	@Given("user searches {string} in Amazon home page")
	public void user_searches_in_amazon_home_page(String string) {
		amazonhomepage.open();
		searchactions.searchKeywordPressEnter(amazonhomepage.getSearchtextbox(), string);

	}

	@When("user adds first product from the search result to cart")
	public void user_adds_first_product_from_the_search_result_to_cart() throws InterruptedException {
		amazonhomepage.clickOn(amazonhomepage.getFirstProductOfResult());
		navigate.navigateToFirstChildWindow();
		amazonhomepage.waitFor(amazonhomepage.getAddtoCartBtn());
		productname = amazonhomepage.getProductTitle();
		amazonhomepage.clickOn(amazonhomepage.getAddtoCartBtn());
	}

	@When("user navigates to Cart page")
	public void user_navigates_to_cart_page() {
		navigate.navigateToCart();
	}

	@Then("user validates whether above added product is added in Cart")
	public void user_validates_whether_above_added_product_is_added_in_cart() {
		assertThat(productname.contains("Nike"));
	}

	@Then("user exits from the application")
	public void user_exits_from_the_application() {
		System.out.println("Browser automatically closed. Text completed.");
	}
}
