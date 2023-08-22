package basic.operator;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
        # 3항 연산자
        - 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
        - (조건식 ? 좌항 : 우항);
        - 조건식을 비교하여 true일 경우에는 좌항이,
         false일 경우에는 우항의 값이 도출됩니다.
         
         //! 조건식의 값에 따라 
        */
		
		int x =10, y=20;
		String result = (x>y ? "x는 y보다 큽니다." : "x는y보다 작습니다.");
		System.out.println(result);
		
		// 난수를 발생시키는 메서드 Math.random()
		// 0.0 이상 1.0 미만의 실수 난수값을 변환합니다.
		
//		double rn = Math.random();
//		System.out.println(rn);
 		
		
		// 1~10까지의 '정수' 난수를 발생시키고 싶어요.~~~ 
		
		int rn = (int)((Math.random()*10)+1);
		System.out.println("rn 값 출력: "+rn);
		 					// 0.0 <= ~ <11.0 뒷범위 맞춰줌	
							// 1더해서 앞범위 맞춰줌 
		
		//10~100까지의 정수 난수 발생 // 0.0 1.0 미만 범위 101미만  
		int rn2 =  (int)((Math.random()*91)+10);
		System.out.println(rn2);
		
		//34~176 까지의 정수 난수 발생 
		int rn3 = (int)((Math.random()*143)+34);
		System.out.println(rn3);
		
		
				
				
		
		
		
		
		
		
		
		
		
	}

}
