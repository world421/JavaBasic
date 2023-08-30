package oop.this_super;

public class Mage extends Player {
	
	int mana;
	
	//생성자 
	Mage(String name){
		super(name); //name 나대신처리해주는 생성자 有
		this.mana = 100;
	}
	
	@Override
	void characterInfo() { //method
		super.characterInfo();
		System.out.println("# 정신력: " + mana); // 객체는 데이터 덩어리라 
	}

}
