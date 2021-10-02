package ddit.or.kr.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest01 {
	public static void main(String[] args) {
		/*
		 * map
		 * key값과 value값을 한 쌍으로 관리하는 객체
		 * key값은 중복을 허용하지 않고 순서가 없다. set의 특징
		 * value값은 중복을 허용한다.
		 */
		Map<Integer, String> map1 = new HashMap<>();
//		인티져를 키로하고 스트링을 밸류로 한다.
		map1.put(1, "양두산");
		map1.put(2, "양두산2");
		map1.put(3, "양두산3");
		map1.put(4, "양두산4");
		map1.put(4, "구천모5");
		map1.put(5, "양두산");
		System.out.println(map1);
		
		map1.remove(3);
		System.out.println(map1);
		
		System.out.println(map1.get(2));
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("국어", 95);
		map2.put("수학", 85);
		map2.put("영어", 75);

		System.out.println(map2.get("국어"));
		
		for(int i = 0; i < map2.size(); i++) {
			System.out.println(map2.get(i));
		}
//		map은 인덱스가 없어서 다르게 접근해야 된다,
		
		for (String key : map2.keySet()) {
			System.out.print(map2.get(key)+",");
		}
	}
}
