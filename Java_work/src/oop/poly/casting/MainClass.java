package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent(); //patent 타입 참조 ! 
		p.n1 = 1;
		//p.n2 = 2; (x)
		
		p.method1();
		p.method2();
		//p.method3(); (X)
		
		System.out.println("----------------------");

		Child c = new Child();
		c.n1 = 1; // 부모한테 물려받은 속성
		c.n2 = 2 ; // 자식의 고유 속성
		
		c.method1();
		c.method2(); // 오버라이드 진행한거 
		c.method3();
		
		System.out.println("------------------------");
		// 다형성 적용(promotion)
		Parent p2 = new Child();
		//parent 시각으로 child 봤을때 
		p2.n1 =1;
		//p2.n2 = 2; (x)
		
		p2.method1();
		p2.method2();
//		p2.method3(); (x) 부모는 mehthod3의 존재를 모름
		
		
		/*
		 * 다형성이 적용되면 자식 클래스의 
		 * 본래의 멤버(필드,메서드)를 참조하지 못하는 문제가 발생합니다.
		 * 
		 * 이를 해결하기 위해 강제 타입변환을 사용합니다.
		 */
	
		Child c2 = (Child) p2; // 부모 타입을 자식 타입으로 강제 변환(Downcasting)
		// parent 타입을 child 타입으로내려줌
		// 접근방식만 바꾸는거, child의 시각으로 본다 객체생성한거 x
		
		c2.n2 = 2;
		c2.method2();
		c2.method3();
		System.out.println("p2의 주소값 : " + p2);
		System.out.println("c2의 주소값 : " + c2);
		
		Object o = new String("안녕하세용!~!"); 
		//object의 시각으로 string 에 접근
		// string.length 같은거 확인불가 
//		System.out.println("문자열의 길이 : "_+ o.length());
		String str = (String) o; 
		System.out.println("문자열의 길이 : " + str.length());
		
		
		// 다형성이 한 번도 발생하지 않은 경우에는
		// 강제 형 변환을 사용할 수 없습니다.
		// → 
		
		Parent ppp = new Parent();
		// 부모의 객체는 자식의 변수에 넣을수없음
		//자식객체의 부모의 변수는 들어갈수없음
//		Child ccc= (Child) ppp;(x)
		//Child ㄴ
		//자식타입의 부모객체라는 것은 존재하지않음
		
		
		
		
		
		
		
	}

}
