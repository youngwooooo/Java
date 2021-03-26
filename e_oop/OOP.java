package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)  ==> 한 파일에 너무 길게 코딩을 하지말고 객체를 기준으로 파일들을 나누자!
		 * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체 간의 상호작용으로 보는 것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 */
		
		// SampleClass의 메서드를 호출하기 위한 객체 생성
		SampleClass sc = new SampleClass();  // 클래스 객체 생성 및 초기화
		
		System.out.println(sc.field);  // SampleClass에 있는 전역변수 출력
		
		String returnValue = sc.method1(5); // sc.method1(parameter) 메서드를 불러서 parameter에 5라는 값을 넣고 
		System.out.println(returnValue);	// 5는 SampleClass에 복사가 되서 실행한 후 그 값을 다시 OOP에 메서드를 호출했던 곳으로 돌아가고 
											// 그것을 String returnValue라는 변수에 저장
		
		sc.method2();
		
		sc.flowTest1();
		
		
		
		
		// 계산기문제 출력
		Calculator cal = new Calculator();  // 계산기 메서드를 사용하기위해 호출
		
		//1. 123456 + 654321
		double sum = cal.sum(123456, 654321);
		System.out.println(sum);
		//2. 1번의 결과값 * 123456
		double multiply = cal.multiply(sum, 123456);
		System.out.println(multiply);
		//3. 2번의 결과값 / 123456
		double division = cal.division(multiply, 123456);
		System.out.println(division);
		//4. 3번의 결과값 - 654321
		double minus = cal.minus(division, 654321);
		System.out.println(minus);
		//5. 4번의 결과값 % 123456
		double remainder = cal.remainder(minus, 123456);
		System.out.println(remainder);
		
		// 선생님 풀이
		/*
		 * Calculator cal = new Calculator();
		 *
		 * double result = cal.add(123456, 654321)
		 * result = cal.multiply(result, 123456)
		 * result = cal.divide(result, 123456)
		 * result = cal.subract(result, 654321)
		 * result = cal.mod(result, 123456)
		 * system.out.println(result);
		 */
		
		
	}
	// 메서드 밖에서는 변수 선언 외의 아무 일도 할 수 없다!
}
