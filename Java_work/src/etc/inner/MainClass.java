package etc.inner;

public class MainClass {
	
	//내부 클래스 (inner class)
	//해당 객체와 밀접한 연관이 있는 경우 클래스 내에서 클래스를 선언.
	// 일반적인 class를 정의할 떄는 private을 사용할 수없지만
	// 클래스 내에 클래스를 선언하는 경우에는 private 선언이 가능.
	// static -> 메모리 효율을 높이기 위해 선언. (바깥쪽 클래스 호출 시마다 재생성하는 것을 방지)
	private static class Subcalculator implements Calculator{ 
		
		@Override
		public int operate(int n1, int n2) {
			return n1-n2;
		}
	}

	public static void main(String[] args) {
	
		// 덧셈 계산을 하는 계산기를 만들어 쓰고 싶다.
		Calculator addCal = new AddCalculator();
		System.out.println(addCal.operate(30, 50));
	
		// 뺄셈 계산을 하는 계산기가 필요.
		Calculator sub1 = new Subcalculator();
		Calculator sub2 = new Subcalculator();
		Calculator sub3 = new Subcalculator();
		System.out.println(sub1.operate(100, 40));
		
		// 곱셈 계산기 . (익명클래스)
		// 말 그대로 이름이 없는 클래스를 즉석에서 선언.
		// 선언한 클래스 내에서는 주소값을 통해 객체를 사용할 수 있지만
		// 외부에서는 지목할 방법이 없기 때문에 객체 사용이 불가능.! 
		Calculator multiCal = new Calculator() {
			
			
			@Override
			public int operate(int n1, int n2) {
				return n1*n2;
			}
		};

		System.out.println(multiCal.operate(5, 7));
		// 나눗셈을 하는 계산기 (람다 ) - > Interface 의 추상메서드가 딱 1개일경우만 가능.
		// 어차피 인터페이스에 추상메서드가 1개이기떄문에 이름을 따로 명시하지 않음
		// 메서드 내부로직이 단 한 줄 이라면 괄호 생략 가능 -> return값으로 취급!
		Calculator divCal = (n1,n2) -> n1/n2;
			
		//리턴값 2개 받아서 n1/n2 진행 ! 
		System.out.println(divCal.operate(25, 5));
		
		Pet dog =new Pet() {  //pet은 인터페이스라 객체 생성 못함 
			
			@Override
			public void play() {
				System.out.println("강아지는 마당에서 노라효~!");
				
			}
			
			@Override
			public void eat() {
				System.out.println("강아지는 사료를 먹어요 ~! ");
			}
		};
		
		dog.play();
		dog.eat();
		
	}

	
}
