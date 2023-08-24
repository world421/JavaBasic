package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {
		
		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 연산 퀴즈 *** ");
		System.out.println("[퀴즈를 종료하시려면 0을 눌러주세요]");
		
		int count = 0; //정답횟수 누적 
		int cou = 0; // 오답횟수 누적
		
			while(true) {
				int rn1 = (int)((Math.random()*100)+1); //난수범위 1이상 100미만
				int rn2 = (int)((Math.random()*100)+1);
				int num = (int)(Math.random()*2); // 0이상 2미만 : 0,1 생성
				
				int correct;//정답
				if (num == 0) {
					System.out.printf( "%d + %d = ???\n", rn1,rn2);
					correct = rn1+rn2;
				}else {
					System.out.printf( "%d - %d = ???\n", rn1,rn2);
					correct = rn1-rn2;
				}
				
				int answer = sc.nextInt();
				if (answer == correct) {
					System.out.println("정답입니다.");
					count++;
				}
				else if (answer==0) {
					
					break;
				}
				else {
					System.out.println("오답입니다");
					cou++;
				}
			}		
			System.out.println("===============");
			System.out.println("정답횟수 :" +count);
			System.out.println("오답횟수 :" +cou);
			
			sc.close();
		
	}				
}

