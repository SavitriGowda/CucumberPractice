package amazonapplication;

import java.util.ArrayList;
import java.util.List;

public class Productpage {
	private String productName;
	private int price;
	
	public Productpage(String productName, int price) {
		this.productName=productName;
		this.price=price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getListProductName(){
		List<String> product=new ArrayList<String>();
		product.add("Apple MacBook Pro");
		product.add("Apple macBook Air");
		product.add("Apple iPhone12");
		return product;
	}
}
