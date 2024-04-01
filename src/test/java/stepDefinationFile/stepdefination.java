package stepDefinationFile;

import static org.testng.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageobject_classes.swaglab_login;

public class stepdefination  {
	
	swaglab_login login=new swaglab_login(null);
	
	
	@Given("set up the browser and url")
	public void set_up_the_browser_and_url() {
		
	    login.setBrowser();
	    login.url();
	}

//	@When("Enter the standard_user and secret_sauce")
//	public void enter_the_standard_user_and_secret_sauce(String username,String password) {
	@When("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
	    
		login.enter_user_password(username, password);
	}

	@Then("click the login button")
	public void click_the_login_button() {
	   login.click_login_btn();
	}

	@Then("Add the one product to add to cart")
	public void add_the_one_product_to_add_to_cart() {
	 login.Add_one_Product_to_ADD_TO_CART();  
	}

	@Then("verify the product is added or not")
	public void verify_the_product_is_added_or_not() {
	 login.Verify_the_Product();  
	 
	}
	
	@Then("verify the homepage")
	public void verify_the_homepage() {
	    login.verify_homepage();
	    
	    
	}
	
	@Then("change the z-A sort")
	public void change_the_z_a_sort() {
	    login.product_sorting();
	    
	}

	@Then("Add the RED Tshirt product to add to cart")
	public void add_the_red_tshirt_product_to_add_to_cart() {
		 login.product_red();
	}

	@When("verify the product_RED")
	public void verify_the_product_red() throws InterruptedException {
	   login.verify_RED_Tshirt_product();
	  
	}


	@Then("click the logout button and close browser")
	public void click_the_logout_button_and_close_browser() throws InterruptedException {
		login.click_menu();
	 login.click_logout_btn();  
	}


	
	
	
}