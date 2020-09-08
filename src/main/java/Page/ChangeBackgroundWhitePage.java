package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChangeBackgroundWhitePage {
	
	WebDriver driver;
	
	public ChangeBackgroundWhitePage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.CSS, using = "[onclick~='myFunctionWhite()']") WebElement SET_WHITE_BACKGROUND_BUTTON;
	
	public boolean SET_WHITE_BACKGROUND_BUTTON_DISPLAY() {
		return SET_WHITE_BACKGROUND_BUTTON.isDisplayed();
	}
	
	public void CLICK_SET_WHITE_BACKGROUND_BUTTON() {
		SET_WHITE_BACKGROUND_BUTTON.click();
	}
	
	public String GET_WHITE_BACKGROUND_ATTRIBUTE() {
		String whiteBackground = driver.findElements(By.cssSelector("body")).get(0).getAttribute("style");
		return whiteBackground.substring(0,whiteBackground.length()-1);
	}
}
