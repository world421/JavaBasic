package oop.poly.car;

public class CarShop {
	
	/*
    - 키워드 instanceof는 객체가 지정한 클래스 타입을 가질 수 있는
     객체인지를 검사할 때 사용하는 연산자 입니다.
     
    - instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수
     있는 지를 물어봐서 그렇다면 true, 그렇지 않다면 false를 도출합니다.
    */
	
	public void carPrice(Car c) {//매개변수
		//메서드선언
		if(c instanceof Sonata) {
			//c 변수로 전달된 객체가 Sonata 타입을 가질수있니 !	
		System.out.println("소나타의 가격은 3000만원 입니다.");
		}else if (c instanceof Tesla) {
			System.out.println("테슬라의 가격은 7000만원 입니다.");
		}else if (c instanceof Porsche) {
			System.out.println("포르쉐의 가격은 2억 4천만원입니다.");
		}
	}

}
