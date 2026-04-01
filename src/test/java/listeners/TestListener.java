package listeners;

import io.qameta.allure.Allure;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtil;

import java.io.FileInputStream;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){

        String path = ScreenshotUtil.capture(result.getName());

        try {
            Allure.addAttachment(
                    "Screenshot",
                    new FileInputStream(path)
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
