package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import saucedemo.webdriverInit.WebDriverInit;

public class SauseLabs {
  WebDriver driver;

  public SauseLabs(WebDriver driver) {
    this.driver = driver;
  }


  private String title = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";

  @FindBy(xpath = "//title[text()='Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs']")
  private WebElement sauseLabsTitle;


  public WebElement getSauseLabsTitle() {
    return sauseLabsTitle;
  }

  public String getTitle() {
    return title;
  }
}
