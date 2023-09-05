package practice.pra0905;

public class MathQuiz {
	
	public static int page(int x) {
		return (int)(Math.ceil(x/10));
	}
	
	static int page2(int x, int y) {
		return Math.max(x,y);
	}
	
	public static double random() {
		return Math.random();
	}
	
	
	
	public static void main(String[] args) {
		
	 	System.out.println(page(50)+ "page");
	 	System.out.println("출력 : " + page2(10,20));
	 	System.out.println("출력 : " + random()*10);
	 	
	 	int num = (int)(random()*10);
	 	
	 	System.out.println("출력 : "+ num);
	 	// 0부터 10까지 
	
	/*
        1 ~ 10이 전달되면 1이 반환되고,
        11 ~ 20이 전달되면 2가 반환되고,
        21 ~ 30이 전달되면 3이 반환되고.......
        이러한 로직을 수행하는 static 메서드 page를 선언해 보세요.
        
        11 / 2 
    */
		
		
		
	}
}
