package Spontivlyobjectsonboarding;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ActivitiesScreen {
	public ActivitiesScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'Interested\']\n")
	public MobileElement InterestedButton;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'Joined\']\n")
	public MobileElement JoinedButton;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'My Pins\']\n")
	public MobileElement MyPinsButton;	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'refresh icon\']\n") 
	public MobileElement HistoryButton;		
}
	
	
	