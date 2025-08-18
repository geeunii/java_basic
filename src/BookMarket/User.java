package BookMarket;

public class User extends Person {	// Person 클래스로부터 상속받는 User 클레스
	public User(String name, int phone) {	// User 생성자는 String name, int phone 매개변수를 받음.
		super(name, phone);	// 부모클래스 name 과 phone 을 호출하여 초기화 -> super
	}

	public User(String username, int phone, String address) {
		super(username, phone, address);
	}
}