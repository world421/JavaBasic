package oop.poly.player;

public class Warrior extends Player {
	
	int rage;
	
	Warrior(String name){
		// 모든 생성자에는 super()가 내장되어 있습니다.
		// 자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
		// 부모의 속성과 기능이 실존하게 되고 , 물려줄 수 있기 때문입니다
		
		super(name); // 자바가상머신이 자동으로 생성 ! super () : 부모생성자호출
		//super는 자기의 직속 부모 
		//지금 생성되고 있는 객체에 
		this.rage = 60;
	}
	
	@Override
	void characterInfo() {
		
		super.characterInfo();
		System.out.println("#분노 :" + rage);
	}

}
