package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable{

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ** equals ** //
	
	@Override
	//Person 객체의 이름을 비교해주는 메서드로 override
	public boolean equals(Object obj) { // 매개변수 
		if(this == obj)return true;// 객체가 같은건지 
		if(obj instanceof Person) { //person타입 가질수있으면 ! true
			Person p = (Person) obj; // object 타입을 Person타입으로 형 변환 - > name과 age를 확인 가능.
			if(this.name.equals(p.name) && this.age == p.age) {
				return true;
			}
		}
		return false;
	}
	//////////////////////
	
	
	//// ** hashCode ** //
	
	//equals를 오버라이딩 할 때는 hashCode 도 함께 오버라이딩을 진행해주는 것이 좋습니다.
	//equals를 재정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에 
	//hash code의 값도 그에 맞게 재정의가 되어야합니다(hash의 주소를 equsls ㅔㅇ맞게)
	@Override
	public int hashCode() {
		return Objects.hash(age,name);
	}

	
	@Override
	protected void finalize() throws Throwable {
		// 생성된 객체가 사라지는 시점에서 자동으로 호출(gc 실행될 때)
		System.out.println(this.name + "가(이) 주겄습니당 ㅠㅠ ");
	}

	//객체복사메서드
	// Cloneable 인터페이스를 구현해서 사용해야합니다.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}


	@Override
	public String toString() { // 타입바꾸면 x
		return "[name=" + name + ", age=" + age + "]";
	}

	public void personInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
	}
	
	
}
