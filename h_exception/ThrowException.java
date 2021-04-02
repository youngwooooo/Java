package h_exception;

import java.io.IOException;

public class ThrowException {
	
	public static void main(String[] args) {
		/*
		 * 예외 발생시키기
		 * - throw new Exception();
		 * - throw 예약어와 예외 클래스의 객체로 예외를 발생시킬 수 있다.
		 * - 예외를 의도적으로 발생시켰기 때문에 예외가 발생한 이유가 없다. ==> 파라미터에 내용을 쓰면 이유가 됨!
		 */
		
		try {
			throw new IOException("예외가 발생한 이유");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 자바에서 많이 볼 수 있는 예외
		
//		throw new NullPointerException();  // null값이 있다.
		
//		String str = null;
//		System.out.println(str.equals("문자열 비교"));
		
		throw new IndexOutOfBoundsException();  // 배열에서 범위 내에 인덱스가 없을 때
		
	}

}
