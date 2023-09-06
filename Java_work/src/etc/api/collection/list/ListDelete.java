package etc.api.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> kakao = new ArrayList<>();
		Collections.addAll(kakao, "무지", "네오","어피치","라이언","제이지","춘식이");
		System.out.println("현재 저장된 친구들 : " + kakao);
		System.out.print("삭제할 친구를 입력하세요 ");
		String name = sc.next();
		
		/*
		 * 입력받은 이름을 리스트 내에서 삭제하세요.
		 * 삭제후 결과도 출력하세요
		 * 없으면 없는 이름이라고 출력해주세요.
		 */
	
		
			
		if(kakao.contains(name)) {
			kakao.remove(name);
			System.out.println("삭제후 정보: " + kakao);
		}else {
			System.out.println("존재하지 않는 이름");
		}
		
			sc.close();
		
		
	}

}
