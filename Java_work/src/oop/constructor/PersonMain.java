package oop.constructor;

public class PersonMain {

	public static void main(String[] args) {
		
		/*
        Scanner를 이용해서 사용자에게
        이름, 나이, 키를 입력받아서 
        해당 정보를 저장하는 객체를 디자인 해 보세요.
        객체 내에는 해당 사람의 정보를 모두 출력 해 주는
        info() 메서드가 존재합니다.
        */
		
		Person impor= new Person(); 
		impor.info();
		System.out.println("==========================");
		
		Person inpor2= new Person("두번째사람", 20); 
		inpor2.info();
		System.out.println("==========================");
		
		Person inpor3= new Person("세번째사람", 18 ,180); 
		inpor3.info();
		

	}

}
