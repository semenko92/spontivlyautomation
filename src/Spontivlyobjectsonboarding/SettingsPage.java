package Spontivlyobjectsonboarding;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SettingsPage {
	public SettingsPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'Edit\']\n") 
	public MobileElement EditButton;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'Moderate Events\']\n")
	public MobileElement ModerateEventsButton;	
	
	@iOSXCUITFindBy(accessibility="Photo Library")
	public MobileElement PhotoLibraryButton;
	
	@iOSXCUITFindBy(accessibility="All Photos\n")
	public MobileElement AllPhotosLibraryProfile;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[@name=\'Photo, Portrait, August 09, 2012, 12:29 AM\']\n")
	public MobileElement ChoosePhotoFromLibrary;
	
	
			
			
			



}
