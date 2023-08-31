package oop.overloading;

public class Calculator {

	/*
    # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
     생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.
     
    - 오버로딩 적용 조건:      3개 중 하나 만족시켜야함 
    1. 매개 변수의 데이터 타입이 다를 것! or
    2. 매개 변수의 전달 순서가 다를 것! or
    3. 매개 변수의 개수가 다를 것.
    */
	
	//3번 
	void inputData(){} 
	void inputData(int a){}
	void inputData(int a,int b){}
//	void inputData(int b,int a){} (x)
	void inputData(String s) {} // 매개변수의 데이터 타입이 다름 
	
	void inputData(int a, double d ) {} // 1번 만족 !
	void inputData(double d, int a ) {} 
//	void inputData(int number ){} (x) 정수 매개값 1개를 받는 메서드가 이미 선언됨.
	
//	int inputData(int number) {
//		return 0;
	//}// // (x) 반환 유형(return type)은 오버로딩에 영향을 미치지 못합니다. 
		// 
	
	
	
	// 호출할때 구분이 되면 중복선언 가능

	
	// 내가 한거 ! 
//	void calcRectArea(int a) {
//		int b = a*a;
//		System.out.printf("정사각형의 넓이 : %d ", b);
//	}
//
//	void calcRectArea(int a, int c) {
//		int b = a*c;
//		System.out.printf("직사각형의 넓이 : %d ", b);
//	}
//	void calcRectArea(int a, int c, int h) {
//		int b = a*c ; //밑변 + 윗변 /2  * 높이 
//		System.out.printf("사다리꼴의 넓이 : %d ", b);
//	}
//	
	// 오버로딩은 데이터 타입 영향 x

//	
	int calcRectArea(int r ) {
		return r*r;
	}
	
	int calcRectArea(int width, int height) {
		return width * height;
	}
	
	double calcRectArea (int ceil, int floor, int height) {
		return (ceil + floor ) * height /2.0;
	}
	
	
	
	
	
}
