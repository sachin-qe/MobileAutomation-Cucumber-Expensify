package com.sachin.base;

import com.sachin.PropertiesMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseClass {
    protected AppiumDriver<MobileElement> driver;
    @BeforeTest
    public void setup() {
        try {
            PropertiesMap propertiesMap = new PropertiesMap(System.getProperty("user.dir")+"/src/test/resources/config.properties");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, propertiesMap.getData("PLATFORM_NAME"));
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, propertiesMap.getData("PLATFORM_VERSION"));
            caps.setCapability(MobileCapabilityType.UDID, propertiesMap.getData("UDID"));
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, propertiesMap.getData("DEVICE_NAME"));
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, propertiesMap.getData("NEW_COMMAND_TIMEOUT"));
            caps.setCapability(MobileCapabilityType.APP, propertiesMap.getData("APP"));

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<>(url, caps);

        } catch (Exception exp) {
            System.out.println("Cause is" + exp.getCause());
            System.out.println("Cause is" + exp.getMessage());
            exp.getStackTrace();
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @AfterSuite
    public void shutDown(){
        driver.close();
    }
}
