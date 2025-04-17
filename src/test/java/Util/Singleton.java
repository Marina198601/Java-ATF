package Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stepDefinition.AbstractStepDef;

import static Util.AbstractLocations.SET_PROPRETY_CHROME;

public class Singleton extends AbstractStepDef {

    private static WebDriver driver=null;
    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty(String.valueOf(SET_PROPRETY_CHROME), chromeDriver);
            driver = new ChromeDriver();
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null){
            driver.close();
            driver.quit();
            driver=null;
        }
    }
}
