package Spontivlyobjectsonboarding;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EditProfile {
	
		public EditProfile(AppiumDriver driver) {
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'add user image\']\n")
		public MobileElement AddPhotoButton;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[1]\n") 
		public MobileElement AddNameField;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextView\n") 
		public MobileElement AddDescriptionField;		
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeTextField\n") 
		public MobileElement DateOfBirth;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]\n")
		public MobileElement AddEmail;		
		@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'Save\']\n")
		public MobileElement EditProfileSaveButton;
		@iOSXCUITFindBy(accessibility="backButton Profile\n") 
		public MobileElement EditProfileBackButton;	
		
		
}
