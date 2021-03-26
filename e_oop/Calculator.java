package e_oop;

public class Calculator {
		// 산술연산 계산기(+, -, *, /, %)
		// 하나의 메소드에서는 연산할 파라미터를 두 개받아서 연산 후 리턴, 총 메소드 5개
			
	
	// 더하기
	double sum(double a, double b){
		return a + b;
	}
	
	// 빼기
	double minus(double a, double b){
		return a - b;
	}
	
	// 곱하기
	double multiply(double a, double b){
		return a * b;
	}
	
	// 나누기
	double division(double a, double b){
		return a / b;
	}
	
	// 나머지
	double remainder(double a, double b){
		return a % b;
	}
	
	
}
