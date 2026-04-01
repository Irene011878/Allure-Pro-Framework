package utils;

import driver.DriveManager;
import org.openqa.selenium.*;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static String capture(String testName){

        File src = ((TakesScreenshot)DriveManager.getDriver())
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
