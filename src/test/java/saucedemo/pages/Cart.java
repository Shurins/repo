package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Cart {

  WebDriver driver;

  public Cart(WebDriver driver){
    this.driver = driver;
  }

  @FindBy(xpath = "//div[@class='inventory_item_name']")
  private WebElement sauceLabsBackpack;

  @FindBy(xpath = "//a[@class='btn_action checkout_button']")
  private WebElement buttonCheckout;

  @FindBy(xpath = "//button[text()='REMOVE']")
  private WebElement buttonRemovesauceLabsBackpack;


  @FindBy(xpath = "//div[@class='removed_cart_item']")
  private List<WebElement> removedCartItem;

  public WebElement getSauceLabsBackpack() {
    return sauceLabsBackpack;
  }

  public List<WebElement> getRemovedCartItem() {
    return removedCartItem;
  }

  public WebElement getButtonRemoveSauceLabsBackpack() {
    return buttonRemovesauceLabsBackpack;
  }

  public WebElement getButtonCheckout() {
    return buttonCheckout;
  }
}
