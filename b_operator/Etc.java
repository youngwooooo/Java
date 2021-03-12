package b_operator;

import java.util.Scanner;

public class Etc {

	public static void main(String[] args) {
        /*
         * 1. 비트연산자
         * - |, &, ^, ~, <<, >>
         * - 비트 단위로 연산한다.
         * 
         * 2. 기타 연산자
         * - .(참조연산자) : 특정 범위 내에 속해있는 멤버를 지정할 때 사용한다.
         * - (type) : 형변화
         * - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 겨우 수행할 문장 ==> 조건식이 ture일 경우 2번째 문장이 출력, 조건식이 false일 경우 3번째 문장 출력
         */
		
		// 1byte : 01010101
		// bit는 0,1 하나하나를 말한다.
		System.out.println(10 | 15);  // | : 둘 다 0인 경우 그 외 1
		// 10 : 00001010
		// 15 : 00001111
		//    : 00001111
		// 0000은 그대로 뒤에는 1010, 1111이므로 1111로 출력 ==> 이런게 있다는 것만 알아두기
		
		// 참조연산자 ex : System(클래스).out(변수).println() ==> System이라는 클래스에 있는 out이라는 변수를 출력한다.
		
		int x = 10;
		int y = 20;
		int result = x < y ? x : y;  // ==> int result = x;
		System.out.println(result);
		
		// 주민등록번호 뒷자리의 첫 번째 숫자가 1이면 남자 2면 여자
		int regNo = 3;
		String gender = regNo == 1 ? "남자" : "여자";
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은 " + gender + " 입니다.");
		
		// 2개의 숫자를 입력받고, 둘 중 더 큰 숫자를 출력해주세요.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("숫자1> ");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("숫자2> ");
//		int num2 = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(num1 < num2 ? num2 : num1);
		
		// 숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요.
		// 그 외의 숫자를 입력하면 확인불가를 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자> ");
		int num = Integer.parseInt(sc.nextLine());
		gender = num == 1 || num == 3 ? "남자" :
			num == 2 || num == 4 ? "여자" : "확인불가";
		System.out.println(gender);
		
		
		
	}

}
