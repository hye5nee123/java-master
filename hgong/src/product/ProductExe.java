package product;

public class ProductExe {

	private Product[] products;

	ProductExe() {
		products = new Product[100];
	}

	boolean addProduct(Product pro) {
		for (int i = 0; i < products.length; i++) {
			if (products[i] == null) {
				products[i] = pro;
				return true;
			}
		}
		return false;
	}

	Product getProduct(String no) {
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null && products[i].getPC().equals(no)) {
				return products[i];
			}
		}
		return null;
	}

	boolean modifyProduct(String no, int price, int su) {
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null && products[i].getPC().equals(no)) {
				products[i].setPP(price);
				products[i].setPS(su);
				return true;
			}
		}
		return false;
	}

	Product[] getProductList() {
		return products;
	}

	boolean removeProduct(String code) {
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null && products[i].getPC().equals(code)) {
				products[i] = null;
				return true;
			}
		}
		return false;
	}

}
