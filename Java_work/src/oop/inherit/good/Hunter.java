package oop.inherit.good;

public class Hunter extends Player{ // 상속받음 !
	
	String pet;
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 펫 이름 :" + pet);
	}

}
