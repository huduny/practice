package ddit.or.kr.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		
		// add() 매서드를 이용하여 데이터를 추가
		list1.add("aaa");
		list1.add("bbb");
		list1.add(111);
		list1.add("k");
		list1.add(true);
		list1.add(12.34);
//		형의 상관없이 다 넣을 수 있다.
		// size() 데이터의 개수
		System.out.println("list1 size = "+list1.size());
		System.out.println("list1 = "+list1);
//		get으로 꺼낸다.
		System.out.println("1번자료 = "+list1.get(0));
		System.out.println("1번자료 = "+list1.get(5));
		
//		중간에 끼워넣기
		list1.add(0, "zzzz");
		System.out.println("list1 = "+ list1);
		
//		데이터 변경하기
		list1.set(2, "yyy");
		System.out.println("list1 = "+ list1);
		
//		remove() 데이터 삭제
		list1.remove(0);
		System.out.println("list1 = "+ list1);
		
		String aaa = (String) list1.get(0);
		System.out.println(aaa);
		
		List<String> list2 = new ArrayList<String>();
//		위에는 아무거나 넣을수 있다. 대신 꺼낼때 각각 캐스팅을 해야되서 제너릭이 추가되어
//		밑에는 타입이 정해져서 string만 넣어야 한다.
		list2.add("aaa");
		list2.add("bbb");
		list2.add("ccc");
		list2.add("ddd");
		list2.add("eee");
//		list2.add(1234); 캐스팅 오류
		
		for(int i = 0 ; i < list2.size(); i++) {
			System.out.print(list2.get(i)+" ");
		}
		System.out.println();
//		list는 for문을 많이 쓴다.
		for (String str : list2) {
			System.out.print(str+" ");
		}
		
		
		
		
		
		
		
	}

}
