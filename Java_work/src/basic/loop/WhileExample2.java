package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		// 48~150 사이의 정수 중 8의 배수만 가로로 출력해보세요
		// 48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복 하면 되게따 !! 
//		
//		int n = 48;
//			System.out.print( "8의 배수 출력: ");
//		while (n <=150){
//			if (n%8 == 0) {
//				System.out.print(n + " ");
//			}
//			n++;
		int n = 48;
		while(n<=150) {
			System.out.print(n +" ");
			n +=8;
		}
		
		System.out.println();// 단순 줄 개행 
		
		// 1~ 100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력
		
		int i = 1;
		while (i<=100) {
			if(i%4==0 && i%8!=0) {
			System.out.print(i + " ");
		}i++; //step 
	}
		
		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력 .
		
		int t =1;
		int count = 0;// 배수의 개수 
		
		while ( t <= 30000) {
			if(t%258 ==0){
				count++;
			}
			t++;
		}
		System.out.println("1~30000 중 258의 배수의 개수 : " + count + "개");
	
		System.out.println("==========================");
		//1000의 약수의 개수를 구하세요. 얘라 떨어뜨렸을때 나눠떨어지는거 
		
		int r = 1;
		int tcount = 0;
		
		while (r <=1000) {
			if (1000%r ==0) {
				tcount++;	
			}
			r++;
		}
		System.out.print("1000의 약수의 개수 :" + tcount + "개");
	}

}
