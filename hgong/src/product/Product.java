package product;

public class Product {
	// 필드
	private String prodCode;
	private String prodName;
	private int prodPrice;
	private int prodSu;

	/**
	 * Product() {
	 * 
	 * }
	 */

	Product(String prodCode, String prodName, int prodPrice,int prodSu) {
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodSu = prodSu;
	}

	
	 void showInfo() {
		  System.out.println("물건 코드는" + prodCode +"이고 물건 이름은" + prodName+"이고 물건 가격은 "+ prodPrice +"물건 수는" +prodSu);
	  }
	 
	void setPC(String prodCode) {
		this.prodCode = prodCode;
	}

	void setPN(String prodName) {
		this.prodName = prodName;
	}

	void setPP(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	void setPS(int prodSu) {
		this.prodSu = prodSu;
	}

	String getPC() {
		return prodCode;
	}

	String getPN() {
		return prodName;
	}

	int getPP() {
		return prodPrice;
	}
	int getPS() {
		return prodSu;
	}

}
