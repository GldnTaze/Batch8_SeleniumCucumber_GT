package com.amazon.tests.amazonE2ETest;

import com.amazon.pages.LoginPage;
import com.amazon.pages.YourListPage;
import com.amazon.tests.TestBase;
import com.amazon.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_CreatList extends TestBase {
    /** Amazon E2E Task
     *  go to https://www.amazon.com.tr/ web page
     *  if there are cookies accept cookies
     *  log in with your own valid credential
     *  Verify that login is successful
     *  Click a new list from Hesap ve Listeler
     *  click liste olustur link
     *
     *  Select any category from the section tab next to the search box (click search button)
     *  Verify that category  is selected
     *  Write any product to search box and click
     *  Verify that the result page is displayed

     Project Name:EuroTech_SeleniumTestNG_Amazon
     */
    LoginPage loginPage;
    YourListPage yourListPage;
    @Test
    public void TC001_ListTest(){
        loginPage=new LoginPage();
        yourListPage=new YourListPage();

        extentLogger=report.createTest("TC001_List Test");

        extentLogger.info("go to "+ConfigurationReader.get("url")+" web page");
        driver.get(ConfigurationReader.get("url"));

        extentLogger.info("if there are cookies accept cookies");
        loginPage.acceptCookies();

        extentLogger.info("log in with your own valid credential");
        loginPage.login();

        extentLogger.info("Verify that login is successful");
        String actualUsername = loginPage.getUsername();
        String expectedUsername=ConfigurationReader.get("username");
        Assert.assertEquals(actualUsername,expectedUsername);

        extentLogger.info("Click a new list from Hesap ve Listeler");
        yourListPage.createANewList();

        extentLogger.info("Create a new list named as gulden");
        yourListPage.createANewListMethod("gulden");
        extentLogger.info("Delete shopping list");
        yourListPage.deleteList();

    }

}
