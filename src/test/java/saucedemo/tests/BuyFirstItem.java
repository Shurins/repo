package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import saucedemo.WebDriverInit;
import saucedemo.itempages.SauceLabsBackpack;
import saucedemo.pages.*;

public class BuyFirstItem extends WebDriverInit {


  @Test
  public void addFirstItem() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SauceLabsBackpack sauceLabsBackpack = PageFactory.initElements(driver, SauceLabsBackpack.class);
    Cart cart = PageFactory.initElements(driver, Cart.class);
    Checkout checkout = PageFactory.initElements(driver, Checkout.class);
    Overview overview = PageFactory.initElements(driver, Overview.class);
    Finish finish = PageFactory.initElements(driver, Finish.class);
    singUpPage.login();
    homePage.getSauceLabsBackpack().click();
    sauceLabsBackpack.getAddToCartButton().click();
    sauceLabsBackpack.getCartButton().click();
    cart.getButtonCheckout().click();
    checkout.fillFields();
    checkout.getContinueButton().click();
    overview.getFinishButton().click();
    Assert.assertEquals("THANK YOU FOR YOUR ORDER", finish.getCompleteHeader().getText());

  }


}
