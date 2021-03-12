package a_variable;

import java.util.Scanner;

public class SingUp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String id;
		int password;
		String name;
		int age;
		double stature;
		
		System.out.println("========= 회원가입 ==========");
		System.out.print("아이디를 입력해주세요> ");
		id = sc.nextLine();
		
		System.out.print("비밀번호를 입력해주세요> ");
		password = Integer.parseInt(sc.nextLine());
		
		System.out.print("이름을 입력해주세요> ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력해주세요> ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("키를 입력해주세요> ");
		stature = Double.parseDouble(sc.nextLine());
		
		System.out.println("======= 회원가입 완료!!=======");
		System.out.println("========== 내 정보 ==========");
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + stature);
		System.out.println("==========================");		
	}

}
