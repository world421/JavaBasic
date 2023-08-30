package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {
	
		Warrior w1 = new Warrior();
		w1.level=1;
		w1.atk =3 ;
		w1.hp = 50;
		w1.name = " 전사1";
		w1.rage = 60;
		w1.characterInfo();
		
		System.out.println("=================");
		
		Hunter h1 = new Hunter();
		
		h1.level= 5;
		h1.atk = 10 ;
		h1.hp = 60;
		h1.name = " hunter ";
		h1.pet = "나는펫!";
		h1.characterInfo();
		
		
		System.out.println("=================");
		
		Mage m1  = new Mage(); // 각필드의 값 초기화 
		m1.level= 2;
		m1.atk = 120 ;
		m1.hp = 620;
		m1.name = "법사";
		m1.mana = 1000;
		m1.characterInfo();
		
		
		

	}

}
