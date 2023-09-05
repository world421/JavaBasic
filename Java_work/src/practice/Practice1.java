package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice1 {


		public static void main(String[] args) {
			
			
			/*
	        # 예외 처리
	        - 개발자가 코드를 통해 처리할 수 있는 에러를 다루는 것.
	        - 예외 처리는 시스템 스스로 오류를 복구하는 것이 아니고
	         오류 발생 가능성이 있는 부분에 대한 처리를 미리 준비하는 것입니다.
	        - 시스템의 비정상적 종료를 막고 코드의 흐름이 계속될 수 있도록
	         사전에 준비하는 행위를 말합니다. 
	        */
			
			
			// 정수 2개 받아서 나눗셈하기 ! 
			// try 와 catch 사용 
		
			Scanner sc = new Scanner(System.in);
			
			
			try{System.out.print("정수 1: ");
			int num1 = sc.nextInt();
			System.out.print("정수 2: ");
			int num2 = sc.nextInt();
			System.out.printf("> %d / %d = %d",num1,num2,num1/num2);
			}catch(InputMismatchException e) {
				System.out.println("문자열 오류 ");
			}catch(Exception e) {
				System.out.println("오류 !!! ");
			}
			
					
			sc.close();
			
			

	}


}
