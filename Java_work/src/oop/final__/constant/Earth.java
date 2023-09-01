package oop.final__.constant;

public class Earth {
	
	/*
    # 상수 (constant)
    
    - 상수는 고정된 불변의 값입니다. 따라서 어디에서 접근을 하더라도
     같은 값이 나와야 하며, 값의 변경 또한 불가능해야 합니다.
     
    - 따라서 자바에서는 상수를 선언할 때 static, final을 동시에 사용합니다.
    */
	

	static final double RADIUS = 6400; //상수는 대문자가 관ㄹ ㅖ ! 
	
	static final double SURFACE_AREA; //값 직접 대입, 생성자 이용
									// 자바에서 유일하게 _ 사용하는건 상수!
	
	static {
		SURFACE_AREA = RADIUS * RADIUS * Math.PI * 4;
		Math.random(); // static method 
		
		
	}
	
	
}
