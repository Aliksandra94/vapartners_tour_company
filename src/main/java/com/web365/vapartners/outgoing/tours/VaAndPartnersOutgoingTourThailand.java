package com.web365.vapartners.outgoing.tours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.vapartners.page.base.VaAndPartnersBasePage;
import static com.web365.vapartners.outgoing.tours.VaAndPartnersOutgoingTourThailandConstants. *;
public class VaAndPartnersOutgoingTourThailand extends VaAndPartnersBasePage {

	public VaAndPartnersOutgoingTourThailand(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	
	@FindBy(xpath = OUTGOING_TOURS_XPATH)
	public WebElement outgoingTours;
	
	@FindBy(xpath = MORE_BUTTON)
	public WebElement moreButton;
	
	@FindBy(xpath = THAILAND_TOUR)
	public WebElement thailandTour;
	
	@FindBy(xpath = NAME)
	public WebElement name;
	
	@FindBy(xpath = PHONE)
	public WebElement phone;
	
	@FindBy(xpath = EMAIL)
	public WebElement email;
	
	@FindBy(xpath = MESSAGE)
	public WebElement message;
	
	@FindBy(xpath = TO_ORDER)
	public WebElement toOrder;
	
	
	public VaAndPartnersOutgoingTourThailand goToMore() {
		outgoingTours.click();
		return new VaAndPartnersOutgoingTourThailand(this.driver);
	}
	
			

}
