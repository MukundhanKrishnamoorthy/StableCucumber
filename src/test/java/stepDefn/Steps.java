package stepDefn;

import org.testng.Assert;

import driver.Driver;
import driver.DriverManager;
import enums.ProjectConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import reports.ExtentReport;
import utils.PropertyUtils;

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
		DriverManager.getDriver().get(PropertyUtils.getValueFromConfigMap(ProjectConfig.URL));
	}

	@Then("Verify the Home Page title in site")
	public void verify_the_home_page_title_in_site() {
		String title = new HomePage().getPageTitle();
		Assert.assertTrue(title.equalsIgnoreCase("Clear the Shelters – Clear the Shelters"));
	}
	
	@Then("Verify the Page loading in site")
	public void verify_the_page_loading_in_site() {
		boolean result = new HomePage().verifyPageLoading();
		Assert.assertTrue(result);
	}

	@Then("Close the browser")
	public void close_the_browser() {
		Driver.quitDriver();
	}
}