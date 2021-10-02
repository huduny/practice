package ddit.or.kr.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class HashSetTest01 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		
		set1.add("aaa");
		set1.add("bbb");
		set1.add("ccc");
		set1.add("ddd");
		set1.add("aaa");
		set1.add("aaa");
		System.out.println(set1);
//		set은 중복이 안된다.
//		set은 get이 안된다 순서가 없어서
//		set은 iterator를 사용해야 도니다.
		Iterator it = set1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (String string : set1) {
			System.out.print(string+",");
		}
		System.out.println();
		List<String> list1 = new ArrayList<String>(set1);
		System.out.println("/"+list1+"/");
		System.out.println(set1.size());
		
		
	}
}
