package Chap6;
import todo.BoardApp;
public class MainExe {
	public static void main(String[] args) {
		//정렬하는 법
		String[] strs = {"1로운", "2재현","3정국", "4박보검", "5서강준","6송강","7" , "8"};
		int page = 1;
		int start = (page - 1 )* 5;
		int end = page  * 5;
		
		for(int i = 0; i< strs.length; i++) {
			if(i >= 0 && i <6) {
				System.out.println(strs[i]);
			}
		}
	
	int cnt = 32;
	
	int totalpage = (int) Math.ceil(cnt/5.0); 
	System.out.println(totalpage);
	for( int i = 1; i <= totalpage; i++) {
		System.out.print(i + "");
		}
		BoardApp app = BoardApp.getInstance();
		app.start();
		
	}
}