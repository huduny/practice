package homeworks09;

public class Human {
//	field
	private String name;
	private int age;

//	constructor
	public Human() {
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		
		return "이름"+name+",나이"+age;
	}

}
