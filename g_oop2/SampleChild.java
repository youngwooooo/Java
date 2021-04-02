package g_oop2;

public class SampleChild extends SampleParent {

	void childMethod(){
		System.out.println(var);
		System.out.println(method(7, 3));
	}
	
	// 오버라이딩 
	// super(), super
	// 다형성 : 
	
	// 1. 오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것(다른내용으로 바꾼다!)
	@Override // 어노테이션 : 클래스, 변수, 메서드 등에 표시해 놓는 것 / 어떤 역할로 사용되는건지 표시해주는것!
	int method(int a, int b){  // 리턴타입, 메서드명, 파라미터 모두 같아야 한다!!!
		return a * b;
	}
	
	
	// 2. super, supper()
	int var;
	
	void test(double var){
		System.out.println(var);  // 지역변수
		System.out.println(this.var);  // 인스턴스 변수
		System.out.println(super.var);  // 부모클래스의 인스턴스 변수
		// super : 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));  // 위에서 오버라이딩한 메서드
		System.out.println(super.method(10, 20));  // 부모클래스에 있는 메서드
	}
	
	SampleChild(){
		super();  // 부모클래스의 생성자 호출, 무조건 있어야됨!!
		// super()를 통해 부모클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다.
		// super()가 없으면 컴파일러가 자동으로  super()를 넣어준다.
		// 부모클래스 생성자에 파라미터가 있을 때는 컴파일러가 자동으로 super()를 넣어줄 수 없다. 직접호출 할 것!
	}
	
	//  다형성 : 부모타입의 변수를 자식타입의 객체로 사용하는 것
	//         자식타입이 많을 경우가 있기 떄문!
	public static void main(String[] args) {
		
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild();
		// SampleChild2 ==> sp = new SampleChild2
		// SampleChild3 ==> sp = new SampleChild3
		
		sc = (SampleChild)sp;
		sp = (SampleParent)sc;
		// 자식타입 -> 부모타입 형 변환은 생략 가능!
		
		sc = (SampleChild)new SampleParent();  
		// sc 멤버 = 5개, sp 멤버 = 2개  ==> runtime 에러 발생!
		sp = new SampleChild();
		
		
	}
}






