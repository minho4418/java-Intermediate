package java10_collection;

import java.util.*;

public class J20220311_02_Map {

	public static void main(String[] args) {
		// 순서가 없다(index가 없다)
		//key를 이용해서 value를 저장
		//key는 중복허용안되고 value는 중복 허용
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("사이다", 1000);
//		map.put("콜라", 1500);
//		map.put("사이다", 1500);
//		System.out.println(map);
//		System.out.println(map.get("사이다"));
//		System.out.println(map.get(1000));
		
		//실습) 숫자영어단어사전
		//HashMap : null허용
		//Hashtable : null허용안함
		//TreeMap : key 값들에 대한 정렬이 이루어짐
		//LinkedHashMap : 입력 순서 보장
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		Map<Integer, String> m = new HashMap<>();
//		m.put(1, "one");
//		m.put(2, "two");
//		m.put(3, "three");
//		System.out.println(x+" : " + m.get(x));
//		
		//member객체를 값으로 map넣는다면
		//key:userid, value:Member
		Map<String, Member> map1 = new HashMap<>();
		map1.put("java", new Member("java","1111"));
		map1.put("hong", new Member("hong","2222"));
		System.out.println(map1);
		System.out.println(map1.get("hong").getPasswd());
		System.out.println();
		Set<String> kset = map1.keySet();
		for(String key : kset) {
			System.out.println(key + ":" + map1.get(key));
		}
		
		//반복자(iterator) 이용 -> list.size사용햇허 돌리는게 더빠름
		// but 인덱스 관리에 용이
		Iterator<String> it = kset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
	