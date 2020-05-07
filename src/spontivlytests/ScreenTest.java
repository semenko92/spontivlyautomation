package spontivlytests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import generalSpontivly.Testbasespon;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


public class ScreenTest extends Testbasespon {
  @Test
  public void ButtonsTest() throws MalformedURLException {
	  IOSDriver<IOSElement> driver=mycapabilities1();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//XCUIElementTypeButton[@name=\'checkBoxEmpty\']\n").click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		

		  driver.findElementByXPath("//XCUIElementTypeButton[@name=\'CONTINUE\']\n").click();
		  String actualScreenCaption="Your name";
		  String expectedScreenCaption;
		  expectedScreenCaption=driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n").getAttribute("value");
		  Assert.assertEquals(actualScreenCaption, expectedScreenCaption);
  }	  
	@Test	 
	public void ButtonsTest2() throws MalformedURLException {
		  IOSDriver<IOSElement> driver=mycapabilities1();
		  driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n").click(); 
		  driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n").sendKeys("Sergey"); 
		  driver.hideKeyboard();
		  driver.findElementByXPath("//XCUIElementTypeButton[@name=\'CONTINUE\']\n").click(); 
	
		  //String actualScreencaption="Hey Sergey, when’s your birthday?";
		  String actualScreencaption;
		  //boolean isFound = actualScreencaption.contains("Sergey");
		  //String expectedScreencaption;
		  actualScreencaption=driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\'Hey Sergey, when’s your birthday?\']\n").getAttribute("label");
		  boolean isFound = actualScreencaption.contains("Sergey1");
		  //Assert.assertEquals(actualScreencaption, expectedScreencaption);	
		  Assert.assertEquals(isFound, true);
		 
}
}		  
      /* @Test   
      public void ButtonsTest3() throws MalformedURLException {
		  IOSDriver<IOSElement> driver=mycapabilities1();
            
          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField\n").sendKeys("30"); 
          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n").click();
          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n").sendKeys("07");
          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField\n").click();
          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField\n").sendKeys("1992");
          driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\'CONTINUE\']\n").click();
          
          
	      driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n").click();
	      driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n").sendKeys("965385403");
	      driver.hideKeyboard(); 
	      								
  }
    //Assert.assertEquals(actualScreenCaption, expectedScreenCaption);
		
		//@Test(priority=2)
		//public void NameTest1() throws MalformedURLException {
			  //IOSDriver<IOSElement> driver=mycapabilities();
			  //driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n").click(); 
			  //String expectedNameHolder="Your name";
			  //String actualNameHolder=""
              
			  
			  		
			  		
  }

*/
