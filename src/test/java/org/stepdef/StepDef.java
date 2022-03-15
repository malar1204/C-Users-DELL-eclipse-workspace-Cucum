package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
WebDriver  driver;
@Given("user launch Fb application on chrome browser")
public void user_launch_Fb_application_on_chrome_browser() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    
}

@When("enter  username and password in Fb Page")
public void enter_username_and_password_in_Fb_Page() {
    // Write code here that turns the phrase above into concrete actions
 WebElement userName = driver.findElement(By.id("email"));
 userName.sendKeys("Doshi");
 WebElement password = driver.findElement(By.id("pass"));
 password.sendKeys("Thakshi");
}

@When("Click  on login button")
public void click_on_login_button() {
    WebElement login = driver.findElement(By.name("login"));
    login.click();
}

@Then("user validating name page is visible or not")
public void user_validating_name_page_is_visible_or_not() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Invalid Password");
}



}
