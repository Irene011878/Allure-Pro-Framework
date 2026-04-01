package base;

import driver.DriveManager;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeMethod
    public void setUp(){
        DriveManager.setDriver();
    }

    @AfterMethod
    public void tearDown(){
        DriveManager.quitDriver();
    }

}
