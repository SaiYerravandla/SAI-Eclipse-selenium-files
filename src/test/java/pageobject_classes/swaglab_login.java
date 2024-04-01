package pageobject_classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class swaglab_login {

	WebDriver driver;	
	By username=By.xpath("//*[@id=\"user-name\"]");
	By passname=By.xpath("//*[@id=\"password\"]");
	By login_btn=By.xpath("//*[@id=\"login-button\"]");
	By Verify_home_page=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By Click_logout_Btn=By.xpath("//*[@id=\"logout_sidebar_link\"]");
	By click_menu=By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	
	By add_one_productTo_addTOcart=By.xpath("//*[@id=\"inventory_container\"]/div/div[3]/div[3]/button");
	By click_the_ADDTOCART_Option=By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
	 By Verify_the_PRoduct_price=By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div");
	By product_SORTBy=By.xpath("//*[@id=\"inventory_filter_container\"]/select");
	
	By RED_Tshirt_product=By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
	
	By verify_RED_TSHIRT_DESCRIPTION=By.xpath("//*[@id=\"item_3_title_link\"]/div");
	public swaglab_login(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void setBrowser() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void url() {
		driver.get("https://www.saucedemo.com/v1/");
	}
	
	public void enter_user_password(String user,String pass) {
		
		driver.findElement(username).sendKeys(user);
		driver.findElement(passname).sendKeys(pass);

	}
	
		public void click_login_btn(){
			driver.findElement(login_btn).click();
		}
		
		public void click_menu() {
			driver.findElement(click_menu).click();
		}
		
		
		
		public void click_logout_btn() throws InterruptedException {
			driver.findElement(Click_logout_Btn).click();
			Thread.sleep(1000);
			driver.quit();
		}
		
		public void verify_homepage() {
			if (driver.findElement(Verify_home_page).isEnabled()) {
				System.out.println("Homepage is succsusfully verified");
				
			}else {
				System.out.println("Homepage is NOT--succsusfully verified");
			}
		}
		public void Add_one_Product_to_ADD_TO_CART() {
			
			driver.findElement(add_one_productTo_addTOcart).click();
			
		}
		public void Verify_the_Product() {
			
			driver.findElement(click_the_ADDTOCART_Option).click();
			if (driver.findElement(Verify_the_PRoduct_price).isDisplayed()) {
				
				System.out.println("your product is succsufully verified");
				
			}
		}
		
		public void product_sorting() {
			WebElement dropdownElement=driver.findElement(product_SORTBy);
			Select select=new Select(dropdownElement);
			select.selectByIndex(1);
		}
		
		public void  product_red() {
			driver.findElement(RED_Tshirt_product).click();
			driver.findElement(click_the_ADDTOCART_Option).click();
			
		}
		public void  verify_RED_Tshirt_product() throws InterruptedException {
			Thread.sleep(1000);
			if (driver.findElement(verify_RED_TSHIRT_DESCRIPTION).isDisplayed()) {
				System.out.println("RED Tshirt is carted");
				
			}else {
				System.out.println("RED Tshirt is NOT carted");
			}
		}
	}
	

