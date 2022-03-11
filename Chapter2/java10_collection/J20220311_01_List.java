package java10_collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class J20220311_01_List {

	public static void main(String[] args) throws IOException {
		//자료구조: 데이터를 메모리나 저장장치에 저장하고 사용하는 논리적인 구조
		//          프로그램의 성능이 좌우
		//저장방식 : 리스트, 스택, 큐, 트리, 해쉬..
		//자바 프레임워크 : 잘 정의된 구조의 클래스들
		
		//배열(리스트)
//		int[] arr = {1,2,3,4,5};
//		int[] arr2 = new int[6];
//		for(int i=0; i<arr.length; i++) {
//			arr2[i] = arr[i];
//		}
//		arr2[arr2.length-1] = 6;
//		System.out.println(Arrays.toString(arr2));
		
		//1)리스트
		//1-1)ArrayList
		//배열기반 : 검색 시 유리, 추가/삭제 어렵다
//		List<Integer> list = new ArrayList<>();
		//다형성을 이용해서 ArrayList 참조변수선언
		// list 사용 이유 ArrayList사용가능, LinkedList사용가능
		// -> generic 특성을 이용
//		list.add(10);
//		list.add(20);
//		System.out.println(list);
		
		//실습) 이름을 저장할 수 있는 ArrayList를 생성
		//List<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while(true) {
//			System.out.println("이름은 ? : ");
//			String name = br.readLine();
//			if(name.equals("")) {
//				break;
//			}
//			list.add(name);	
//		}
//		System.out.println(list);
//		for(int i =0; i< list.size(); i++) {
//			System.out.println(list.get(i)); // get 인덱스를 가져온다
//		}
//		for(String name : list) {
//			System.out.println(name);
//		}
		
		//회원정보의 리스트를 만들기
//		List<Member> list = new ArrayList<>();
//		Member m = new Member("java","1111");
//		list.add(m);
//		m = new Member("hong","2222");
//		list.add(m);
//		
//		for(int i = 0; i< list.size();i++) {
//			System.out.println("아이디 : "+list.get(i).getUserid());
//		}
//		
//		for(Member i : list) {
//			System.out.println(i);
//		}
		
		//1-2)LinkedList
		//추가, 삭제 쉽다. 검색 시 성능 저하우려
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(50);
		list.add(30);
		System.out.println(list);
		for(int i : list) {
			System.out.println(i);
		}
		
	}

}