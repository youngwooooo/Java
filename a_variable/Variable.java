//주석 : 프로그램 코드를 인식하지 않는 문장(주로 코드를 설명하는데 사용)
//한줄주석 : ctrl + shift + c
/* 범위주석 : ctrl + shift + / (해제 : \) */

/* 
 * 1. 데이터의 종류
 * - 정수 : 10, -5
 * - 실수 : 3.14, -1.5
 * - 문자 : 'a', '3' => 따옴표로 묶여있음!
 * - 논리 : true, false
 *  
 * 2. 프로그래밍에서는 데이터를 사용하기 위해 종류별로 이름을 붙여놓았다.(자료형/Data type)
 * 1) 기본형 타입
 * - 정수 : byte(1), short(2), *int(4), long(8)
 * - 실수 : float(4), *double(8) => 범위가 너무 커서 근사치 값을 측정함, double이 더 정확한 편!
 * - 문자: char(2)
 * - 논리 : boolean(1)
 */

//변수 : 데이터를 저장하는 공간
// 변수 선언 : 변수를 만드는 것
// 데이터 타입 + 변수이름 : 변수를 만드는 방법

package a_variable; // 해당 클래스의 위치 표시

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 호출

public class Variable { // 클래스
// java는 클래스 내용으로 구성
// class + 이름 
// {}(블럭) : 클래스의 내용
// class = 메서드 + 변수
	
