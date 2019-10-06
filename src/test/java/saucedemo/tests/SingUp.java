package saucedemo.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import saucedemo.WebDriverInit;
import saucedemo.pages.SingUpPage;

public class SingUp extends WebDriverInit {


  @Test
  public void singUp() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.login();
    Assert.assertEquals(driver.getTitle(), "Swag Labs");
  }

  @Test
  public void singUpEmptyLogin() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.emptyLogin();
    Assert.assertEquals("Epic sadface: Username is required", singUpPage.getUserNameIsRequired().getText());
  }

  @Test
  public void singUpEmptyPassword() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.emptyPassword();
    Assert.assertEquals("Epic sadface: Password is required", singUpPage.getPassIsRequired().getText());
  }

  @Test
  public void singUpEmptyLoginAndPassword() {
    SingUpPage singUpPage = PageFactory.initElements(driver, SingUpPage.class);
    singUpPage.emptyLoginAndPassword();
    Assert.assertEquals("Epic sadface: Username is required", singUpPage.getUserNameIsRequired().getText());
  }

}