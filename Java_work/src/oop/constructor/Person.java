package oop.constructor;

public class Person {

	String name;
	int age;
	int height;
	
	Person(){} //기본생성자는 하나 만들어놓고 비워놓아야 나중에 원하는거받을수이ㅣㅆ음!!
	
		
	Person(String pName, int pAge,int pHeight){

		name = pName;
		age = pAge;
		height = pHeight;
	}
	
		
	void info() {
		System.out.println("***"+ name +" 정보 ***");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("키  : " + height +"cm");
	}
}
