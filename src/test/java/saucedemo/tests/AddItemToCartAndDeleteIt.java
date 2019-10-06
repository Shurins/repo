package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import saucedemo.WebDriverInit;
import saucedemo.pages.Cart;
import saucedemo.pages.HomePage;
import saucedemo.pages.SingUpPage;

public class AddItemToCartAndDeleteIt extends WebDriverInit {

  @Test
  public void addItemToCartAndDeleteIt() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    Cart cart = PageFactory.initElements(driver, Cart.class);
    singUpPage.login();
    homePage.getButtonCartSauceLabsBackpack().click();
    homePage.getCartButton().click();
    cart.getButtonRemoveSauceLabsBackpack().click();
    Assert.assertEquals(1, cart.getRemovedCartItem().size());
  }
}
