package chap5;

// 복합적인 형태의 데이터 구조
class Friend{
	String name; // 필드
	int age; //필드
	double height; //필드
}
public class referenceExe1 {

	public static void main(String[] args) {
		//참조 변수는 실제 값을 담는 게 아니라 실제 값의 주소를 담고 있음!
		Friend myFriend = new Friend(); //new => 객체 생성
		myFriend.name ="김철수";
		myFriend.age = 20;
		myFriend.height = 178.3;
		
		/**Friend ourFriend = myFriend;
		
		myFriend.name ="홍길동";
		
		System.out.println(ourFriend.name);
		System.out.println(ourFriend.age);
		System.out.println(ourFriend.height);*/
		
		Friend yourFriend = new Friend(); //new => 객체 생성
		yourFriend.name ="김철수";
		yourFriend.age = 20;
		yourFriend.height = 178.3;
		
		System.out.println(myFriend == yourFriend); //주소값 비교 :false
		
		yourFriend = null;
		
		/**try {
			System.out.println(youFriend.name);
		}catch (Exception e) {
			System.out.println("null값을 참조합니다");
		}*/
		// >예외로 처리하겠습니다.
		
		//기본타입.
		int a = 10;
		int b = a;
		
		a = 20;
		System.out.println("b=" +b);
		System.out.println("a="+a);
		
		// 참조타입: 주소값을 변수에 저장.
		String name ="신용권"; //23dbdae34334
		String hobby ="독서";
		
		String name1 = name;
		name1 = "신용권";  //new String ("신용권"); > 이거랑 비교하면 false ;;
		System.out.println("name: " +name);
		System.out.println("name1: "+name1);
		
		System.out.println(name == name1); // == ->equals 메소드 활용.

	} //main end

}// class end
