package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import saucedemo.pages.*;
import saucedemo.webdriverInit.WebDriverInit;

public class BuyingProduct extends WebDriverInit {

  @Test
  public void buyProduct() {
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
    checkout.fillFieldsWithCorrectData();
    checkout.getContinueButton().click();
    overview.getFinishButton().click();
    Assert.assertEquals(finish.getGratitude(), finish.getCompleteHeader().getText());
  }

  @Test
  public void buyProductWithIncorrectFirstName() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SauceLabsBackpack sauceLabsBackpack = PageFactory.initElements(driver, SauceLabsBackpack.class);
    Cart cart = PageFactory.initElements(driver, Cart.class);
    Checkout checkout = PageFactory.initElements(driver, Checkout.class);
    singUpPage.login();
    homePage.getSauceLabsBackpack().click();
    sauceLabsBackpack.getAddToCartButton().click();
    sauceLabsBackpack.getCartButton().click();
    cart.getButtonCheckout().click();
    checkout.fillIncorrectFirstName();
    checkout.getContinueButton().click();
    Assert.assertEquals(checkout.getErrorFirstNameNotification(), checkout.getErrorNotification().getText());
  }

  @Test
  public void buyProductWithIncorrectLastName() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SauceLabsBackpack sauceLabsBackpack = PageFactory.initElements(driver, SauceLabsBackpack.class);
    Cart cart = PageFactory.initElements(driver, Cart.class);
    Checkout checkout = PageFactory.initElements(driver, Checkout.class);
    singUpPage.login();
    homePage.getSauceLabsBackpack().click();
    sauceLabsBackpack.getAddToCartButton().click();
    sauceLabsBackpack.getCartButton().click();
    cart.getButtonCheckout().click();
    checkout.fillIncorrectLastName();
    checkout.getContinueButton().click();
    Assert.assertEquals(checkout.getErrorLastNameNotification(), checkout.getErrorNotification().getText());
  }

  @Test
  public void buyProductWithIncorrectPostalCode(){
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SauceLabsBackpack sauceLabsBackpack = PageFactory.initElements(driver, SauceLabsBackpack.class);
    Cart cart = PageFactory.initElements(driver, Cart.class);
    Checkout checkout = PageFactory.initElements(driver, Checkout.class);
    singUpPage.login();
    homePage.getSauceLabsBackpack().click();
    sauceLabsBackpack.getAddToCartButton().click();
    sauceLabsBackpack.getCartButton().click();
    cart.getButtonCheckout().click();
    checkout.fillIncorrectPostalCode();
    checkout.getContinueButton().click();
    Assert.assertEquals(checkout.getErrorPostalCodeNotification(), checkout.getErrorNotification().getText());
  }

  @Test
  public void cancelPurchase(){
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SauceLabsBackpack sauceLabsBackpack = PageFactory.initElements(driver, SauceLabsBackpack.class);
    Cart cart = PageFactory.initElements(driver, Cart.class);
    Checkout checkout = PageFactory.initElements(driver, Checkout.class);
    Overview overview = PageFactory.initElements(driver, Overview.class);
    singUpPage.login();
    homePage.getSauceLabsBackpack().click();
    sauceLabsBackpack.getAddToCartButton().click();
    sauceLabsBackpack.getCartButton().click();
    cart.getButtonCheckout().click();
    checkout.fillFieldsWithCorrectData();
    checkout.getContinueButton().click();
    Assert.assertTrue(overview.getPaymentInformation().isDisplayed());
    overview.getCancelButton().click();
    Assert.assertEquals(6, homePage.getItemsSuite().size());
  }
}