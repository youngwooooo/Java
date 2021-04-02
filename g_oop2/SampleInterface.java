package g_oop2;

public interface SampleInterface {
	
		// interface
	    // 상수, 추상메서드로 구성됨.
	   
		// 인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야한다.
		public static final int NUM1 = 10;
		
		// 모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
		int NUM2 = 20;
		
		// 인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
		public abstract void method1();
		
		// 모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
		void method2();
	     

}

class SampleImplment implements SampleInterface, SampleInterface2 {   // 인터페이스 상속 예약어 = implements(구현하다)
												  // 다중상속
	
	// 인터페이스의 특징 : 다중 상속이 가능하다.(부모가 여럿이여도 된다.)
	// 인터페이스 사용 이유 : 추상메서드의 역할 + 여러 곳에서 사용이 됨.
	
	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {
		
	}
										
}



interface SampleInterface2{
	void method1();  // 이름이 SampleInterface에 있는 메소드와 같기 때문에 1번만 오버라이딩이 된다.
	void method3();
}




