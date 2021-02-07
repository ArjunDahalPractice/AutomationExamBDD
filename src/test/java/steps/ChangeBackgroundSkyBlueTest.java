package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.ChangeBackgroundSkyBluePage;
import Page.ChangeBackgroundWhitePage;
import Util.BasePage;
import Util.BrowserFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangeBackgroundSkyBlueTest {
	
	public WebDriver driver;
	ChangeBackgroundSkyBluePage changeBackgroundSkyBluePage;
	ChangeBackgroundWhitePage changeBackgroundWhitePage;
	
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
	    driver = BrowserFactory.lunchWebsite();
	    changeBackgroundSkyBluePage = PageFactory.initElements(driver, ChangeBackgroundSkyBluePage.class);
	    boolean skyBlueButtonExists = changeBackgroundSkyBluePage.SET_SKYBLUE_BACKGROUND_BUTTON_DISPLAY();
	    Assert.assertTrue("Set skyblue background button is not exists", skyBlueButtonExists);
	}

	@When("^I click on Set SkyBlue Background button$")
	public void i_click_on_Set_SkyBlue_Backgroundthe_button() {
		changeBackgroundSkyBluePage.CLICK_SET_SKYBLUE_BACKGROUND_BUTTON();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		String expectedSkyBlueAttribute = "background-color: skyblue";
		String actualSkyBlueAttribute = changeBackgroundSkyBluePage.GET_BACKGROUND_ATTRIBUTE();
		Assert.assertEquals("Background didn't change into sky blue", expectedSkyBlueAttribute, actualSkyBlueAttribute);
		BasePage.takeSnapshot(driver, " SkyBlueBackground");
		BasePage.tearDown(driver);
	}

}
