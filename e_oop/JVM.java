package e_oop;

public class JVM {

	public static void main(String[] args) {

		/*
		 * Java Virtual Machine
		 * - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 * - 운영체제 -> JVM -> 자바 프로그램
		 * - 장점 : 운영체제에 상관없이 실행할 수 있다.
		 * - 단점 : 속도가 느리다.
		 * 
		 * JVM 메모리 구조
		 * - Method Area(메소드 영역) : 클래스 멤버가 저장된다.
		 * - Heap : 객체가 저장된다.
		 * - Call Stack(호출 스택) : 현재 호출되어 있는 메소드가 저장된다.
		 */

//		System.out.println(instanceVar);  ==> 객체 생성 안했기 때문에 사용 불가!
		
		// 프로그램 실행 시 static이 붙은 main(), classVar, classMethod()가 올라가서 Method Area에 저장됨.
		// main()이 호출되어 CallStack에 저장됨.
		
		System.out.println(classVar);
		// System클래스의 out이 MethodAread에 저장됨.
		// println()이 호출되어 CallStack에 저장됨.
		// println()이 classVar를 출력 후 CallStack에서 삭제됨.
		
		classMethod();
		// classMethod가 호출되어 CallStack에 저장되고 메소드의 내용을 수행 후 삭제됨.
		
		JVM jvm = new JVM();
		// JVM객체가 Heap에 저장됨.
		// jvm 변수가 CallStack에 생성되고, JVM의 주소가 저장됨.
		
		System.out.println(jvm.instanceVar);
		// * System클래스의 out이 위에서 MethodAread에 저장되었기 때문에 다시 저장하지 않음!
		// println()이 호출되어 CallStack에 저장됨.
		// println()이 InstanceVar를 출력 후 CallStack에서 삭제됨.
		
		jvm.instanceMethod();
		// instanceMethod가 호출되어 CallStack에 저장되고 메소드의 내용을 수행 후 삭제됨
		
		jvm = null;
		// jvm변수에 null이 저장됨. ==> JVM의 주소를 알 수 없게 됨.
		// 어디에서도 주소를 참조하지 않는 JVM객체는 GarbageCollector에 의해 삭제됨.
		
		// main()의 실행이 종료되어 CallStack에서 삭제됨.
		// 프로그램이 종료되고 MethodAread의 데이터가 삭제됨.
	}
	
	int instanceVar;
	static int classVar;
	
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}

	static void classMethod(){
//		System.out.println(instanceVar;);  // static이 붙은 메소드에서 static이 붙지 않은 변수를 사용하려면 무조건 객체 생성을 해야한다!
		System.out.println(classVar);
	}
}


// static이 붙은 변수, 메소드(클래스 멤버)는 이미 메모리 상에 올라가 있는 상태.
// static이 붙지 않은 변수, 메소드(인스턴스 멤버)는 객체 생성을 해주어야 메모리에 올라갈 수 있기 때문에
// main()에서 객체 생성을 해줘야한다!





























