package oop.constructor;

public class Person {

	String name;
	int age;
	int feet;
	
	Person(){
		System.out.println("기본 호출!");
		name = "최고심";
		age = 18;
		feet = 150;
	}
	
	Person(String pName, int pAge){

		System.out.println("기본 2호출!");
		name = pName;
		age = pAge;
		feet = 200;
	}
	
	Person(String pName, int pAge, int pFeet){

		System.out.println("기본 3호출!");
		name = pName;
		age = pAge;
		feet = pFeet;
	}
	
	
	void info() {
		System.out.println("***"+ name +" 정보 ***");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키  : " + feet);
	}
}
