package Spontivlyobjectsonboarding;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class ProfilePage {
	public ProfilePage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]\n") 
	public MobileElement ProfilePagePhoto;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'Find People\']\n")
	public MobileElement FindPeopleButton;		
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'7695\']\n")
	public MobileElement ScoreButton;	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'8\']\n")
	public MobileElement FollowersButton;	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'7\']\n")
	public MobileElement FollowingButton;		
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'settings icon\']\n") 
	public MobileElement SettingsButton;	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'serg \']\n")
	public MobileElement NameVisisble;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'\']\n")
	public MobileElement DescriptionVisible;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'View all\']\n") 
	public MobileElement ReviewViewAllButton;	
}
