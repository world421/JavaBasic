//package oop.obj_arr;
//
///*
//     - 이름, 국어, 영어, 수학, 총점, 평균(double)을
//      담을 수 있는 객체를 디자인하세요.
//      
//     - 학생의 모든 정보를 한 눈에 확인할 수 있게
//      scoreInfo() 메서드를 선언해 주세요.
//      메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
//      
//     - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
//    */
//
//public class Score {
//
//	private String name;
//	private int kor; //사용자가 입력한 값으로만 생성자 생성 
//	private int eng;
//	private int math;
//	private int total;
//	private double average;
//	
//	public Score() {}
//	
//	public Score(String name, int kor, int eng, int math) {
//		super();
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.mate = math;
//		this.total = kor + eng + math;
//		this.average = this.total /3.0;
//	}
//
//	
//	
//	
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getKor() {
//		return kor;
//	}
//
//	public void setKor(int kor) {
//		this.kor = kor;
//	}
//
//	public int getEng() {
//		return eng;
//	}
//
//	public void setEng(int eng) {
//		this.eng = eng;
//	}
//
//	public int getMate() {
//		return math;
//	}
//
//	public void setMate(int math) {
//		this.math = math;
//	}
//
//	public int getTotal() {
//		return total;
//	}
//
//	public void setTotal(int total) {
//		this.total = total;
//	}
//
//	public double getAverage() {
//		return average;
//	}
//
//	public void setAverage(double average) {
//		this.average = average;
//	}
//
//	private void scoreInfo() {
//		System.out.printf("이름: %s 국어 : %d점 영어 :%d점 수학 :%d점 \n 총점 %d점,평균 %.2f점\n",
//				name,kor,eng,math,total,average);
//				
//
//	}
//	
//	
//}
