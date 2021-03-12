package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
/*	연산자
 * 1. 산술연산
 * - 사칙연산 : +, -, *, /, %(나머지)
 * - 복합연산자 : +=, -=, *=, /=, %=
 * - 증감연산자: ++, --
*/
		
		// 1) 사칙연산
		int result = 10 + 20 - 30 * 40 / 50 % 60;   // 나머지는 나누기와 같다.
		
		// 나머지 연산
		result = 10 / 3;
		System.out.println(result);
		result = 10 % 3;
		System.out.println(result);
		
		// 5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		result = 20 + 10;
		System.out.println(result);
		result = 20 - 10;
		System.out.println(result);
		result = 20 * 10;
		System.out.println(result);
		result = 20 / 10;
		System.out.println(result);
		result = 20 % 10;
		System.out.println(result);
		
		// 2) 복합연산자
		// 변수에 값만큼을 계산해준다.   
		result = result + 3;
		
		result += 3; // result에 3만큼 더해준다
		
		result -= 5; // result에서 5만큼 빼준다
		
		result *= 2; // // result에 2만큼 곱해준다.
		
		// 아래의 문항을 복합연산자를 사용한 문장으로 만들어주세요
		// result = result + 10; 
		result += 10;  // result에 10만큼 더해준다
		
		// result = result % 5;
		result %= 5; // result를 5로 나눈 나머지 값
		
		// result = result -2 * 3;  // result에 -2*3값을 곱해준다.
		result *= -2 * 3; 
		
		
		// 3) 증감연산자 => 문장 속에 들어가 있을 경우 유의할 것!
		// - 증가연산자(++) : 변수의 값을 1 증가시킨다. 
		// - 감소연산자(--) : 변수의 값을 1 감소시킨다.
		int i = 0;
		
		++i;  // 전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++;  // 후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		
		i = 0;
		System.out.println("++i = " + ++i);  // 변수의 값을 1만큼 증가시키고 읽는다.
		i = 0;
		System.out.println("i++ = " + i++);  // 변수의 값을 읽고 1만큼 증가시킨다.
		System.out.println(i);
		
		--i;  // 전위형 : 변수의 값을 읽어오기 전에 1 감소된다.
		i--;  // 후위형 : 변수의 값을 읽어온 후에 1 감소된다.

		i = 0;
		System.out.println("--i = " + --i);  // 변수의 값을 1만큼 감소시키고 읽는다.
		i = 0;
		System.out.println("i-- = " + i--);  // 변수의 값을 읽고 1만큼 감소시킨다.
		System.out.println(i);
		
		// 피연산자의 타입이 서로 같아야만 연산이 가능하다.
		// but, 타입이 서로 다를 때 자동 형 변환인 경우에는 연산이 가능!
		// ex) 정수 + 정수 = O , 정수 + 실수 = X
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double;  // (double)_int에서 double이 생략
		System.out.println(result2);
		
		long _long = 100L;
		_long = _int + _long;  // (long)_int에서 long이 생략
	    _int = _int + (int)_long;  // 더 큰 값의 형 변환은 표기를 해주어야함!
	    
	    byte _byte = 5;
	    short _short = 10;
	    _int = _byte + _short;  // int보다 작은 타입은 int로 형 변환된다.
	    
	    char _char = 'a';  // 문자로 표현이 될 뿐 숫자라고 생각하자. 유니코드에서 a = 97 , b = 98
	    char _char2 = 'b';
	    _int = _char + _char2;  // char는 2byte기 때문에 4byte인 int로 형 변환이 된다.
	    System.out.println(_int);
	    
		// 오버플로우 : 가장 큰 값을 벗어나는 현상  ==> 가장 작은 값이 출력
	    // 언더플로우 : 가장 작은 값을 벗어나는 현상 ==> 가장 큰 값이 출력
	    // 표현범위를 벗어나는 값을 표현할 때 발생하는 현상
	    
	    byte b = 127;
	    b++;
	    System.out.println(b);
	    b--;
	    System.out.println(b);
	    
	    // 00000000 or 11111111(맨 앞의 0,1은 제외) = 1byte
	    // byte 범위 : -2^7 ~ 2^7 -1 , 2^7 = 128
	    // short 범위 : -2^15 ~ 2^15 -1 
	    // int 범위 : -2^31 ~ 2^31 -1 
	    // long 범위 : -2^64 ~ 2^64 -1
	    // char 범위 : 0 ~ 2^16  * 문자이기 때문에 -가 필요가 없음
	    
	    // 다음을 한 줄씩 계산해서 최종 결과값을 출력해주세요.
	    // 1. 123456 + 654321
	    // 2. 1번의 결과값 * 123456
	    // 3. 2번의 결과값 / 123456
	    // 4. 3번의 결과값 - 123456
	    // 5. 4번의 결과값 % 123456
	    long l = 123456 + 654321;
	    System.out.println(l);
	    l *= 123456;
	    System.out.println(l);
	    l /= 123456;
	    System.out.println(l);
	    l -= 654321;
	    System.out.println(l);
	    l %= 123456;
	    System.out.println(l);
	    
	    // 3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 출력해주세요.
	    int q = 15;
	    int w = 34;
	    int e = 49;
	    int sum = q + w + e;
	    double avg = sum / 3.0;
	    System.out.println("sum : " + sum + " / avg :" + avg);
	    
	    // 반올림
	    // 반올림을 하기 전에 소수점 단위를 수정한다.
	    avg = Math.round(avg * 10) / 10.0;
	    System.out.println(avg);
	    
	    // 랜덤
	    // Math.random()
	    // Math.random() 범위 : 0.0 ~ 1.0미만(0.999999...)
	    int random = (int)(Math.random() * 100) + 1; // 1 ~ 100까지의 랜덤 값 발생
	    // int random = (int)(Math.random() * 100); ==> 0 ~ 100까지의 랜덤 값 발생
	    System.out.println(random);
	    
	 
	    
	    
	    
	    	
	    
	  
	}

}
