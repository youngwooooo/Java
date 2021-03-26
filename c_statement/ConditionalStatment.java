package c_statement;

import java.util.Scanner;

public class ConditionalStatment {

	public static void main(String[] args) {
        /*		
         * 조건문
         * - if문
         * - switch문
         * 
         * 1. if문
         * - if(조건식){} : 조건식(boolean)의 결과가 true이면 블럭 안의 문장을 수행한다.  ==> (조건식)이 True일 경우 {}안의 문장 실행
         * - else if(조건식){} : 다수의 조건이 필요할 때 if뒤에 추가한다.  ==> (조건식)이 True일 경우 {}안의 문장 실행
         * - else{} : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.  ==> 위의 (조건식)이 모두 False일 때 사용
         */
		
		int a = 1;
		if(a == 1){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 0){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		if(a == 1){
			System.out.println("a가 1인 경우에 하고싶은 것");  // 첫 번째 조건이 false이면 그 다음 나오는 조건들을 순차적으로 실행함.
		}else if(a == 2){                               // if문은 하나의 조건만 실행이 된다!
			System.out.println("a가 2인 경우에 하고싶은 것");  
		}else if(a == 3){
			System.out.println("a가 3인 경우에 하고싶은 것");
		}else{
			System.out.println("이 외의 경우에 하고싶은 것");
		}
		
		if(a < 10){
			System.out.println("a가 10보다 작다.");  // 모든 조건이 true일 경우 맨 위에서 true가 나오면 그 조건만 실행이 됨.
		}else if(a < 20){                        // if문 + if문은 연결되는게 아니고 각각 하나씩 실행 됨. 꼭 else if를 사용할 것!
			System.out.println("a가 20보다 작다");
		}
		
		int score = 59;
		// 점수가 60점 이상이면 합격 그렇지 않으면 불합격이라고 출력해주세요.
		if(score >= 60){
			System.out.println("합격");
		}else{
			System.out.println("불합격");
		}
	    // 점수에 등급을 부여하는 프로그램
		score = 40;
		String grade = null;  // null ==> 값이 없다. 즉, Sring의 기본값
		/*
		 * 기본값 : 직접 초기화 하지 않았을 때 초기화 되는 값
		 * - 참조형 타입 : null
		 * - boolean : false
		 * - char : ' '(0)
		 * - 나머지 타입 : 0
		 */
		
		if(score >= 90){
			grade = "A";
		}else if(score >= 80){
			grade = "B";
		}else if(score >= 70){
			grade = "C";
		}else if(score >= 60){
			grade = "D";
		}else if(score >= 50){
			grade = "E";
		}else{
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		
		score = 97;
		grade = null;
		// 정렬 : Ctrl + Shift + f (정렬할 부분만 정해서 할 것!)
		if (score >= 90) {
			grade = "A";   // if문 문장 작성할 때 tap으로 들여쓰기해서 할 것!

			if (score >= 97) {
				grade += "+";
			} else if (score >= 93) {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";

			if (score >= 87) {
				grade += "+";
			} else if (score >= 83) {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";

			if (score >= 77) {
				grade += "+";
			} else if (score >= 73) {
				grade += "-";
			}
		} else if (score >= 60) {
			grade = "D";

			if (score >= 67) {
				grade += "+";
			} else if (score >= 63) {
				grade += "-";
			}
		} else if (score >= 50) {
			grade = "E";

			if (score >= 57) {
				grade += "+";
			} else if (score >= 53) {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println(score + "점이 해당하는 등급은 " + grade + " 입니다.");
		
        /*		
         * 2.switch문
         * - switch(int/String){ case 1: break;}
         * - 조건식의 결과는 정수와 문자열만(JDK 1.7부터 문자열 허용) 허용한다.
         * - 조건식과 일치하는 CASE문 이후의 문장을 수행한다.
         * - 사용이 제한적임. 웬만하면 if문을 사용함. switch문으로 표현할 수 있는 것은 if문으로 표현가능!
         * - 장점: 똑같은 표현일 경우에 if문 보다 빠르게 실행됨.
         */

		a =  10; // int
		switch(a) {
		case 10:
			System.out.println("a가 10인 경우에 하고싶은 것");
			break;
		case 20:
			System.out.println("a가 20인 경우에 하고 싶은 것");
			break;
		default:  // == else
			System.out.println("이 외의 경우에 하고싶은 것");
		}
		
		String b = "a";
		switch(b){
		case "a":
			System.out.println("b가 \"a\"인 경우에 하고싶은 것");
			break;
		case "b":
			System.out.println("b가 \"b\"인 경우에 하고싶은 것");
			break;
		default:
			System.out.println("이 외의 경우에 하고싶은 것");
		}
		
		// 월에 해당하는 계절을 출력
		int month = 10;
		String season = null;
		
		switch(month) {
		case 3: case 4: case 5:  // 여라가지 조건이 필요한 경우 case를 여러 개 사용 가능.
			season ="봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은 " + season + "입니다.");
		
		score = 40;
		grade = null;
		switch(score / 10) {
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default:
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		// 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요> ");
		int num = Integer.parseInt(sc.nextLine());
		
		if(num == 0){
			System.out.println("0 입니다.");
		}else{
			System.out.println("0이 아닙니다.");
		}
		
		// 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		System.out.println("숫자를 입력하세요> ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		if(num2 % 2 == 1) {
			System.out.println("홀수입니다.");
		}else{
			System.out.println("짝수입니다.");
		}
		
		
		// 정수 3개를 입력받아 총점, 평균, 등급을 출력해주세요
		System.out.println("국어> ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어> ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학> ");
		int math = Integer.parseInt(sc.nextLine());
		
		int sum = kor + eng + math;
		double avg = Math.round(sum / 3.0 * 100) / 100.0;
		
		grade = null;
		if (avg >= 90) {
			grade = "A";

			if (avg >= 97) {
				grade += "+";
			} else if (avg >= 93) {
				grade += "-";
		} else if (score >= 80) {
				grade = "B";

				if (score >= 87) {
					grade += "+";
				} else if (score >= 83) {
					grade += "-";
				}
		} else if (score >= 70) {
				grade = "C";

				if (score >= 77) {
					grade += "+";
				} else if (score >= 73) {
					grade += "-";
				}
		} else if (score >= 60) {
				grade = "D";

				if (score >= 67) {
					grade += "+";
				} else if (score >= 63) {
					grade += "-";
				}
		} else if (score >= 50) {
				grade = "E";

				if (score >= 57) {
					grade += "+";
				} else if (score >= 53) {
					grade += "-";
				}
		} else {
				grade = "F";
			}
		System.out.println("총점:" + sum + " 평균:" + avg + " 등급:" + grade);
		
		// 1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		int x = (int)(Math.random() *100) +1; 
		int y = (int)(Math.random() *100) +1;
		int z = (int)(Math.random() *100) +1; 
		
		if(x > y){  
			int t = x; 
			x = y; 
			y = t; 
		}
		if(x > z){
			int t = x;
			x = z;
			z = t;
		}
		if(y > z){
			int t = y;
			y = z;
			z = t;
		}
		System.out.println(x + " < " + y + " < " + z);
	}	 	 	
 }
}