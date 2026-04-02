package listeners;

import driver.DriveManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;

import java.io.FileInputStream;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        /*String path = ScreenshotUtil.capture(result.getName());

        try {
            Allure.addAttachment(
                    "Screenshot",
                    new FileInputStream(path)
            );
        }catch (Exception e){
            e.printStackTrace();
        }*/
        attachScreenshot();
    }
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[]attachScreenshot(){
        return ScreenshotUtil.capture();
    }
}
