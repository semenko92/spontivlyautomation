package generalSpontivly;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

//нажимаем галочку terms and conditions

public class Testbasespon {
	public static IOSDriver<IOSElement> mycapabilities1() throws MalformedURLException {
	
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("platformName", "iOS");
	cap.setCapability("platformVersion", "13.0");
	cap.setCapability("automationName", "XCUITest");
	cap.setCapability("deviceName","iPhone 11 Pro");
	cap.setCapability("bundleId","com.spontivly.spontivly");
	IOSDriver<IOSElement> driver=new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	return driver;
				
}
}