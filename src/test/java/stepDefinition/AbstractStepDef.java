package stepDefinition;

import Page.HomePage;
import Page.LoginPage;
import Util.PropretyLoader;
import org.openqa.selenium.WebDriver;

public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage loginPage = new LoginPage(driver);
    public HomePage homePage= new HomePage(driver);
    protected static String chromeDriver = PropretyLoader.loadProperties("chromeDriver");
    protected static String loginPageUrl = PropretyLoader.loadProperties("loginPageUrl");
    protected static String excelFilePath = PropretyLoader.loadProperties("excelFilePath");
    public static String excelSheet = PropretyLoader.loadProperties("excelSheet");
    public static String autoItUploadFileSite = PropretyLoader.loadProperties("autoItUploadFileSite");
    public static String restAssuredBaseURL = PropretyLoader.loadProperties("restAssuredBaseURL");
}
