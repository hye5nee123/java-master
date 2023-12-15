package conn2;

public class InOut {
	
	//필드
	String prodCode;
	String transDate;
	int quantity;
	
	//생성자
	InOut(){
		
	}
	public InOut (String prodCode, String transDate, int quantity) {
		super();
		this.prodCode = prodCode;
		this.transDate = transDate;
		this.quantity = quantity;
	}
	//상품 코드+재고량 출력 메소드.
	void showInfo() {
		//목록 출력 위해서
		String sellBuy = "";
		if(quantity >=0) {
			sellBuy = "구매";
		}else {
			sellBuy = "판매";
		}
		System.out.println("%5s %15s %s %8s\n", prodCode, transDate,);
			
		
	}
}
