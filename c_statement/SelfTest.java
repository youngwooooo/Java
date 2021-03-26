package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		// 탄수화물 자가진단 테스트 프로그램을 실행시킬 수 있는 코드를 만드세요.
		Scanner s = new Scanner(System.in);
		
		System.out.println("< 탄수화물 자가진단 테스트 > \n==> O,X를 입력해주세요.");
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다.> ");
		String c1 = s.nextLine();
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다.> ");
		String c2 = s.nextLine();
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다.> ");
		String c3 = s.nextLine();
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다.> ");
		String c4 = s.nextLine();
		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다.> ");
		String c5 = s.nextLine();
		System.out.print("스트레스를 받으면 자꾸 먹고싶어진다.> ");
		String c6 = s.nextLine();
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다.> ");
		String c7 = s.nextLine();
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다.> ");
		String c8 = s.nextLine();
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다.> ");
		String c9 = s.nextLine();
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못간다.> ");
		String c10 = s.nextLine();
		
		int O = 0;
		
		if(c1.equals("O")){
			O += 1;
		}
		if(c2.equals("O")){
			O += 1;
		}
		if(c3.equals("O")){
			O += 1;
		}
		if(c4.equals("O")){
			O += 1;
		}
		if(c5.equals("O")){
			O += 1;
		}
		if(c6.equals("O")){
			O += 1;
		}
		if(c7.equals("O")){
			O += 1;
		}
		if(c8.equals("O")){
			O += 1;
		}
		if(c9.equals("O")){
			O += 1;
		}
		if(c10.equals("O")){
			O += 1;
		}
		switch(O){
		case 3:
			System.out.print("결과> 주의! 위험한 수준은 아니지만 관리 필요");
			break;
		case 4: case 5: case 6:
			System.out.print("결과> 위험! 탄수화물 섭취 줄이기 위한 식습관 개선이 필요함");
			break;
		case 7: case 8: case 9: case 10:
			System.out.print("결과> 중독! 전문의 상담이 필요함");
			break;
			
		}
		// 교수님 풀이법
		
		int count = 0;
		
		System.out.print("아침을 배불리 먹은 후 점심시간 전에 배가 고프다.(Y/N) ");
		String answer1 = s.nextLine();
		System.out.print("밥, 빵, 과자 등 음식을 먹기 시작하면 끝이 없다.(Y/N) ");
		String answer2 = s.nextLine();
		System.out.print("음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다.(Y/N) ");
		String answer3 = s.nextLine();
		System.out.print("정말 배고프지 않더라도 먹을 때가 있다.(Y/N) ");
		String answer4 = s.nextLine();
		System.out.print("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다.(Y/N) ");
		String answer5 = s.nextLine();
		System.out.print("스트레스를 받으면 자꾸 먹고싶어진다.(Y/N) ");
		String answer6 = s.nextLine();
		System.out.print("책상이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다.(Y/N) ");
		String answer7 = s.nextLine();
		System.out.print("오후 5시가 되면 피곤함과 배고픔을 느끼고 일이 손에 안 잡힌다.(Y/N) ");
		String answer8 = s.nextLine();
		System.out.print("과자, 초콜릿 등 단 음식은 상상만해도 먹고 싶어진다.(Y/N) ");
		String answer9 = s.nextLine();
		System.out.print("다이어트를 위해 식이조절을 하는데 3일도 못간다.(Y/N) ");
		String answer10 = s.nextLine();
		
		if(answer1.equals("Y")) count++;
		if(answer2.equals("Y")) count++;
		if(answer3.equals("Y")) count++;
		if(answer4.equals("Y")) count++;
		if(answer5.equals("Y")) count++;
		if(answer6.equals("Y")) count++;
		if(answer7.equals("Y")) count++;
		if(answer8.equals("Y")) count++;
		if(answer9.equals("Y")) count++;
		if(answer10.equals("Y")) count++;
		
		
		if(count < 3){
			System.out.println("안전");
		}else if(count == 3){
			System.out.println("주의!");
		}else if(4 <= count && count <=6){
			System.out.println("위험!");
		}else{
			System.out.println("중독");
		}
	}

}
