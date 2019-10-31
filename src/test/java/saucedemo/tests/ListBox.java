package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import saucedemo.webdriverInit.WebDriverInit;
import saucedemo.pages.HomePage;
import saucedemo.pages.SingUpPage;

public class ListBox extends WebDriverInit {

  @Test
  public void nameAtoZ() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    singUpPage.login();
    Assert.assertEquals(homePage.sortListAToZ(), homePage.notSortedItemList());
  }

  @Test
  public void nameZtoA() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    singUpPage.login();
    homePage.getListBox().click();
    homePage.getListBoxZtoA().click();
    Assert.assertEquals(homePage.sortListZToA(), homePage.notSortedItemList());
  }

  @Test
  public void priceLowToHigh() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    singUpPage.login();
    homePage.getListBox().click();
    homePage.getListBoxLowToHigh().click();
    Assert.assertEquals(homePage.sortPriceLowToHigh(), homePage.getPriceItemsFromPage());
  }

  @Test
  public void priceHighToLow() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    singUpPage.login();
    homePage.getListBox().click();
    homePage.getListBoxHighToLow().click();
    Assert.assertEquals(homePage.sortPriceHighToLow(), homePage.getPriceItemsFromPage());
  }
}
