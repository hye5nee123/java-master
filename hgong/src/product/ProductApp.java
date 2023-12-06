package product;

import java.util.Scanner;

import Chap6.UserExe;

public class ProductApp {
	static ProductExe exe = new ProductExe();

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		UserExe uexe = new UserExe();

		int menu = 0;
		String name = "";
		String code = "";
		int price = 0;
		int su = 0;
		while (run) {
			System.out.println("1.상품관리 2. 입출고관리 3.종료");
			switch (menu) {
			case 1:
				System.out.println("1.등록 2.수정 3.목록 ");
				String no = scn.nextLine();
				if (no == "1") { // 등록
					System.out.println("상품 코드 입력");
					code = scn.nextLine();
					System.out.println("상품 이름 입력");
					name = scn.nextLine();
					System.out.println("가격 입력");
					price = Integer.parseInt(scn.nextLine());
					System.out.println("상품 수 입력");
					su = Integer.parseInt(scn.nextLine());
					Product pro = new Product(code, name, price, su);
					if (exe.addProduct(pro)) {
						System.out.println("입력 성공");
					} else {
						System.out.println("처리 실패!");
					}
					break;
				} else if (no == "2") { // 수정하기
					System.out.println("수정할 상품 코드 입력");
					code = scn.nextLine();
					System.out.println("상품 이름 입력");
					name = scn.nextLine();
					System.out.println("상품 가격 입력");
					price = Integer.parseInt(scn.nextLine());
					System.out.println("상품 수 입력");
					su = Integer.parseInt(scn.nextLine());

					if (exe.modifyProduct(no, price, su)) {
						System.out.println("수정 완료");
					} else {
						System.out.println("수정 실패.");
					}
					break;

				} else if (no == "3") { // 목록 출력
					for (Product prodc : exe.getProductList()) {
						if (prodc != null) {
							prodc.showInfo();
						} else {
							System.out.println("존재하지 않는 물건");
						}
						break;
					}
				}
				break;
			case 2:
				System.out.println("1.판매 2. 구매 3. 재고");
				no = scn.nextLine();
				if(no == "1") {
					System.out.println("판매할 상품 코드 입력");
					code = scn.nextLine();
					if(exe.removeProduct(code)) {
						System.out.println("삭제 완료");
					}else {
						System.out.println("삭제 실패");
					}
					break;
				}
			}
		}
	}
}
