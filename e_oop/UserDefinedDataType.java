package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다.(기본형 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메서드로 구성할 수 있다.
		 */
		
		// 기본형
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		// 배열
		int[] score;
		int[] sum2;
		double[] avg2;
		String[] name2;
		
		// 클래스
		Student student;// 클래스 변수 선언
		student = new Student();  // 클래스 초기화(객체 생성 or 인스턴스화 = 클래스의 내용이 컴퓨터 메모리에 올라간 것)  ==> 여기까지 클래스 사용 준비를 마친 것.
		
		student.kor = 80;
		student.eng = 90;
		student.math = 70;
		student.sum = student.kor + student.eng + student.math;
		student.avg = student.sum / 3.0;
		student.name = "홍길동";
		
		System.out.println(student.name + " / " + student.sum + " / " + student.avg);
		
		
		Student student2;
		student2 = new Student();
		
		student2.kor = (int)(Math.random()*101);
		student2.eng = (int)(Math.random()*101);
		student2.math = (int)(Math.random()*101);
		student2.sum = student2.kor + student2.eng + student2.math;
		student2.avg = student2.sum / 3.0;
		student2.name = "이영우";
		
		System.out.println(student2.name + " / " + student2.sum + " / " + student2.avg);
	}

}

class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
}