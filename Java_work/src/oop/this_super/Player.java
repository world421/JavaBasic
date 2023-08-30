package oop.this_super;

public class Player extends Object{
	
	String name;
	int level;
	int atk;
	int hp;
	
	Player(){
		System.out.println("Player의 기본 생성자 호출!");
		System.out.println("this 의 주솟값  : " +this);
		level =1 ;
		atk = 3;
		hp = 50;
	
	}
	
	Player(String name){
		this(); //같은 클래스의 다른 생성자를 부르는 문법
		System.out.println("Player의 2번 생성자 호출!");
//		System.out.println("this 의 주솟값  : " +this);

		//level =1 ;
		//atk = 3;
		//hp = 50;
		this.name = name; // 지금생성되고있는 그객체의 값 		
	}
	
	Player(String name,int hp){
		this(name); // e다른 생성자의 호출은 생성자 내에서 최상단에 위치해야합니다.
		System.out.println("Player의 3번 생성자 호출!");
		this.hp = hp;

		//level =1 ;
		//atk = 3;
		//hp = 50;
		this.name = name; // 지금생성되고있는 그객체의 값 		
	}

	void attack(Player target) {
//		System.out.println("targer" + target);
//		System.out.println("this" + this);
		
		
		if(this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;		//void 에서 return 강제ㅗ종료 
		}
			
		//출력메시지 : x가 y를 공격합니다.
		System.out.printf("%s가 %s를 공격합니다.\n", this.name,target.name);
		
		
		// 맞는 사람의 hp 를 10 낮추고 나의 체력을 5회복하고 싶다.
		// 결과를 출력하자 (나의 체력 : xx, 상대의 체력 xx)
		target.hp -= 10;
		this.hp +=5;
		System.out.printf("나의체력 : %d, 상대의체력: %d\n",this.hp,target.hp);
		
	}
	
	
	void characterInfo() {
		System.out.println("***캐릭터의 정보 ***");
		System.out.println("# 아이디 : "+name);
		System.out.println("# 레벨 : "+level)	;
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : "+ hp);
		System.out.println("이 메서드를 호출한 객체의 이름 : " + this.name);
		
	}
	

}
