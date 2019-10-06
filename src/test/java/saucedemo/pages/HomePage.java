package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {

  WebDriver driver;

  public HomePage(WebDriver driver){
    this.driver = driver;
  }

  @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
  private WebElement sauceLabsBackpack;

  @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
  private WebElement sauceLabsOnesie;

  @FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
  private WebElement sauceLabsFleeceJacket;

  @FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
  private WebElement ShirtRed;

  @FindBy(xpath = "//div[@class='inventory_list']/div[1]//button[text()='ADD TO CART']")
  private WebElement buttonCartSauceLabsBackpack;

  @FindBy(xpath = "//div[@id='shopping_cart_container']/a")
  private WebElement cartButton;

  @FindBy(xpath = "//div[@class='inventory_item']//div[@class='inventory_item_name']")
  private List<WebElement> itemsSuite;

  @FindBy(xpath = "//select[@class='product_sort_container']")
  private WebElement listBox;

  @FindBy(xpath = "//select[@class='product_sort_container']//option[@value='za']")
  private WebElement listBoxZtoA;

  @FindBy(xpath = "//select[@class='product_sort_container']//option[@value='lohi']")
  private WebElement listBoxLotoHigh;

  @FindBy(xpath = "//select[@class='product_sort_container']//option[@value='hilo']")
  private WebElement listBoxHighToLow;

  public WebElement getListBox() {
    return listBox;
  }

  public WebElement getListBoxZtoA() {
    return listBoxZtoA;
  }

  public WebElement getListBoxLowToHigh() {
    return listBoxLotoHigh;
  }

  public WebElement getListBoxHighToLow() {
    return listBoxHighToLow;
  }

  public List<WebElement> getItemsSuite() {
    return itemsSuite;
  }

  public WebElement getSauceLabsBackpack() {
    return sauceLabsBackpack;
  }

  public WebElement getSauceLabsOnesie() {
    return sauceLabsOnesie;
  }

  public WebElement getSauceLabsFleeceJacket() {
    return sauceLabsFleeceJacket;
  }

  public WebElement getShirtRed() {
    return ShirtRed;
  }

  public WebElement getButtonCartSauceLabsBackpack() {
    return buttonCartSauceLabsBackpack;
  }

  public WebElement getCartButton() {
    return cartButton;
  }

}
