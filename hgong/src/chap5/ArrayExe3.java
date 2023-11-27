package chap5;

public class ArrayExe3 {
public static void main(String[] args) {
	String [] nameAry = {"홍길동", "송강","서강준","차은우","홍길동" };
	
	String search = "홍길동";
	int count = 0;
	for(String i : nameAry) {
		if(i.equals(search)) {
			System.out.println(i);
			count++;
		}
		
	}
	
	
	System.out.println(search+"은 총"+count+"입니다.");
	
	int[] scores = {88, 68, 72, 89, 92, 70};
	int maxScore = 0;
	for(int num : scores) {
		if(maxScore < num ) {
			maxScore = num;
		}
	}
	System.out.println(maxScore);
	
	} //main end
} //class end