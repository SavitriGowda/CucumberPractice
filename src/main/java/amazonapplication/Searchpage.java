package amazonapplication;

public class Searchpage {
	public String displayProductName(Productpage product) {
		if(product.getListProductName().contains(product.getProductName())) {
			return product.getProductName();
		}
		return null;
		
	}
}
