package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		/*
		 * 123
		 * 135 : 1S(1 = 자리수가 같은 경우) 1B(3 = 자리수가 다른 경우) 1O(5 = 값에 포함이 안되는 경우)
		 * 
		 * 
		 * 
		 * 768 : 1S 0B 2O
		 * 743 : 0S 1B 2O
		 * 543 : 0S 1B 2O
		 * 924 : 1S 1B 1O
		 * 461 : 1S 0B 2O
		 * 963 : 0S 0B 3O
		 * 524 : 1S 1B 1O
		 * 254 : 0S 2B 1O
		 * 219 : 0S 1B 2O
		 * 164 : 0S 1B 2O
		 * 428 : 3S
		 */
		
		// 1~9범위의 숫자 야구 게임을 만들어라	
//		int ran1 = (int)(Math.random() * 9 + 1);
//		int ran2 = (int)(Math.random() * 9 + 1);
//		while(ran1 == ran2){
//			ran2 = (int)(Math.random() * 9 + 1);
//		}
//		int ran3 = (int)(Math.random() * 9 + 1);
//		while(ran1 == ran3 && ran2 == ran3){
//			ran3 = (int)(Math.random() * 9 + 1);
//		}
//		// 랜덤한 3개의 숫자가 중복되지 않게
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = 0;
//		int num2 = 0;
//		int num3 = 0;
//		
//		int strike = 0;
//		int ball = 0;
//		int out = 0;
//		
//		String result = ran1 + "" + ran2 + "" + ran3;  // 정답
//		
//		while(strike != 3){
//			System.out.println("정답> " + result);
//			System.out.println("숫자 세 개를 입력하세요> ");
//		    
//		    num1 = sc.nextInt();
//		    num2 = sc.nextInt();
//		    num3 = sc.nextInt();  // 입력한 숫자를 출력받기 위함
//			
//			if(ran1 == num1){
//				strike += 1;
//			}else if(ran1 == num2 || ran1 == num3){
//				ball += 1;
//			}else{
//				out += 1;
//			}
//			
//			if(ran2 == num2){
//				strike += 1;
//			}else if(ran2 == num1 || ran2 == num3){
//				ball += 1;
//			}else{
//				out += 1;
//			}
//			
//			if(ran3 == num3){
//				strike += 1;
//			}else if(ran3 == num1 || ran3 == num2){
//				ball += 1;
//			}else{
//				out += 1;
//			}
//			System.out.println("스트라이크: " + strike + "S " + "볼: " + ball + "B " + "아웃: " + out + "O"); // 0S 0B 0O
//		}
		// 선생님 풀이
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		
		do{
			a1 = (int)(Math.random() * 9) + 1;
			a2 = (int)(Math.random() * 9) + 1;
			a3 = (int)(Math.random() * 9) + 1;
		}while(a1 == a2 || a1 == a3 || a2 == a3);
		
		Scanner s = new Scanner(System.in);
		int count = 0;
		while(true){
			System.out.println("3자리 숫자> ");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input % 10;
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a1 == i1) strike++;
			if(a2 == i2) strike++;
			if(a3 == i3) strike++;
			
			if(a1 == i2 || a1 == i3) ball++;
			if(a2 == i1 || a2 == i3) ball++;
			if(a3 == i1 || a3 == i2) ball++;
			
			out = 3 - strike - ball;
			
			System.out.println(++count + "차 시도(" + i1 + i2 +i3 + ") : "
					+ strike + "S " + ball + "B " + out + "O");
			System.out.println("------------------------------------");
			if(strike == 3){
				System.out.println("정답입니다!!");
				break;
			}
		}
		

		
	}
}