	public static void main(String[] args) { 
// 메서드 : 명령문의 집합     *소괄호가 있으면 무조건 메서드!
// 해당 메서드 이름 : main
// main 메서드 : 프로그램의 시작과 끝
        int name;
        
        double pi;
        
//        long name; // 한 {}(블럭)안에서 변수의 이름은 중복될 수 없다.
        // = (대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장
        
        name = 10; // 10이라는 값을 name(변수)에 저장하겠다.
                   // 초기화 : 변수에 처음으로 값을 저장하는 것
        pi = 3.14; // 변수의 타입에 맞는 값을 저장해야한다. 정수 = 정수, 실수 = 실수
        
        int abc = 30; // 보통 선언과 초기화를 동시에 한다.
        long l = 40L; // 접미사 L을 붙여야 long타입이 됨!, l이 1과 비슷하며 대문자로 써준다.
        float f = 5.5f; // 접미사 f를 붙어야 float타입이 됨!
        char c = '한'; // 따옴표안에 한글자만 넣어야 함!
        boolean b = true; // true or false만 가능!
        
// 문제 1-1 
        // 8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화하기
        byte t = 1;
        short s = 2;
        int y = 20;
        long o = 200L;
        double u = 2.22;
        float n = 2.2f;
        char g = '영';
        boolean w = false;
        
        System.out.println(name);
        // 실행 : ctrl + f11     *저장 후 실행!
        
        name = 100; // name에 저장된 값을 100으로 변경
        System.out.println(name);
        
// 문제 1-2  
        // 위에서 만든 8개의 변수에 새로운 값을 저장하고 출력하기
        t = 10;
        s = 20;
        y = 200;
        o = 2000L;
        u = 2.222;
        n = 2.22f;
        g = '우';
        w = false;
        
        System.out.println(w);
        
 /*       
  * 3. 타입 선택의 기준
  * 1) 정수
  * - byte, short : 메모리를 절약해야 할 때
  * - int : 기본
  * - long : int의 범위를 벗어날 때
  * 
  * 2) 실수
  * - float : 메모리를 절약해야 할 때
  * - double : 기본 
  */
        
        // 문자열 => 참조형 타입: 실제 값을 밖에 따로 저장       *변수에는 밖에 있는 실제 값의 주소를 넣어줌!
        String str = "문자 여러개.."; // String는 하나의 클래스
        System.out.println(str);
        
        // 형 변환: 데이터의 타입을 다른 타입으로 바꾸는 것
        // 다른 타입의 값을 저장하기 위해서는 값의 타입을 변경해 주어야 하는데 이를 형변환(type casting)이라 한다.
        int small = 10;
        long big = 10L;
        
        small = (int)big; // long big값을 int big값으로 바꾸어서 small 변수에 저장하기
        big = small; // 표현범위가 작은 쪽에서 큰 쪽으로의 형 변환은 생략이 가능하다!
        	// 형 변환은 bit 크기를 따지는 것이 아님!
        
/*        
 * 4. 명령규칙
 * - 영문자 대소문자, 한글(사용가능하지만 잘 사용하지 않는다.), 숫자, 특수문자('_', '$')를 사용할 수 있다.
 * - 숫자로 시작할 수는 없다.
 * - 예약어는 사용할 수 없다.     *예약어: 자바에서 어떤 의미로 사용하겠다고 정해져 있는 단어(진한 글씨, ex: public, class, int, long 등등)
 * - [낙타식 표기법을 사용한다.(mySampleVarialbe)] => 카멜 표기법
 * - [클래스명의 첫글자는 반드시! 대문자로 한다.(MySampleClass)]           ==> []내용들은 개발자들끼리의 약속같은 것!
 */
        
/*        
 * 5. 상수
 * - 처음 담긴 값을 변경할 수 없는 그릇
 * - 리터럴에 의미를 부여하기 위해서 사용한다.  *리터럴: 변하지 않는 값, 이름을 대문자로 적어준다!
 */
        
        final int MAX_NUMBER; // final: 뒤에 있는 값을 변경할 수 없게 해주는 예약어
        MAX_NUMBER = 10;
//      MAX_NUMBER = 100; // 값을 변경하려고 하면 컴파일 에러 발생!
        
        // 출력방법 종류
        System.out.print("줄바꿈을 하지 않는다.");
        System.out.print("줄바꿈을 하지 않는다.\n"); // \n : 줄 바꿈
        System.out.println("줄바꿈을\t하지 않는다."); // \t : 들여쓰기, 띄어쓰기(tap 기능)
        System.out.printf("문자열: %s, 숫자: %d", "Hello", 10);  // printf: 출력 포맷을 따로 지정
                                                              // %@: %@를 뒤에 있는 값의 형식으로 출력
                                                              // %s : 문자열, %d : 정수
        System.out.println();
        System.out.println("A" + 100); // 문자열은 다른 타입의 값과 합칠 수 있다. 다른 타입의 값은 무조건 문자열로 바뀐다!
        System.out.println(10 + 20 + "30");  // 연산은 왼쪽부터 시작함.
        System.out.println("10"+ 20 + 30);   // 문자열부터 시작을 하면 값이 모두 문자열로 됨!
        
        // 6. 입력
        Scanner sc = new Scanner(System.in); // 입력받기 위한 클래스
                                             // Scanner라는 클래스를 찾을 수가 없음. 클래스를 찾아야지만 컴파일 오류 해결!
                                             // 한 패키지 안에 사용하고자 하는 클래스가 포함되어있어야 사용 가능! => import로 해결 가능!
                                             // import 패키지.클래스이름;으로 사용할 수 있게 가능! => import 단축키로 자동으로 찾을 수 있음!
                                             // import 단축기 : ctrl + shift + o => import 자동진행
                                            
//        System.out.print("숫자를 입력해주세요>");
//        int num =sc.nextInt();
        
//        System.out.print("아무거나 입력하세요>");
//       String str2 = sc.nextLine(); // nextLine : 문자열을 입력받게 해주는 메서드
                                     // 문자열이기 때문에 String에 저장가능!
//        System.out.println("입력받은 내용 : " + str2); // 사용자가 입력을 할 때까지 실행을 멈춤
        
//        int nextInt = sc.nextInt();
//        double nextDouble = sc.nextDouble();
        // 버그가 있어서 숫자열은 사용하지 않는 것을 권장함.
        // 숫자열을 이후 문자열을 받으면 출력이 되지 않음. 반대로도 가능. 오류발생!
        
//        System.out.println("int 입력>");
//        int number = sc.nextLine();
//        // 기본형과 참조형 사이의 일반적인 형 변환은 불가능!
//        int number = Integer.parseInt(sc.nextLine()); // integer.parseInt를 사용하여 문자열을 int로 형 변환!
//        System.out.println(number);
//        
//        System.out.println("double 입력>"); 
//        double number2 = Double.parseDouble(sc.nextLine()); // double.parseDouble을 사용하여 문자열을 double로 형 변환!
//        System.out.println(number2);

// 문제 2-1 
         // 자신의 이름을 저장할 변수를 선언해주세요.
         String myName;
         
         // 위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
         
         System.out.println("이름을 입력해주세요>");
         myName = sc.nextLine();
         
// 문제 2-2 
         // 자신의 나이를 저장할 변수를 선언해주세요.
         int myAge;
         
         // 위에서 선언한 변수를 초기화 하기 위해 나이를 입력받아주세요.
         System.out.println("나이를 입력해주세요>");
         myAge = Integer.parseInt(sc.nextLine());
         
         System.out.println("이름 : " + myName + " / 나이 : " + myAge);
         
// 과제
         // 다음과 같은 프로그램을 작성해 주세요.

/* ============ 회원가입 =============
* 아이디>admin
* 비밀번호(4자리숫자)>1234
* 이름>홍길동
* 나이>30
* 키>185.5
* ================================
* 회원가입 완료!!
* ================================
* ============= 내정보 =============
* 아이디 : admin
* 비밀번호 : 1234
* 이름 : 홍길동
* 나이: 30세
* 키 : 185.5cm
*=================================
*/

	}

}
