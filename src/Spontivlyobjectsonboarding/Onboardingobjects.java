package Spontivlyobjectsonboarding;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Onboardingobjects {
	public Onboardingobjects(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'checkBoxEmpty\']\n")
		public MobileElement CheckBox;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'CONTINUE\']\n")
		public MobileElement ContinueButton;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n") 
		public MobileElement AddNameButton;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'CONTINUE\']\n")
		public MobileElement AddNameContinueButton;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField\n") 
		public MobileElement AddDateBirth;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n")
		public MobileElement AddMonthBirth;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField\n")
		public MobileElement AddYearBirth;	
		@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'CONTINUE\']\n")
		public MobileElement AddBirthContinueButton;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n") 
		public MobileElement AddPhoneNumberField;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'CONTINUE\']\n") 
		public MobileElement AddPhoneContinueButton;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField\n")
		public MobileElement FirtsCodeNumber;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n") 
		public MobileElement SecondCodeNumber;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField\n") 
		public MobileElement ThirdCodeNumber;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeTextField\n")
		public MobileElement FourthCodeNumber;	
		@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'CONTINUE\']\n")
		public MobileElement CodeContinueButton;
		@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'So, I need your phone number just to be safe\']\n")		
		public MobileElement ChooseCountryNumber;			
}
