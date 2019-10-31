package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import saucedemo.webdriverInit.WebDriverInit;
import saucedemo.pages.SauceLabsBackpack;
import saucedemo.pages.*;

public class CartTests extends WebDriverInit {

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
