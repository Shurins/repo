package saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceLabsBackpack {

  @FindBy(xpath = "//button[text()='ADD TO CART']")
  private WebElement addToCartButton;


  @FindBy(xpath = "//div[@id='shopping_cart_container']")
  private WebElement cartButton;

  public WebElement getAddToCartButton() {
    return addToCartButton;
  }

  public WebElement getCartButton() {
    return cartButton;
  }

}
