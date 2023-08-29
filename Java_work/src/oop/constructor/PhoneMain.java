package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {

		Phone basic = new Phone(); 
		basic.showSpec();
		System.out.println("==============================");
		
		Phone galaxy = new Phone("갤럭시 s23"); 
		galaxy.showSpec();
	
		System.out.println("==============================");
		
		Phone iPhone14 = new Phone("아이폰14","스페이스그레이"); 
		iPhone14.showSpec();
	
	
	}
}
