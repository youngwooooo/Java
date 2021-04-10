package i_api;

import java.util.Arrays;

public class StringClass {
	
	public static void main(String[] args) {
		
		/*
		 * String
		 * - 여러 개의 문자를 사용하기 쉽게 만들어 놓은 클래스
		 * 
		 * String의 주요 메서드
		 * - equals() : 문자열의 내용이 같은지 여부를 반환한다. (boolean)
		 * - length() : 문자열의 길이를 반환한다.
		 * - charAt() : 특정 인덱스에 위치한 문자를 반환한다. (char)
		 * - substring() : 문자열의 특정 부분을 잘라서 반환한다. (String)
		 * - indexOF() : 문자열 내의 특정 문자의 인덱스를 반환한다. (몇 번째 위치) (int)
		 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 여부를 반환한다. (boolean)
		 * - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다. (String[])
		 * - trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 * - valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.
		 * 
		 */
		
		boolean equals = "문자열".equals("문자열");  // 앞의 문자열과 파라미터의 문자열이 같은지 다른지 판단
		System.out.println(equals);
		
		// equals 주의사항
		// null이 올 수 있는 변수는 출력 시 앞에 두지 않기!
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2));  // false 
//		System.out.println(str2.equals(str1));  // 런타임 에러
		
		// charAt
		String str = "12345";
		for(int i=0; i<str.length(); i++){
			char charAt = str.charAt(i);  // 반환해주는 값은 '문자'
			System.out.println(charAt);
		}
		
		// 12345 반대로 값을 담아 출력하기
		String rev = "";
		for(int i=str.length()-1; i>=0; i--){
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		// substring
		str = "0123456789";
		String sub1 = str.substring(3);  // 3번 인덱스'부터' 잘라서 반환한다.
		System.out.println(sub1);
		String sub2 = str.substring(5, 8);  // 5번 인덱스부터 8번 인덱스 '전'까지 잘라서 반환한다.
		System.out.println(sub2);
		
		// indexOf
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지");
		System.out.println(index);
		
		String[] menu = {"수박 20000원",
						 "오렌지 100000원",
						 "귤 500원",
						 "블루베리 3000원"};
		// substring을 사용하여 '과일이름'만 가져오기
		// indexOf를 활용해 '과일 이름 뒤에 공백이 있다'라는 규칙을 찾아 사용
		for(int i=0; i<menu.length; i++){
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.println(name);
		}
		
		// 가격만 잘라서 int타입 변수에 저장하기.
		for(int i=0; i<menu.length; i++){
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1, menu[i].indexOf("원")));
																		// 공백 다음이기 때문에 +1을 해준다
			System.out.println(price);
		}
		
		// contains
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		for(int i=0; i<menu.length; i++){
			if(menu[i].contains("오렌지")){
				System.out.println("오렌지는" + i + "번 인덱스에 있습니다.");
			}
		}
		
		// split
		str = "a/b/c";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));
		
		for(int i=0; i<menu.length; i++){
			String[] split2 = menu[i].split(" ");
			System.out.println("메뉴명 : " + split2[0] + " / 가격 : " + split2[1]);
		}
		
		// trim
		// 중간에 있는 공백은 없애주지 않음!
		str = " 문 자 열 ";
		String trim = str.trim();
		System.out.println("[" + str + "] -> [" + trim + "]");
		
		// trim의 예시
		// 사용자의 실수를 막아줌.
		String id = " myid";
		String password = "mypassword ";
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim());
		System.out.println(password.trim());
		
		// valueOf
		// 숫자 -> 문자 형변환
		int number = 10;
		str = String.valueOf(number);  // 형변환 정석
		str = number + "";  // 이렇게 사용할 수도 있으나 편법이라는 인식이 있음.
	}
	
}











