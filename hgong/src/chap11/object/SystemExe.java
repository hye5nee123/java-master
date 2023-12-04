package chap11.object;

public class SystemExe {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long sum = 0;
		for(int i = 0; i <= 10000000; i++){
			sum += i;
		}
		System.out.println("누적합:" + sum);
		long end = System.currentTimeMillis();
		System.out.println("걸린시간:" + (end - start));
	}
}
