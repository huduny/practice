package ddit.or.kr.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		/*
		 * 5명의 사람 이름을 입력하여 arraylist에 저장하고 이중에 '김'씨 성의 이름을 출력하시오
		 * 단 입력은 scanner를 이용하여 입력 받는다.
		 * 
		 */
		Scanner scn = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("이름을 입력하세요");
			System.out.print(">> ");
			String a = scn.nextLine();
			list.add(a);
		}
		System.out.println(list);
		System.out.println(list.get(0).substring(0,1));
		
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).substring(0,1).equals("김")) {
				System.out.print("["+list.get(j)+"]");
			}
		}
		for (String string : list) {
			if(string.charAt(0)=='김')
			System.out.println(string);
			if (string.substring(0,1).equals("김")) {
			System.out.println(string);
			}
			if (string.indexOf("김")!=-1) {
				System.out.println(string);
//				김이라는 단어가 포함되지 않은 값만 반환
			}
			if (string.startsWith("김")) {
				System.out.println(string);
			}
		}
		
		
		
		
		
		
		
		
		
		scn.close();

	}

}
