package spontivlytests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Spontivlyobjectsonboarding.CreateEvent;
import Spontivlyobjectsonboarding.MainScreenMap;
import Spontivlyobjectsonboarding.Onboardingobjects;
import generalSpontivly.Testbasespon;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Create_event_tests extends Testbasespon {
	IOSDriver<IOSElement> driver;
	Onboardingobjects onboardingobjects;
	
       @Test
       public void Createevent() throws MalformedURLException {
    	   Onboardingobjects onboardingobjects=new	Onboardingobjects(driver);
    	   MainScreenMap mainScreenMap=new MainScreenMap(driver);
    	   CreateEvent createEvent=new CreateEvent(driver);
    	//event creating   
    	   //photo adding
    	   mainScreenMap.CreateEventButton.click();
    	   createEvent.AddPhotoButton.click();
    	   createEvent.PhotoLibraryButton.click();
    	   createEvent.AllPhotosLibraryButton.click();
    	   createEvent.AddPhotofromLibrary.click();
    	   
    	   //activityname adding
    	   createEvent.ActivityNameButton.click();
    	   createEvent.ActivityNameButton.sendKeys("Hello");
    	   
    	 //tag adding
    	   createEvent.AddActivityTagsButton.click();
    	    createEvent.SelectTagsCategory.click();
    	    createEvent.SpeedDatingTag.click();
    	    
    	   //location
    	    createEvent.LocationButton.click();
    	    createEvent.ChooseLocationSearchField.click();
    	    createEvent.ChooseLocationSearchField.sendKeys("cur");
    	     createEvent.CurrentLocationButton.click();
    	     createEvent.FinalLocationChoose.click();
    	     
    	     
    	     //start end date and time
    	     createEvent.StartTime.click();
    	     createEvent.ChooseDateEvent.click();
    	     createEvent.DoneButtonDatePicker.click();
    	     
    	     //description
    	     createEvent.AddDescription.click();
    	     createEvent.AddDescription.sendKeys("Cool Event Welcome");
    	     createEvent.CreateEventFinalButton.click();
       }
       
       
       @Test
       public void Createeventnegative() throws MalformedURLException {
    	   Onboardingobjects onboardingobjects=new	Onboardingobjects(driver);
    	   MainScreenMap mainScreenMap=new MainScreenMap(driver);
    	   CreateEvent createEvent=new CreateEvent(driver);
       
       }
}
