package com.globallogic.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.globallogic.pageobejects.PopularShowsPages;
import com.globallogic.utils.DriverInitialisation;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PopularShowSteps {

	private WebDriver driver = null;

	DriverInitialisation driverinitialisation;
	PopularShowsPages page;

	@Before
	public void beforeScenario() {
		driverinitialisation = new DriverInitialisation();
		driver = driverinitialisation.runBrowser("Chrome");
		page = new PopularShowsPages(driver);
	}

	@Given("^application \"([^\"]*)\"$")
	public void application(String url) throws Throwable {

		driver.get(url);

	}

	@Then("^verify that home page is displayed\\.$")
	public void verify_that_home_page_is_displayed() throws Throwable {

	}

	@Then("^Scroll down to popular shows$")
	public void scroll_down_to_popular_shows() throws Throwable {

		page.navigate_to_popular_shows();
	}

	@Then("^Navigate to the last video by pressing the icon “>”$")
	public void navigate_to_the_last_video_by_pressing_the_icon() throws Throwable {

		page.press_right_arrow_until_element_is_in_visble();

	}

	@Then("^Once you reach the last video, click on EXPLORE THE SHOW$")
	public void once_you_reach_the_last_video_click_on_EXPLORE_THE_SHOW() throws Throwable {
		page.explore_show();
	}

	@Then("^click on “SHOW MORE”  til last page  and write all the show titles and duration into it\\.$")
	public void click_on_SHOW_MORE_til_last_page_and_write_all_the_show_titles_and_duration_into_it() throws Throwable {
		page.load_all_shows_till_end();
	}

	@After
	public void afterScenario() {
		driver.quit();
	}
}
