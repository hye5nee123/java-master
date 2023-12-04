package todo.P20231201;

public class MainExe {
	public static void main(String[] args) {
		// 2차원 배열 {{배열 안에 배열이 존재}}
		// int[][] numAry = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
		// 14, 15, 16 } };
		// System.out.println(numAry[2][0]); = 9
		// System.out.println(numAry[0].length); = 4
		/**
		 * for(int i =0;i<4;i++) { for(int j = 0;j<4;j++) {
		 * System.out.printf("%3d",numAry[i][j]); //정수 3자리에 넣겠다 } //4개마다 줄바꿔주
		 * System.out.println(); }
		 */
		/**
		 * for (int i = 0; i < 4; i++) { for (int j = 0; i < 4; j++) {
		 * System.out.print(numAry); } }
		 */
		int[][] numAry = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%3d", numAry[i][j]);
				// 정수 3자리에 넣겠다
			}
			System.out.println();
		}
		System.out.print("========end========");
	}
}
