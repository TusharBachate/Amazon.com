package PageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

	public ProductPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (xpath = "//input[@aria-label='Search Amazon']")
	WebElement searchinput;
	
	public void find_Findproduct() throws InterruptedException {
	List <WebElement> productList = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]")); 
			Thread.sleep(5000);
			String partialProductName = "iLight Mini Smartphone 12 Pro";
			selectProduct(partialProductName);
			
		for(WebElement product : productList)
		{
			String productText = product.getText();
			System.out.println(productText);
		}    
	}
	//first product select
	
//	public void selectProduct() throws InterruptedException {
//	    List<WebElement> productList = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
//
//	    if (!productList.isEmpty()) {
//	        WebElement firstProduct = productList.get(0);
//	        firstProduct.click();
//	    } else {
//	        System.out.println("No products found on the page.");
//	    }
//
//	    Thread.sleep(5000);
//	}

	public void selectProduct(String partialProductName) throws InterruptedException {
	    List<WebElement> productList = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	    WebElement selectedProduct = null;
	  
	    for (WebElement product : productList) {
	        String productText = product.getText();
	        if (productText.contains(partialProductName)) {
	            selectedProduct = product;
	            break;
	        }
	    }

	    if (selectedProduct != null) {
	    	 Thread.sleep(5000);
	        selectedProduct.click();
	    } else {
	        System.out.println("iLight Mini Smartphone 12 Pro '" + partialProductName + "' not found.");
	    }

	    Thread.sleep(5000);
	}

		
	
	}
	

