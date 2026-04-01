package pages;

import driver.DriveManager;
import org.openqa.selenium.By;

public class GooglePage {

    public void open(){
        DriveManager.getDriver().get("https://www.google.com");
    }

    public String getTitle(){
        return DriveManager.getDriver().getTitle();
    }
}

//Run pipeline again2
