package etc.api.lang.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//실수 난수 : 0.0 < = ~ <=1.0
		double d = r.nextDouble();
		System.out.println(d);

		
		//정수 난수
		int i = r.nextInt()	; //기본범위 :int 의 전범위
		System.out.println(i);
		
		// 0~5까지의 정수 난수 생성 (끝값이 미만으로 인식됨)
		int j = r.nextInt(6); //  () 앞은 끝범위
		System.out.println(j);

		// 10~100까지의 정수 난수 생성
		int k = r.nextInt(91) +10; 
		System.out.println(k);
		
		boolean t = r.nextBoolean();
		System.out.println(t); 
				
		
	}

}
