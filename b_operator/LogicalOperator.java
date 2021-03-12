package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
        /*	
         * 논리연산자
         * - &&(AND), ||(OR), !(NOT)
         * - &&(AND), ||(OR) ==> 비교연산을 연결할 때 사용 / !(NOT) ==> 참과 거짓을 반대로 표현할 때 사용
         * - 피연산자로 boolean만 허용한다.
         * - 양 쪽을 비교할 때 사용. 양 쪽 다 true여야 연산결과가 true다.
         */
		
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y;  // &&와 ||가 같이 있으면 &&가 우선순위가 높다.
		
		b = !(x < y);
		
		// 효율적 연산
		b = true && true;  // true
		b = true && false;  // false
		b = false && true;  // false
		b = false && false;  // false
		
		b = true || true;  // true
		b = true || false;  // true
		b = false || true;  // true
		b = false || false;  // false
		// 왼 쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		
		int a = 10;
		b = a < 5 && 0 < a++;
		System.out.println(a);
		
		// 다음의 문장들을 코드로 작성해주세요.
		// 1. x가 y보다 크고 x가 10보다 작다.
		b = x > y && x < 10;
		
		// 2. x가 짝수이고 y보다 작거나 같다.
	    b = x % 2 == 0 && x <= y;
	    
		// 3. x가 3의 배수이거나 5의 배수이다.
	    b = x % 3 == 0 || x % 5 == 0;
	}

}
