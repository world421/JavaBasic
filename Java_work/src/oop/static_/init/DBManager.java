package oop.static_.init;

public class DBManager {

	public static String addr; //어디서 불러도 튀나오게 ! , 고정값으로 운영  
	public static String uid;
	public static String upw;
	
	// 정적 변수를 자동으로 초기화하려면 정적 초기화자가 필요합니다.
	static {
		System.out.println("정적 초기화자가 호출됨! ");
		addr = "192.168.0.02:8181/XEPDB1";
		uid = "abc1234";
		upw = "aaa1111!";
	}
	
	public DBManager() {
		System.out.println("생성자가 호출됨! ");
		addr = "192.168.0.02:8181/XEPDB1";
		uid = "abc1234";
		upw = "aaa1111!";
	}
	
	
	
	
}
