package utils;

import driver.DriveManager;
import org.openqa.selenium.*;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotUtil {

    public static String capture(String testName){

        WebDriver driver = DriveManager.getDriver();

        // 🔥 ESPERAR A QUE CARGUE LA PÁGINA
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(d -> ((JavascriptExecutor) d)
                        .executeScript("return document.readyState").equals("complete"));

        File src = ((TakesScreenshot)driver)
                .getScreenshotAs(OutputType.FILE);

        String path = "screenshots/" + testName + ".png";

        try {
            FileUtils.copyFile(src, new File(path));
        }catch (Exception e){
            e.printStackTrace();
        }
        return path;
    }

}
