package oop.basic;

public class PenMain {

	public static void main(String[] args) {
		
		/*
		 * 설계도에 작성한 속성과 기능을 사용하려면
		 * 반드시 실체(객체)를 생성하셔야 합니다.
		 * 클래스만 제작된 채로는 아무 기능도 수행할 수 없습니다.
		 */
		
		//객체 생성 문법 : 클래스타입 변수명 = new 클래스 이름();
		Pen redPen = new Pen(); //실제로 변수에 들어가는건아님
		Pen bluePen = new Pen(); // pen이라는 객체를 참조한다.
		Pen blackPen = new Pen(); // pen이라는 객체를 참조한다.
		
		//참조 연산자 (.) : 를 통해 객체로 접근한뒤
		//속성을 지정하고 기능을 사용할 수 있다. 
		redPen.color = "빨강";
		redPen.price = 500;
		bluePen.color = "파랑";
		bluePen.price = 600;
		blackPen.color = "검정";
		blackPen.price = 1000;
		
		redPen.write();
		bluePen.write();
		blackPen.write();
		redPen.priceInfo();
		bluePen.priceInfo();
		blackPen.priceInfo();
		
		System.out.println(redPen);
		System.out.println(bluePen);
		System.out.println(blackPen);
		
		
	}

}

