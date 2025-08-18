package BookMarket;

public class Person {	// 고객 클래스 생성
	private String name;	// 이름 필드
	private int phone;		// 폰 번호 필드
	private String address;	// 주소 필드

	public Person(String name, int phone) {	// 고객 생성자(이름, 폰 번호를 매개변수로한)
		this.name = name;
		this.phone = phone;
	}

	public Person(String name, int phone, String address) {	// 고객 생성자(이름, 폰번호, 주소를 매개변수로한)
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {	// 클래스의 멤버 변수 값을 가져오는 역할 - 접근자
		return name;
	}

	public void setName(String name) {	//	클래스의 멤버 변수 값을 변경하거나 설정하는 역할 - 변경자
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}