package saucedemo.pages;

import com.google.common.io.LittleEndianDataInputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Cart {

  WebDriver driver;

  public Cart(WebDriver driver) {
    this.driver = driver;
  }

  @FindBy(xpath = "//div[@class='inventory_item_name']")
  private WebElement sauceLabsBackpack;

  @FindBy(xpath = "//a[@class='btn_action checkout_button']")
  private WebElement buttonCheckout;

  @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
  private WebElement buttonRemoveSauceLabsBackpack;

  @FindBy(xpath = "//button[text()='REMOVE']")
  private List<WebElement> removeSeveralItemsFromCart;

  @FindBy(xpath = "//span[@class='fa-layers-counter shopping_cart_badge']")
  private WebElement cartButtonWithQuantity;

  @FindBy(xpath = "//button[@class='btn_secondary cart_button']")
  private List<WebElement> removeButtonsList;

  public WebElement getButtonRemoveSauceLabsBackpack() {
    return buttonRemoveSauceLabsBackpack;
  }

  public WebElement getSauceLabsBackpack() {
    return sauceLabsBackpack;
  }

  public WebElement getButtonCheckout() {
    return buttonCheckout;
  }

  public WebElement getCartButtonWithQuantity() {
    return cartButtonWithQuantity;
  }

  public List<WebElement> getRemoveButtonsList() {
    return removeButtonsList;
  }

  public void removeItemsFromCart() {
    for (int i = 0; i < removeButtonsList.size(); i++) {
      removeButtonsList.get(i).click();
    }
    for (int i = 0; i < removeButtonsList.size(); i++) {
      removeButtonsList.get(0).click();
    }
  }
}