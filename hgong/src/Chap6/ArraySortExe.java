package Chap6;

public class ArraySortExe {
	public static void main(String[] args) {
		int[] numAry = {100,2,1,5,4,3};
	
		//정렬작업.
		int temp = 0;
		for(int j =0; j<numAry.length-1; j++) {
			//위치 변경 작업.
			for(int i = 0; i<numAry.length -1; i++) { //-1인 이유 numAry 기준으로 4번만 비교하면 되는 거라서!
				if(numAry[i] > numAry[i+1]) {   //ex 2랑1
					temp = numAry[i];
					numAry[i] = numAry[i +1];
					numAry[i+1]= temp;
				}
			}
		}
		for(int num: numAry)
		System.out.println(num);
	}
}
