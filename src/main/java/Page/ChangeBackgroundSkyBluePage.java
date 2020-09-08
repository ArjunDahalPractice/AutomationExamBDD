package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChangeBackgroundSkyBluePage {

	WebDriver driver;
	public ChangeBackgroundSkyBluePage (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.CSS, using = "[onclick~='myFunctionSky()']") WebElement SET_SKYBLUE_BACKGROUND_BUTTON;
	
	public boolean SET_SKYBLUE_BACKGROUND_BUTTON_DISPLAY() {
		return SET_SKYBLUE_BACKGROUND_BUTTON.isDisplayed();
	}
	public void CLICK_SET_SKYBLUE_BACKGROUND_BUTTON() {
		SET_SKYBLUE_BACKGROUND_BUTTON.click();
	}
	
	public String GET_BACKGROUND_ATTRIBUTE() {
		String skyBlueBackground = driver.findElements(By.cssSelector("body")).get(0).getAttribute("style");
		return skyBlueBackground.substring(0,skyBlueBackground.length()-1);
	}
	
	
}
