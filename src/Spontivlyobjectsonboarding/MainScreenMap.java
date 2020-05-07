package Spontivlyobjectsonboarding;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MainScreenMap {
	public MainScreenMap(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

}
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'ic explore unselect\']\n")
	public MobileElement ExploreButton;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'ic activities unselect\']")
	public MobileElement ActivitiesButton;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'ic tabbar add button\']\n")
	public MobileElement CreateEventButton;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'ic inbox unselect\']\n")
	public MobileElement InboxButton;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'ic profile unselect\']\n")
	public MobileElement ProfileButton;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'ic search\']\n")
	public MobileElement LupaButton;
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\'ic filter\']\n")
	public MobileElement FiltersButton;
}