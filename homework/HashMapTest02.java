package ddit.or.kr.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
	이름, 주소, 전화번호 속성을 갖는 Phone 클래스를 만들고 이 Phone 클래스를 이용하여
	전화번호 정보를 관리하는 프로그램을 완성하시오.
	이 프로그램에서는 전화번호를 등록, 수정, 삭제, 검색, 전체출력하는 기능이 있다.
	
	전체의 전화번호 정보는 Map을 이용하여 관리한다.
	(key는 '이름'으로 하고 value는 'Phone클래스의 인스턴스'로 한다)
	
	실행 예시)
	============================
	전화번호 관리 프로그램
	============================
	
	메뉴를 선택하세요.
	1. 전화번호 등록
	2. 전화번호 수정
	3. 전화번호 삭제
	4. 전화번호 검색
	5. 전화번호 전체 출력
	0. 프로그램 종료
	번호입력 >> 1   <-- 직접입력
	
	새롭게 등록할 전화번호 정보를 입력하세요.
	이름 >> 홍길동  <-- 직접입력
	전화번호 >> 010-1234-1234  <-- 직접입력
	주소 >> 대전시 중구 대흥동 111   <-- 직접입력
	
	메뉴를 선택하세요.
	1. 전화번호 등록
	2. 전화번호 수정
	3. 전화번호 삭제
	4. 전화번호 검색
	5. 전화번호 전체 출력
	0. 프로그램 종료
	번호입력 >> 5   <-- 직접입력
	
	=================================================
	번호	이름		전화번호			주소
	=================================================
	1	홍길동	010-1234-1234	대전시 중구 대흥동 111
	....
	
	=================================================
	출력 완료!
	
	메뉴를 선택하세요.
	1. 전화번호 등록
	2. 전화번호 수정
	3. 전화번호 삭제
	4. 전화번호 검색
	5. 전화번호 전체 출력
	0. 프로그램 종료
	번호입력 >> 0   <-- 직접입력
	
	프로그램을 종료합니다...
 */

public class HashMapTest02 {
	Scanner sc = new Scanner(System.in);
	Map<String, PhoneVO> phoneBook = new HashMap<>();
	
	public static void main(String[] args) {
		new HashMapTest02().startApp();
	}
	
	public void startApp() {
		showMenu();
		int inputNum = sc.nextInt();
		switch (inputNum) {
		case 1:
			insertPhone();
			break;
		case 2:
			updatePhone();
			break;
		case 3:
			deletePhone();
			break;
		case 4:
			selectPhone();
			break;
		case 5:
			displayAllPhone();
			break;
		case 0:
			System.out.println("\n프로그램을 종료합니다.");
			break;
		}
	}

	private void displayAllPhone() {
	}

	private void selectPhone() {
	}

	private void deletePhone() {
	}

	private void updatePhone() {
	}

	private void insertPhone() {
	}

	private void showMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 전화번호 등록");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 검색");
		System.out.println("5. 전화번호 전체 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("번호입력 >> ");
	}
}

class PhoneVO {
	private String addr;
	private String phone;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Phone [addr=" + addr + ", phone=" + phone + "]";
	}
}
