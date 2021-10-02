package ddit.or.kr.collection;

public class PhoneVO {
	private String name;
	private String address;
	private String num;
	
//	등록.수정,삭제 검색 전체 출력
	public PhoneVO() {}
	public PhoneVO(String name, String address, String num) {
		this.name = name;
		this.address = address;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}


	public void insert(String name, String address, String num) {
		
	}
	
}
