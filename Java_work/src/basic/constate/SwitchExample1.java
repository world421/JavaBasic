package basic.constate;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요. (M/F)");
		System.out.print(">");
		String gender = sc.next();
		
		switch(gender) { //스위치문 아래까지 수행함 
		
		/*
        switch 괄호 안에 지정하신 기준값에 따라 
        만족하는 case문을 순서대로 탐색합니다.
        적합한 case가 존재하는 경우에는 해당 case에
        종속된 문장을 실행합니다.
        따로 조치가(ex.break) 없다면 나머지 케이스들이 연속적으로 실행됩니다.
        */
		
		
			case "M" : case "m" : case "ㅡ" :
				System.out.println("남성입니다.");
				break; //해당 케이스만 실행하고 switch 문을 종료해라 ! 탈출해! ! 
			
			case "F":
				System.out.println("여성입니다.");
				break;
				
			default: // case 를 설정하지 않은 값들은 모두 default로 빠진다.
				System.out.println("잘못된 입력입니다");
		}
		sc.close();
	}

}
