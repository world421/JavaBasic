package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		// 2 ~ 19까지의 난수를 생성해서 구구단을 출력 (for)
		// 19 행까지 출력
		
		int num = (int)((Math.random()*18)+2); 
		System.out.println("*** " + num + "단 ***");
		System.out.println("====================");
		for (int i = 1; i<20;i++)
			System.out.println(num+ "x"+ i +"=" + num * i);
			//System.out.printf ("%d  x %d =d%\n",num , i, num*i)
		
	}

}
