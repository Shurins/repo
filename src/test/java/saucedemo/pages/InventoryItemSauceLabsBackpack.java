package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryItemSauceLabsBackpack {
  WebDriver driver;

  public InventoryItemSauceLabsBackpack(WebDriver driver) {
    this.driver = driver;
  }

  @FindBy(xpath = "//button[@class='btn_secondary btn_inventory']")
  private WebElement removeItemFromCart;

  @FindBy(xpath = "//button[@class='btn_secondary btn_inventory']")
  private List<WebElement> removeItemFromCartList;

  public List<WebElement> getRemoveItemFromCartList() {
    return removeItemFromCartList;
  }

  public WebElement getRemoveItemFromCart() {
    return removeItemFromCart;
  }
}