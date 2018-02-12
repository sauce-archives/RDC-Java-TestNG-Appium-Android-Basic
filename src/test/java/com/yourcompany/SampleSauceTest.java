package com.yourcompany;

import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testobject.appium.TestObjectListenerProvider;
import org.testobject.appium.testng.TestObjectTestNGTestResultWatcher;
import org.testobject.appium.testng.TestObjectWatcherProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;



@Listeners({ TestObjectTestNGTestResultWatcher.class })
public class SampleSauceTest implements TestObjectWatcherProvider {
	
	private TestObjectListenerProvider provider = TestObjectListenerProvider.newInstance();
    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("testobject_api_key", System.getenv("TESTOBJECT_API_KEY"));
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("testobject_test_name", "Add Contact Test");
        
        driver = new AndroidDriver(new URL(System.getenv("APPIUM_URL"), capabilities);
        provider.setDriver(driver);
        provider.setLocalTest(false);
    }

    @Test
    public void testMethod() throws Exception {
    	
        WebElement button = driver.findElement(By.className("android.widget.Button"));
        button.click();
        driver.getScreenshotAs(OutputType.FILE);
        List<WebElement> textFieldsList = driver.findElements(By.className("android.widget.EditText"));
        textFieldsList.get(0).sendKeys("Some Name");
        textFieldsList.get(2).sendKeys("Some@example.com");
        driver.getScreenshotAs(OutputType.FILE);
        button.click();
        driver.getScreenshotAs(OutputType.FILE);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    
    @Override
    public TestObjectListenerProvider getProvider() {
        return provider;
    }

}

