package oop.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		/*
        1. 스캐너를 통해 id를 입력받습니다.
        2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높습니다.
        3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요.
        4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력후
        종료하세요.
        */
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("id를 입력하세요");
//		String id = sc.next();
//		id.trim();
//		int len = id.length();
//		if (len<5) {
//			System.out.println("5글자 이상 입력하세요");
//		}else 
//			System.out.println("id가 등록되었습니다.");
//	
//				
//		System.out.println("등록된 id : " + id);
		
		while(true) {
			System.out.println("id: ");
			String id = sc.nextLine();
			id = id.trim();
			
			}
		
		
	}

}
