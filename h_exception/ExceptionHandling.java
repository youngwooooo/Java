package h_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		/*
		 * 1. 에러
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 * - 논리적 에러 : 실행은 되지만, 의도와는 다르게 동작하는 것(버그)
		 * - 런타임 에러 : 실행 시에 발생되는 에러
		 * 
		 * 2. 런타임 에러
		 * - 런타임 에러 발생 시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리 불가)
		 * - 예외 : 프로그램 코드에 의해서 수습할 수 있는 다소 미약한 오류(처리 가능)
		 * 
		 * 3. 예외
		 * - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
		 * - [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다.
		 * 
		 * 4. 예외처리(try-catch)
		 * - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 * - try {} catch(Exception e) {}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 * - catch의 ()안에서는 처리할 예외를 지정해 줄 수 있다.
		 * - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 * - 발생한 예외와 일치하는 catch 블럭 안의 내용이 수행된 후 try-catch를 빠져나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 */
		
		try{
			int result = 10 / 0;
			System.out.println(result);
		}catch(ArithmeticException | IndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			
		}catch(Exception e){  // Exception은 예외의 부모클래스이기 떄문에 catch의 파라미터에 넣으면 모든 예외를 처리할 수 있다.
			
		}
		
		/*
		 * CallStack : 메모리에 올라간 메소드를 모아놓는 곳
		 * 
		 * |		   |
		 * |__test2()__|  ==> 데이터가 들어오면 아래부터 차례대로 쌓임
		 * |__test1()__|  ==> 이후 데이터를 꺼낼 때 맨 위부터 꺼내야 내가 원하는 데이터를 꺼낼 수 있다.	
		 * |__main()___|  ==> 원하는 데이터만 뽑을 수 없음!
		 */
		
		
		test1();
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
//		System.out.println(10 / 0);
		try {  // 런타임 에러 발생 시 맨 위부터 눌러가면서 내가 만든 메서드를 찾고 수정하면 됨.
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

















