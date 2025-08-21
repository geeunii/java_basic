package BookMarket.com.market.member;

public class Admin extends Person {	// Person 클래스를 상속받는 Admin 클래스.
	private String id = "Admin";	// private 문자열 id 필드는 "Admin"으로 할당 받음
	private String password = "Admin1234";	// private 문자열 password 필드는 "Admin1234"로 할당 받음

	public Admin(String name, int phone) {	// 생성자 Admin 은 String name 과 int phone 을 매개변수로 받음
		super(name, phone);	// 부모클래스 name 과 phone 을 호출하여 초기화 -> super
	}

	public String getId() { // getId() 의 멤버 변수를 가져오는 역할. -> 필드를 선언 했으니까
		return id;
	}

	public String getPassword() {	// getPassword() 의 멤버 변수를 가져오는 역할. -> 필드를 선언 했으니까.
		return password;
	}
}