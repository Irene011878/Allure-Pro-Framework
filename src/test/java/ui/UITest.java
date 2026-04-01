package ui;

import base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;

public class UITest extends BaseTest {

    @Test
    @Epic("UI")
    @Feature("Google Title")
    public void testGoogle(){

        GooglePage page = new GooglePage();
        page.open();
        Assert.assertTrue(page.getTitle().contains("Google"));
    }

    @Test
    public void failTest(){
        Assert.assertTrue(false);
    }

}
