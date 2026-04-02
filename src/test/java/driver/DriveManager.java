package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriveManager {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver() {

        //driver.set(new ChromeDriver());
        ChromeOptions options = new ChromeOptions();

        // Detectar si estamos en CI
        String isCI = System.getenv("CI");

        if (isCI != null) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--start-maximized");
        }
        driver.set(new ChromeDriver(options));
    }

    public static WebDriver getDriver(){
        return driver.get();
    }

    public static void quitDriver(){
        driver.get().quit();
        driver.remove();
    }



}
