package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Array;
import java.util.*;

public class HomePage {

  WebDriver driver;

  public HomePage(WebDriver driver) {
    this.driver = driver;
  }

  @FindBy(xpath = "//title[text()='Swag Labs']")
  private WebElement homePageTitle;

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

  @FindBy(xpath = "//span[@class='fa-layers-counter shopping_cart_badge']")
  private WebElement cartButtonWithQuantity;

  @FindBy(xpath = "//div[@class='inventory_item']//div[@class='inventory_item_name']")
  private List<WebElement> itemsSuite;

  @FindBy(xpath = "//div[@class='inventory_item_price']")
  private List<WebElement> itemsPrice;

  @FindBy(xpath = "//button[@class='btn_primary btn_inventory']")
  private List<WebElement> buttonsOfItems;

  @FindBy(xpath = "//button[text()='ADD TO CART']")
  private List<WebElement> buttonAddToCart;

  @FindBy(xpath = "//select[@class='product_sort_container']")
  private WebElement listBox;

  @FindBy(xpath = "//select[@class='product_sort_container']//option[@value='za']")
  private WebElement listBoxZtoA;

  @FindBy(xpath = "//select[@class='product_sort_container']//option[@value='lohi']")
  private WebElement listBoxLotoHigh;

  @FindBy(xpath = "//select[@class='product_sort_container']//option[@value='hilo']")
  private WebElement listBoxHighToLow;

  @FindBy(xpath = "//div[@class='bm-burger-button']")
  private WebElement sidebarButton;

  @FindBy(xpath = "//a[@id='inventory_sidebar_link']")
  private WebElement allItemsLink;

  @FindBy(xpath = "//a[@id='about_sidebar_link']")
  private WebElement aboutLink;

  @FindBy(xpath = "//a[@id='logout_sidebar_link']")
  private WebElement logoutLink;

  public WebElement getHomePageTitle() {
    return homePageTitle;
  }

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

  public List<WebElement> getItemsPrice() {
    return itemsPrice;
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

  public WebElement getCartButtonWithQuantity() {
    return cartButtonWithQuantity;
  }

  public WebElement getSidebarButton() {
    return sidebarButton;
  }

  public WebElement getAllItemsLink() {
    return allItemsLink;
  }

  public WebElement getAboutLink() {
    return aboutLink;
  }

  public WebElement getLogoutLink() {
    return logoutLink;
  }

  public ArrayList<String> sortListAToZ() {
    ArrayList<String> obtainedList = new ArrayList<String>();
    List<WebElement> elementList = getItemsSuite();

    for (int i = 0; i < elementList.size(); i++) {
      obtainedList.add(elementList.get(i).getText());
    }
    Collections.sort(obtainedList);
    return obtainedList;
  }

  public ArrayList<String> sortListZToA() {
    ArrayList<String> obtainedList = new ArrayList<>();
    List<WebElement> elementList = getItemsSuite();

    for (int i = 0; i < elementList.size(); i++) {
      obtainedList.add(elementList.get(i).getText());
    }
    obtainedList.sort(Comparator.reverseOrder());
    return obtainedList;
  }

  public ArrayList<String> notSortedItemList() {
    ArrayList<String> obtainedList = new ArrayList<>();
    List<WebElement> elementList = itemsSuite;

    for (int i = 0; i < elementList.size(); i++) {
      obtainedList.add(elementList.get(i).getText());
    }
    return obtainedList;
  }

  public ArrayList<Double> sortPriceLowToHigh() {
    List<WebElement> priceItems = getItemsPrice();
    ArrayList<String> sortLowHigh = new ArrayList<>();
    ArrayList<Double> price = new ArrayList<>();

    for (int i = 0; i < priceItems.size(); i++) {
      sortLowHigh.add(priceItems.get(i).getText().toString());
    }

    for (int i = 0; i < sortLowHigh.size(); i++) {
      price.add(Double.parseDouble(sortLowHigh.get(i).toString().replace("$", "")));
    }
    price.sort(Comparator.naturalOrder());
    return price;
  }

  public ArrayList<Double> sortPriceHighToLow() {
    List<WebElement> priceItems = getItemsPrice();
    ArrayList<String> sortLowHigh = new ArrayList<>();
    ArrayList<Double> price = new ArrayList<>();

    for (int i = 0; i < priceItems.size(); i++) {
      sortLowHigh.add(priceItems.get(i).getText().toString());
    }

    for (int i = 0; i < sortLowHigh.size(); i++) {
      price.add(Double.parseDouble(sortLowHigh.get(i).toString().replace("$", "")));
    }
    price.sort(Comparator.reverseOrder());
    return price;
  }

  public ArrayList<Double> getPriceItemsFromPage() {
    List<WebElement> priceItems = getItemsPrice();
    ArrayList<Double> price = new ArrayList<>();
    for (int i = 0; i < priceItems.size(); i++) {
      price.add(Double.parseDouble(priceItems.get(i).getText().replace("$", "")));
    }
    return price;
  }

  public void addSeveralItemsToCart() {

    for (int i = 0; i < 3; i++) {
      buttonAddToCart.get(i).click();
    }
  }
}