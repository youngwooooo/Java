package b_operator;

import java.util.Scanner;

public class SimpleCalculation {

	public static void main(String[] args) {
		// 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력해주세요 > ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 숫자를 입력해주세요 > ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자를 입력해주세요 > ");
		String str = sc.nextLine();
		
		int resurt = str.equals("+") ? num1 + num2 : str.equals("-") ? num1 - num2 : str.equals("*") ? num1 * num2 : 
			            str.equals("/") ? num1 / num2 : str.equals("%") ? num1 % num2 : 0;
		System.out.print("결과값 > " + resurt);
	}

}
