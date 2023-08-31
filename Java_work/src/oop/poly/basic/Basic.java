package oop.poly.basic;

/*
- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
 밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
- 단, 파일명과 동일한 클래스가 반드시 존재해야 하고,
 해당 클래스만 public으로 선언할 수 있습니다.
*/

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
	
	
	//객체 생성

	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	/*
	  - 다형성이란 자식 객체가 모든 부모의 타입을 가질 수 있다는 
	 	것을 의미합니다.
	  
	  - 즉, 부모 타입 변수에 자식 객체의 주소값을 얼마든지
	  	저장 할 수 있다는 것을 의미합니다.
	  
	 */
		int i = 5;
		double d2 = i; //형변환
				
	
		//클래스타입 B가 -> A타입으로 자동 형 변환(promotion)
		// 상위 타입에 하위 타입이 저장된다 (부모타입으로 올라간다)
		// 상속 타입은 연결된다
		
		A v1 = new B(); 
		A v2 = new C(); 
		A v3 = new D(); 
		A v4 = new E(); 
		A v5 = b;  
		
		B v6 = new D(); 
		C v7 = new E(); 
		
		// 상속관계가 없다면 다형성 적용이 불가능합니다.
		// 즉, 다형성은 무조건 상속 관계 하에서만 발생합니다.
		// 서로 관계가 없으면 다형성이 발생하지 않는다.
//		B v8 = new C(); (X)
//		C v9 = new D(); (X)
//		B v10 =new E(); (X)
//		D v11 =new E(); (X) 
		
		// Object는 자바의 최상위 클래스입니다.
		// 모든 클래스는 결국 object의 자식입니다.
		// object 타입의 변수에는 어떠한 객체도 들어올 수 있습니다.
		
		Object o1 = new A();
		Object o2 = new B();
		Object o3 = new C();
		Object o4 = new D();
		Object o5 = new E();
		Object o6 = new String("안녕!");
		Object o7 = new Basic();
		
		
		
 		
}







