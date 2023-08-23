package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		/*
        - 스캐너를 사용하여 이름과 나이를 입력받아서
        
        이름: XXX
        나이: XX세
        출생년도: XXXX년
        
        을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고
        출생년도는 입력사항이 아닙니다.)
        */
		
		Scanner sc = new Scanner(System.in); //스캐너 장치 생성
		
		
		
		
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("==================================");
		System.out.println("이름 : "+ name + "\n나이 : " +age + "\n출생연도 :" +(2023 -age+1));
		System.out.println("==================================");

		sc.close(); // !! 중요 !! 
	}

}
