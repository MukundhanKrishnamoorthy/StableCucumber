package pages;

import org.openqa.selenium.By;

import driver.DriverManager;
import enums.WaitStrategy;

public final class HomePage extends BasePage {
	
	private final By headerLogo = By.xpath("//div[@class='white-label-header__logo']/a/img");
	private final By footerLogo = By.xpath("//a[@class='site-footer__logo']/img");

	public String getPageTitle() {
		isElementDisplayed(headerLogo, "Header logo", WaitStrategy.PRESENCE);
		return DriverManager.getDriver().getTitle();
	}
	
	public boolean verifyPageLoading() {
		isElementDisplayed(headerLogo, "Header logo", WaitStrategy.PRESENCE);
		isElementDisplayed(footerLogo, "Footer Logo", WaitStrategy.PRESENCE);
		return true;
	}
}