package stepDefn;

import driver.Driver;
import driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import reports.ExtentReport;

public class Steps {

	@Given("TC number (.*) and Title (.*)$")
	public void tc_number_and_title(String TC_num, String TC_title) {
		ExtentReport.createTest(TC_title);
	}

	@Given("Launch the browser")
	public void launch_the_browser() {
		Driver.initDriver();
	}

	@And("Fetch the URL")
	public void fetch_the_url() {
		DriverManager.getDriver().get("https://www.cleartheshelters.com/");
	}

	@Then("Verify the Page loading in site")
	public void verify_the_page_loading_in_site() {
		new HomePage().verifyPageLoading();
	}

	@Then("Close the browser")
	public void close_the_browser() {
		Driver.quitDriver();
	}
}