package oop.modi.constructor.pac1;

public class A {

	A a1 = new A(true);
	A a2 = new A(50);
	A a3 = new A(3.14);
	
	//같은 클래시는 이상 없다 ! 
	
	//생성자 선언
	
	public A(boolean b){}
	A(int i){}  //default
	private A(double d){}
	
}
