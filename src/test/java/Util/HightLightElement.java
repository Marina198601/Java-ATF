package Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import stepDefinition.AbstractStepDef;

public class HightLightElement extends AbstractStepDef {
    public static void hightLightElement(WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style','background:blue; border: 3px solid red;');",element);
    }
}
