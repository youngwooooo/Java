package e_oop;  // 클래스의 위치를 알려줌

public class SampleClass {
		
	public static void main(String[] args) {
		int local = 10;  // 지역변수 : 메서드 안에서만 사용하는 변수
	}
	
	int field;  // 전역변수 : 클래스 전체 영역에서 사용하는 변수
			    // 초기화 하지 않아도 자동으로 기본 값으로 초기화가 됨!
	//기본값
	/*
	 * char : ' '(0) 공백
	 * boolean : false
	 * 참조형타입 : null
	 * 그 외(정수, 실수) : 0
	 */
	
	
	/*
	 * 메서드 : 변수를 가지고 할 일
	 * - 선언 방법 : 리턴타입 메서드명(파라미터){ }
	 * - 파라미터(매개변수) : 실행에 필요한 정보
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물
	 */
	
	String method1(int parameter){
		return parameter + " 를 받아 명령을 수행하고 결과물을 리턴하는 메서드";
	}

	void method2(){  // void : 비어있다.
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}
	
	// flowTest1() 호출 시 출력되는 문장에 출력 순서대로 번호를 붙여주세요.
	void flowTest1(){
		System.out.println("flowTest1 시작 : 1");
		flowTest3();
		System.out.println("flowTest1 종료 : 6");
	}
	
	void flowTest2(){
		System.out.println("flowTest2 시작 : 3");
		System.out.println("flowTest2 종료 : 4");
	}
	
	void flowTest3(){
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

