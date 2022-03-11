package java09_lang;

public class J20220311_01_wrapper {

	public static void main(String[] args) {

		// wrapper클래스
		int a = 10; // null값 사용불가
		Integer a2 = 10; // null값 사용가능
		System.out.println(a2);
		System.out.println(Integer.parseInt("44")); // int 형 반환 -> 산술 가능
		System.out.println(Integer.valueOf("44")); // integer클래스를 리턴 -> 산술 불가
		
		
	}

}
