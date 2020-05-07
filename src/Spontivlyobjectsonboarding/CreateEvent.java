package Spontivlyobjectsonboarding;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CreateEvent {
	public CreateEvent(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeImage\n") 
		public MobileElement AddPhotoButton;	
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n") 
	public MobileElement ActivityNameButton;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeCollectionView\n") 
	public MobileElement AddActivityTagsButton;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton\n")
	public MobileElement LocationButton;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]\n")
	public MobileElement StartTime;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]\n")
	public MobileElement EndTime;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeTextView\n")
	public MobileElement AddDescription;
	
	@iOSXCUITFindBy(accessibility="Photo Library")
	public MobileElement PhotoLibraryButton;
	
	@iOSXCUITFindBy(accessibility="All Photos")
	public MobileElement AllPhotosLibraryButton;
	
	@iOSXCUITFindBy(accessibility="Photo, Landscape, August 09, 2012, 12:55 AM")
	public MobileElement AddPhotofromLibrary;
	
	@iOSXCUITFindBy(accessibility="Casual Socials")
	public MobileElement SelectTagsCategory;
	
	@iOSXCUITFindBy(accessibility="Speed dating")
	public MobileElement SpeedDatingTag;

	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n")
	public MobileElement ChooseLocationSearchField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeButton\n") 
	public MobileElement ChooseLocationBackButton;
	
	@iOSXCUITFindBy(accessibility="Current Location")
	public MobileElement CurrentLocationButton;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'801 Market St, San Francisco, CA 94103, USA\']\n")
	public MobileElement FinalLocationChoose;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'Confirm\']\n") 
	public MobileElement ConfirmLocationButton;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'Recommended Ages\']\n")
	public MobileElement ChooseDateEvent;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'Done\']\n") 
	public MobileElement DoneButtonDatePicker;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\'Create\']\n")
	public MobileElement CreateEventFinalButton;
			
	
	
	
	
	
		


}