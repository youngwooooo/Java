package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식(ex) 회원가입)  ==> 띄어쓰기를 마음대로 하면 안됨!
		 * 
		 * ^(패럿) : 뒷문자로 시작
		 * $ : 앞 문자로 종료 
		 * . : 임의의 문자(줄바꿈 제외)
		 * * : 앞 문자가 0개 이상
		 * + : 앞 문자가 1개 이상
		 * ? : 앞 문자가 없거나 1개
		 * [] : 문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌 것)
		 * {} : 앞 문자의 개수({2} : 2개, {2,4} : 2개 이상 4개 이하)  * {,}에 띄어쓰기가 있으면 안됨!
		 * () : 그룹화(1개의 문자처럼 인식)
		 * | : OR 연산
		 * \s : 공백, 탭, 줄바꿈
		 * \S : 공백, 탭, 줄바꿈이 아닌 문자
		 * \w : 알파벳이나 숫자
		 * \W : 알파벳이나 숫자가 아닌 문자(한글, 특수문자, 공백)
		 * \d : 숫자
		 * \D : 숫자가 아닌 문자
		 * (?i) : 뒷 문자의 대소문자 구분 안됨
		 * \ : 정규표현식에서 사용되는 특수문자 표현
		 * 
		 */
		
		String str = "abc123";
//		String regex = "abc123";  // 정규표현식을 만들 때도 String을 사용
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";  // \\ : 역슬러시 앞에 역슬러시를 넣어서 역슬러시의 용도를 바꿈.
		String regex = ".*";  // 줄바꿈만 없으면 모든 문자열을 통과시킴
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());  // 정규표현식과 문자열이 같으면 true
		
		
		/*
		 * 아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		 */
		
		String id = "dlddudn02";
		String pnum = "010-2278-0985";
		String email = "dlddudn02@naver.com";
		
		String regexid = "[a-z0-9]{5,20}\\W?";
		String regexpnum = "01[0-9]{1}-[0-9]{4}-[0-9]{4}";
		String regexemail = "[a-z0-9]{5,20}\\W?@naver.com";
		
		Pattern p = Pattern.compile(regexemail);
		Matcher m = p.matcher(email);
		System.out.println(m.matches());
	}

}
