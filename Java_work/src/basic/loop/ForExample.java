package basic.loop;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
		/*
		int i = 1; // 제어변수 이름 간단하게 
		int total = 0;
		while(i<=10) {
			total +=i;
			i++;
		};
		System.out.println(total);
		*/
		
//		int total = 0;
//		for(int i =1;i<=10; i++) {
//			total +=i;
//		}
//		System.out.println(total);
		//  for 문은 반복횟수가 명확할때 , while 반복횟수가 정확하지 않을때(무한루프)
		
		// 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 를 \
		//가로로 출력해보세요 (for)
		
		
//		for (int a= 1; a<=200; a++) {
//			if(a%6==0 && a%12!=0);			
//				System.out.print(a);
//		}
//		
//		System.out.println();
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요 (for)
		
//		int total1=0;
//		for (int i =1; i<=60000;i++) {
//			if(i%177 ==0);{
//			total1++;
//			}
//			System.out.print(i);
//		}
		
			
			
		// 정수를 하나 입력받아서
			// 입력받은 정수까지의 팩토리얼 값을 구하세요
			//팩토리얼 ) 5! -> 5*4*3*2*1
			
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요");
		int num = sc.nextInt();
		
		int fac = 1; // 팩토리얼 최종 값을 담을 변수 
//		for (int i=1 ; i<=num ; i++) {
//			fac *=i;
//			System.out.println(fac);
//		}
		
//		for(int i =num; i>=1; i--)
//			fac *=i;
//		} // 입력받은값부터 1까지 작아진다 
//		
//		System.out.println("%d! %d\n", num,fac);
//		
//		sc.close();
//		
			
		
		
		
	}

}
