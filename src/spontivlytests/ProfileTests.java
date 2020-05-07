package spontivlytests;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Spontivlyobjectsonboarding.CreateEvent;
import Spontivlyobjectsonboarding.EditProfile;
import Spontivlyobjectsonboarding.MainScreenMap;
import Spontivlyobjectsonboarding.Onboardingobjects;
import Spontivlyobjectsonboarding.ProfilePage;
import Spontivlyobjectsonboarding.SettingsPage;
import generalSpontivly.Testbasespon;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ProfileTests extends Testbasespon {
	IOSDriver<IOSElement> driver;
	Onboardingobjects onboardingobjects;
	

	@Test
	public void ChangeProfile() throws MalformedURLException {
 	   Onboardingobjects onboardingobjects=new	Onboardingobjects(driver);
 	   MainScreenMap mainScreenMap=new MainScreenMap(driver);
 	   CreateEvent createEvent=new CreateEvent(driver);
 	   ProfilePage profilePage=new ProfilePage(driver);
 	   SettingsPage settingsPage=new SettingsPage(driver);
 	   EditProfile editProfile=new EditProfile(driver);
 	 
 	   
 	  // Photo adding  
 	 mainScreenMap.ProfileButton.click();
 	 profilePage.SettingsButton.click();
 	 settingsPage.EditButton.click();
 	 editProfile.AddPhotoButton.click();
 	 settingsPage.PhotoLibraryButton.click();
 	 settingsPage.AllPhotosLibraryProfile.click();
 	 settingsPage.ChoosePhotoFromLibrary.click();
 	 
 	 editProfile.AddNameField.click();
 	 editProfile.AddNameField.sendKeys("Sergey QA");
 	 editProfile.AddDescriptionField.click();
 	 editProfile.AddDescriptionField.sendKeys("Super Event creator");
 	 editProfile.DateOfBirth.click();
 	 editProfile.DateOfBirth.sendKeys("07301992");
 	 editProfile.AddEmail.click();
 	 editProfile.AddEmail.sendKeys("jfugfjv@gmail.com");
 	 editProfile.EditProfileSaveButton.click();
 	 editProfile.EditProfileBackButton.click();
 	 
 	   String actualScreencaption;
			  actualScreencaption=driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\'Sergey 096 \']\n").getAttribute("label"); 
			  boolean isFound = actualScreencaption.contains("Sergey QA");			  	
			  Assert.assertEquals(isFound, true);
 	  
	   String descriptionField;
			  descriptionField=driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\'\']\n").getAttribute("label");
			  boolean isFound1 = descriptionField.contains("Super Event creator");			  	
			  Assert.assertEquals(isFound1, true);
			  		
	
	}	 
 	 
 	 //negative (swearing)
 	 @Test
 	public void SwearingWords() throws MalformedURLException {
 	 	   Onboardingobjects onboardingobjects=new	Onboardingobjects(driver);
 	 	   MainScreenMap mainScreenMap=new MainScreenMap(driver);
 	 	   CreateEvent createEvent=new CreateEvent(driver);
 	 	   ProfilePage profilePage=new ProfilePage(driver);
 	 	   SettingsPage settingsPage=new SettingsPage(driver);
 	 	   EditProfile editProfile=new EditProfile(driver);
 	 
}
}