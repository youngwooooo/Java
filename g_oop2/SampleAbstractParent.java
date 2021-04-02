package g_oop2;

public abstract class SampleAbstractParent {  // 추상 메서드를 하나라도 가지고 있으면 그 클래스는 추상 클래스가 된다.
	
		// 추상 메서드(abstract)
		/* - 객체 생성 불가
		 * - 부모클래스의 역할
		 */
		abstract void abstractMethod();  

}


class SampleAbstractChild extends SampleAbstractParent{  // 컴파일에러를 없애기 위해서는? 해당 클래스를 추상클래스로 만들기 or 위의 추상메서드를 오버라이딩해서 내용을 만들어서 사용

	@Override
	void abstractMethod() {  // 위의 추상메서드 왜 내용을 안만들고 굳이 오버라이딩해서 내용을 만드는가? 각 자식클래스마다 이름은 같지만 내용이 달라질 수 있기 때문에!
		
	}
	 
}