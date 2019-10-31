package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import saucedemo.SauseLabs;
import saucedemo.pages.HomePage;
import saucedemo.pages.SingUpPage;
import saucedemo.webdriverInit.WebDriverInit;

public class Sidebar extends WebDriverInit {

  @Test
  public void allItemsLink() {
    SingUpPage singUp = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    singUp.login();
    homePage.getSidebarButton().click();
    homePage.getAllItemsLink().click();
    Assert.assertEquals(6, homePage.getItemsSuite().size());
  }

  @Test
  public void aboutLink() {
    SingUpPage singUp = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SauseLabs sauseLabs = PageFactory.initElements(driver, SauseLabs.class);
    singUp.login();
    homePage.getSidebarButton().click();
    homePage.getAboutLink().click();
    Assert.assertEquals(, sauseLabs.getSauseLabsTitle().getText().toString());
  }
}
