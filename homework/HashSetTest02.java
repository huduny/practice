package ddit.or.kr.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class HashSetTest02 {

	public static void main(String[] args) {
		/*
		 * hashset을 이용하여
		 * 1~45까지의 범위를 갖는 6개의 숫자를 arraylist에 담아보자
		 */
		Set<Integer> set1 = new HashSet<>();//앞에 제너릭을 선언하면 뒤에는 생략해도 된다.
		Random ran = new Random();
//		System.out.println(i);
		
//		for (int j = 0; j <= 100;) {
		do {
			set1.add(ran.nextInt(45)+1);
		}while (set1.size()<6);
		
		System.out.println(set1);
		
		List<Integer> set2 = new ArrayList<>(set1);//순서가 있는 list로 바꿔주고
		
		Collections.sort(set2);
		System.out.println(set2);
		
//			j=j+1;
//		}
		
		
//		Iterator it = set1.iterator();
////		System.out.println();
//		while (set1.size()==6) {
//			int i = ran.nextInt(45);
//			set1.add(i);
//		}
//		System.out.println(set1);
		
	}
}
