package basic.array;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {

		// # 배열 (array)
		// → 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형 

		// 1. 배열 변수의 선언
		int[] arr; //java style 데이터 타입 옆에 대괄호가 들어가면 배열이다!
		int arr2[];//c style 
		// ! 페이지정렬 전체선택해서 ctrl + i 단축키 !
		
		// 2. 배열 객체를 생성 - 실제 값들이 저장될 공간을 형성
		// 생성할 때 배열의 크기를 정해줘야합니당 
		arr = new int[5]; //5개짜리 새로운 배열을 선언하겠다
		
		//3. 배열의 초기화 - 배열 내부에 실제 값들을 저장.
        //배열의 초기화는 인덱스를 통해 수행합니다.
        //인덱스란 배열 내부의 위치를 지정할 수 있는 값입니다.
        //인덱스는 0번부터 시작하여 1씩 순차적으로 증가합니다.
		
//		arr = 65; // 위치가 없어서 불가
		arr[0] = 65;
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = (int)3.14;
//		arr[4] = "들어갈까요?"; 안된당
		arr[4] = 100;
//		arr[5] = 70; index 범위 초과 
		
		//4. 배열의 총 크기(길이) 확인 . -> 배열변수명.length 
		
		System.out.println("arr 배열의 길이 : " + arr.length);
		
		//5. 배열에 저장된 값을 참조(사용) 하는 법(index 를 이용)
		System.out.println("배열의 1번째 데이터 : " + arr[0]);
		System.out.println("배열의 2번째 데이터 : " + arr[1]);
		System.out.println("배열의 3번째 데이터 : " + arr[2]);
		System.out.println("배열의 4번째 데이터 : " + arr[3]);
		System.out.println("배열의 5번째 데이터 : " + arr[4]);
		
		System.out.println("==============================");
		
		//6. 배열의 반복문 처리
		//배열은 index 번호를 제어변수로 활용하여 쉽게 반복문을 처리할수있습니다. ! 
		for(int idx=0; idx<arr.length; idx++ ) { 
			System.out.printf("배열의 %d번째 데이터 : %d \n",idx+1,arr[idx]);
		}
		//7.배열 내부의 요소값을 문자열 형태로 한눈에 출력하기 
		System.out.println(Arrays.toString(arr));
		
		//8. 배열의 선언과 생성을 동시에 하기 
		double[] dArr = new double[3];
		String[] sArr=new String[4];
		byte[] bArr=new byte[10];
		
		// 배열은 생성됨과 동시에 각 타입의 기본값으로 자동 초기화 됩니다.
		System.out.println(Arrays.toString(dArr)); // 0.0
		System.out.println(Arrays.toString(sArr)); // null
		System.out.println(Arrays.toString(dArr)); // 0
		
		//9. 배열의 생성과 동시에 초기화도 하는 방법.
		char[] letters =new char[] {'A','B','C','D'};
		System.out.println(Arrays.toString(letters));
		
		//선언과 동시에 초기화를 할 때
		// 딱 1번만 가능한 문법
		// 배열은 크기가 고정이기 때문에 늘어나거나 줄어들 수 없습니다.
		// 만약 배열의 크기를 늘리거나 줄이고 싶다면
		// 기존의 배열을 조작하는 것이 아니라 새롭게 생성하셔야 합니다.
		String[] names = {"홀길동","김철수","박영희"}; // 처음선언하는거면 new String 생략 가능
//		names = {"홀길동","김철수","박영희","뽀ㅃ;"}; 불가함 
		names  = new String[]{"홀길동","김철수","박영희","뽀삐"}; 
		// 자바의 배열은 크기가 고정이라...
		
		
		
		
	}

}
