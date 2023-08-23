package basic.constate;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		/*
        - 정수 3개를 입력 받습니다.
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" *** 정수를 3개 입력하세요 *** ");
		System.out.print("첫번째 값 : ");
		int max = sc.nextInt();
		System.out.print("두번째 값 : ");
		int mid = sc.nextInt();
		System.out.print("세번째 값 : ");
		int min = sc.nextInt();
		
		if (max>mid && max>min) {
				System.out.println(max);
		}else if (mid >min && mid<max) {
				System.out.println(mid);
		}else if(min<max && min<mid){
				System.out.println(min);
				
		}
		System.out.printf("가장 큰 값: %d \n 가장 작은 값: %d \n 중간값: ", max,min,mid);
		

	}
}
