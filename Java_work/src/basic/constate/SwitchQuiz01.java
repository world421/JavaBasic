package basic.constate;

import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {
		/*
        - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
         다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
         연산 결과를 출력해 주시면 됩니다. (switch문 사용)
         연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
         결과를 말씀해 주세요.
        */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 :");
		int num1 = sc.nextInt();
		System.out.print("연산자 하나를 입력해주세요(+, - , *, /) :");
		String str = sc.next();
		System.out.print("정수를 입력해주세요 :");
		int num2 = sc.nextInt();
		
		switch(str) {
			case "+":
				System.out.println("입력값 : " + num1+num2);
				break;
			case "-":
				System.out.println("입력값 : " + (num1-num2));
				break;
			case "*":
				System.out.println("입력값 : " + num1*num2);
				break;
			case "/":
				System.out.println("입력값 : " + num1/num2);
				break;
		default:
			if(str!="+" ||str!="-"||str!="*"||str!="/") {
				System.out.println("연산자를 똑바로 입력하세요");
			}else {
//				System.out.printf("입력하신 값 %d %s %d = ",num1,str,num2 );
			}
			
			sc.close();
		}
		
	
		
		
		
		
		
		
	}

}