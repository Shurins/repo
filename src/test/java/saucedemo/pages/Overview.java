package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overview {

  WebDriver driver;

  public Overview(WebDriver driver){
    this.driver = driver;
  }

  @FindBy(xpath = "//a[@class='btn_action cart_button']")
  private WebElement finishButton;

  public WebElement getFinishButton() {
    return finishButton;
  }

}
