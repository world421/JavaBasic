package oop.poly.casting;

public class Child extends Parent{
	//child 는 parent 가 가진 메서드 사용 가능 
	
	public int n2;// 자식 고유의 필드 
	
	
	@Override
	public void method2() {
		System.out.println("재정의한 2 번 메서드 호출! ");
	}
	
	public void method3() {
		System.out.println("자식 고유의 3번 메서드 호출!");
		
	}
	

}
