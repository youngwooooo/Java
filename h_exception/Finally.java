package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Finally {

	public static void main(String[] args) {
		/*
		 * finally : 예외가 발생 한 부분에서 꼭 필요한 코드가 있을 때 이를 정상적으로 사용하기 위해 사용
		 * - 필요에 따라 try-catch 뒤에 finally를 추가할 수 있다.
		 * - finally는 예외의 발생여부와 상관없이 가장 마지막에 수행된다.
		 * 
		 * 자동 자원 반환
		 * - try(변수 선언;변수 선언) {} catch(Exception e) {}
		 * - 사용 후 반환이 필요한 객체를 try의 {}안에 선언하면 try 블럭 종료 시 자동으로 반환된다.
		 */
		
		FileInputStream fis = null;  // 파일 읽기
		// 파일을 읽으려면 운영체제의 도움이 필요함, 도움을 받으면 도움받기 위해 받은 것을 반드시 다시 반환을 해야 함!
		try {
			fis = new FileInputStream("d:/file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();  // 반드시 실행되어야 되는 것
			} catch (Exception e) {
				e.printStackTrace();
			} 			
		}
		
		// 자동 자원 반환(JDM 1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){
			String str = "아무내용이나 써보자..";
			byte[] bytes = str.getBytes();
			for(int i=0; i<bytes.length; i++){
				fos.write(bytes[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}














