package oop.inherit.good;

public class Mage extends Player {

	int mana;
	
	@Override
	void characterInfo() {
		
		super.characterInfo(); //부모의 cha~ 가져옴
		System.out.println("# 정신력 : " + mana);
	}
	
	

}
