package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-while문
		 * 
		 * 1. for문
		 * - for(초기화; 조건식; 증감식){}
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복하는 문장
		 * - 규칙이 있을 때 반복문으로 표현
		 * - 보통 증가시키는 경우에 사용, 감소할 때도 있음!
		 */

		for(int i = 1; i <=10; i++){
			// 초기화 : 조건식과 증감식에 사용할 변수 초기화
			// 조건식 : 연산결과가 ture이면 블럭 안의 내용을 수행한다.
			// 증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
			System.out.println(i + "번째 반복");
		}
		
		int sum = 0; // 1부터 10까지의 합계를 저장
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		sum = 0;
		for(int i = 1; i <= 10; i++){  // 시작하는 값은 선언한 첫번째 값, 조건문은 마지막 값
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int i = 10; i >= 1; i--){
			sum += i;
		}
		System.out.println(sum);
		
		// 1부터 100까지 짝수의 합을 출력해주세요
		sum = 0;
		
		for(int i = 2; i <= 100; i += 2){
			sum += i;
	 // for(int i = 2; i <= 100; i++){
     //	   if(i % 2 == 0){
     //     sum += i;
    //		}
		}
		System.out.println(sum);
		
		// 1부터 100까지 홀수의 합을 출력해주세요
		sum = 0;
		
		for(int i = 1; i <= 100; i += 2){
			sum += i;
		}
		System.out.println(sum);
		
		// 구구단 출력
		/*
		 * 2 * 1 = 2  // 첫 번째 수는 2로 고정, 두 번째수는 1씩 증가, 세 번째 수는 2씩 증가
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * .....	
		 */
		
		for(int i = 1; i <= 9; i++){  // 구구단 2단의 두번 째 숫자를 조건으로 만듬
			System.out.println(2 + " * " + i + " = " + i * 2);
		}
		
		// 구구단 6단 만들기
		for(int i = 1; i <= 9; i++){
			System.out.println(6 + " * " + i + " = " + i * 6);
		}
		
		// 구구단 전체를 출력해주세요.
		for(int j = 2; j <= 9; j++){
			for(int i = 1; i <= 9; i++){
				System.out.println(j + " * " + i + " = " + j * i);
		  }
		}
		
		// 구구단 전체를 가로로 출력해주세요.	
		// 안 쪽 for문이 실행되면 바깥 for문이 실행됨. 반복적
		for(int i = 1; i <=9; i++){
			for(int j = 2; j <=9; j++){
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println();
		}
		/*
		 * 2. while문
		 * - while(조건식){}
		 * - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
		 * - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
		 */
		
		int a = 1;
		// a에 2씩 몇 번을 곱해야 1000이상이 될까?
		int count = 0; // 반복횟수를 세기 위해 만든 변수
		while(a < 1000){
			a *= 2;
			count++;
			System.out.println(count + " : " + a);
		}
		
		/*
		 * 3. do-while문
		 * - do{}while(조건식);  // 블럭의 내용 실행 후 조건식 검사
		 * - 최소한 한 번의 수행을 보장한다.
		 * - 사용자가 그만하고 싶을 때 까지 사용자에게 입력을 받는다. 즉, 어떠한 결과가 나올 때까지 입력을 받는다.
		 */
		
		// 숫자 맞추기 게임(Up&Down)
//		int answer = (int)(Math.random() * 100) + 1;
//		int input = 0;
//		Scanner s = new Scanner(System.in);
//		do{
//			System.out.println("1 ~ 100 사이의 수를 입력해주세요 > ");
//			input = Integer.parseInt(s.nextLine());
//			
//			if(answer < input){
//				System.out.println(input + " 보다 작습니다.");
//			}else if(input < answer){
//				System.out.println(input + " 보다 큽니다.");
//			}else{
//				System.out.println("정답입니다.");
//			}
//		}while(input != answer);
//		
		// 이름붙은 반복문
		outer : for(int i = 2; i <= 9; i++){
			for(int j= 1; j <= 9; j++){
				if(j == 5){
//					 break; // : 가장 작은 반복문 하나를 빠져나간다. // 5가 될 때 break에 걸려 빠져나온다 ==> 즉 구구단 전체(9단)가  i * 4까지만 출력이 반복됨
//					 break outer; // : outer라는 이름의 반복문을 빠져나간다. // 첫 번째 구구단(2단)이 i*4까지 하고 반복문이 끝남.
					 continue; // : 가장 가까운 반복문의 현재 반복회차를 빠져나간다. // 5만 빼고 첫 번째 구구단(2단)을 돌리겠다. 즉, i*5만 빠짐.
//					 continue outer; // : outer라는 이름의 현재 반복회차를 빠져나간다. // 5말고 4까지만 구구단 전체(9단)를 돌리겠다. 즉, i*5부터 빠짐.
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
					
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println();
		
		
		for(int j = 1; j <=3; j++){
			for(int i = 1; i <= 5; i++){
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 삼각형 별 만들기
		for(int j = 1; j <= 5; j++){  
			for(int i = 1; i <= j; i++){  
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		
		for(int j = 1; j <= 5 ; j++){
			for(int i = 5; i >= j; i--){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <= 5; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			System.out.println("*");
		}
		System.out.println();
		
		
		
			
	}	
		

}

