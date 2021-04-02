package g_oop2.test;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier{
	
	public static void main(String[] args) {
	AccessModifier am = new AccessModifier();
			
			System.out.println(am.publicVar);
			am.publicMethod();
			
//			System.out.println(am.protectedVar);
//			am.protectedMethod();

			
//			System.out.println(am.defaultVar);
//			am.defaultMethod();
			
//			System.out.println(am.privateVar);
//			am.privateMethod();
			
			AccessTest at = new AccessTest();  // 상속을 받았으면 내꺼처럼 사용을 해야함. 상속받은 클래스에 맞는 객체 생성
			
			System.out.println(at.protectedVar);
			at.protectedMethod();
	}

}
