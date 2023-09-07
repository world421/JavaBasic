package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
	
		
	/*
	  - 자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용합니다.
	  - 생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정합니다.
	 */
		
		File file = new File("C:/MyWork/folder_test/test/mytest/apple");
		
		if(! file.exists()) { //실존하는 경로인지 !없니 , 해당 파일 및 폴더가 존재하면 true, 존재하지않다면false;
//			file.mkdir(); //1개일때만 , 만들고자하는 경로의 상위 디렉토리가 존재하지 않는다면 동작안함.
			file.mkdirs(); // apple이라는 폴더만들려는데 test /mytest 없어서 만들지못함
			// 폴더생성 => 전부다생성해줍니당
			System.out.println("폴더 생성 완료 ! ");
		}else {
			System.out.println("해당폴더가 존재합니다.");
		}
	}

}
