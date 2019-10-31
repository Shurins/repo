package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import saucedemo.webdriverInit.WebDriverInit;
import saucedemo.pages.SauceLabsBackpack;
import saucedemo.pages.*;

public class ByItemsAndDeleteThem extends WebDriverInit {


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

  @Test
  public void addItemToCartAndDeleteIt() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    Cart cart = PageFactory.initElements(driver, Cart.class);
    InventoryItemSauceLabsBackpack inventoryItemSauceLabsBackpack = PageFactory.initElements(driver, InventoryItemSauceLabsBackpack.class);
    singUpPage.login();
    homePage.getButtonCartSauceLabsBackpack().click();
    homePage.getCartButton().click();
    cart.getButtonRemoveSauceLabsBackpack().click();
    inventoryItemSauceLabsBackpack.getRemoveItemFromCart().click();
    Assert.assertEquals(0, inventoryItemSauceLabsBackpack.getRemoveItemFromCartList().size());
  }

  @Test
  public void addSeveralItemsToCartAndDeleteIt() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    Cart cart = PageFactory.initElements(driver, Cart.class);
    singUpPage.login();
    homePage.addSeveralItemsToCart();
    homePage.getCartButtonWithQuantity().click();
    Assert.assertEquals(Integer.parseInt(cart.getCartButtonWithQuantity().getText()), cart.getRemoveButtonsList().size());
    cart.removeItemsFromCart();
    Assert.assertEquals(0, cart.getRemoveButtonsList().size());
  }


}
