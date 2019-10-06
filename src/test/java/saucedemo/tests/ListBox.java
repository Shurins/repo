package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import saucedemo.WebDriverInit;
import saucedemo.pages.HomePage;
import saucedemo.pages.SingUpPage;

public class ListBox extends WebDriverInit {

  @Test
  public void nameAtoZ() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    singUpPage.login();
    Assert.assertEquals(homePage.getSauceLabsBackpack().getText(), homePage.getItemsSuite().get(0).getText());
    Assert.assertEquals(homePage.getShirtRed().getText(), homePage.getItemsSuite().get(5).getText());
  }

  @Test
  public void nameZtoA() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    singUpPage.login();
    homePage.getListBox().click();
    homePage.getListBoxZtoA().click();
    Assert.assertEquals(homePage.getShirtRed().getText(), homePage.getItemsSuite().get(0).getText());
    Assert.assertEquals(homePage.getSauceLabsBackpack().getText(), homePage.getItemsSuite().get(5).getText());
  }

  @Test
  public void nameLowToHigh() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    singUpPage.login();
    homePage.getListBox().click();
    homePage.getListBoxLowToHigh().click();
    Assert.assertEquals(homePage.getSauceLabsOnesie().getText(), homePage.getItemsSuite().get(0).getText());
    Assert.assertEquals(homePage.getSauceLabsFleeceJacket().getText(), homePage.getItemsSuite().get(5).getText());
  }

  @Test
  public void nameHighToLow() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    singUpPage.login();
    homePage.getListBox().click();
    homePage.getListBoxHighToLow().click();
    Assert.assertEquals(homePage.getSauceLabsFleeceJacket().getText(), homePage.getItemsSuite().get(0).getText());
    Assert.assertEquals(homePage.getSauceLabsOnesie().getText(), homePage.getItemsSuite().get(5).getText());
  }
}
