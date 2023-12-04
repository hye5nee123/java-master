package chap11.object;

import lombok.EqualsAndHashCode;

public class ObjectExe {
	public static void main(String[] args) {
		// equals.

		Object obj1 = new Object();
		Object obj2 = new Object();

		// object의 equals는 객체의 주소값을 비교. 항상 false;
		System.out.println(obj1.equals(obj2));

		// String에 정의된 equals는 문자열
		String str1 = new String("Hello");
		String str2 = new String(str1);
		System.out.println(str1.equals(str2));
		// equals를 오버로딩 안하면 object의 것을 그대로 씀
		Member mem1 = new Member("송강", 20);
		Member mem2 = new Member("서강준", 22);
		System.out.println(mem1.equals(mem2));

		// equals
	@Override
	public boolean equals(Object obj) {
		// 논리적으로 동등한 객체(이름,나이)
		if (obj instanceof Member) {
			Member target = (Member) obj;
			if (this.name.equals(target.name)
			&& this.age == target.age
			) {
				return true;
			}
		}
		return false;
	}


	@override
	private int hsahcode() {
		return this.name.hsahcode();

	}

	@Override
	public String toString() {
		return "ObjectExe [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	}
}