package spontivlytests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import generalSpontivly.Testbasespon;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;


import org.testng.annotations.Test;

public class UpdateScreenTest extends Testbasespon {
	  @Test
	  public void ButtonsTest() throws MalformedURLException {
		    IOSDriver<IOSElement> driver=mycapabilities1();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElementByXPath("//XCUIElementTypeButton[@name=\'checkBoxEmpty\']\n").click();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			

			  driver.findElementByXPath("////XCUIElementTypeButton[@name=\'CONTINUE\']\n").click();
			  String expectedScreenCaption="Your name"; // здесь я так понимаю должно было быть имя, которое ты потом используешь во втором тесте, можно сделать переменную и вынести ее в метод с аннотацией @BeforeTest
			  String actualScreenCaption;
			  actualScreenCaption=driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n").getAttribute("value");
			  Assert.assertEquals(actualScreenCaption, expectedScreenCaption);
	  }	  
		@Test	 
		public void ButtonsTest2() throws MalformedURLException {
			  IOSDriver<IOSElement> driver=mycapabilities1();
			  driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n").click(); 
			  driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n").sendKeys("Sergey"); 
			  driver.hideKeyboard();
			  driver.findElementByXPath("//XCUIElementTypeButton[@name=\'CONTINUE\']\n").click(); 
		
			  //String expectedScreencaption="Hey Sergey, when’s your birthday?";
			 
			  String actualScreencaption;
			  actualScreencaption=driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\'Hey Sergey, when’s your birthday?\']\n").getAttribute("label");
			  boolean isFound = actualScreencaption.contains("Sergey");
			  	
			  Assert.assertEquals(isFound, true);
	
		  
	      /*@Test   
	      public void ButtonsTest3() throws MalformedURLException {
			  IOSDriver<IOSElement> driver=mycapabilities1();
			  */
	            
	          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField\n").sendKeys("30"); 
	          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n").click();
	          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n").sendKeys("07");
	          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField\n").click();
	          driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeTextField\n").sendKeys("1992");
	          driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\'CONTINUE\']\n").click();
		}
	      
	        @Test
	        public void ButtonsTest4() throws MalformedURLException {
				  IOSDriver<IOSElement> driver=mycapabilities1();
				  
		      driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n").click();
		      driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n").sendKeys("965385403");
		      driver.hideKeyboard(); 
	        }							
	        
}
	    
			
			//@Test(priority=2)
			//public void NameTest1() throws MalformedURLException {
				  //IOSDriver<IOSElement> driver=mycapabilities();
				  //driver.findElementByXPath("//XCUIElementTypeApplication[@name=\'Spontivly\']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n").click(); 
				  //String expectedNameHolder="Your name";
				  //String actualNameHolder=""
	              
				  
				  		
				  		
	  


