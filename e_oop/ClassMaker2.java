package e_oop;

public class ClassMaker2 {
	
	// 인스턴스 변수 하나를 선언하고 명시적으로 초기화 해주세요.
	int i = 10;
	
	// 위에서 선언한 인스턴스 변수를 초기화 블럭을 사용해 초기화 해주세요
	{
		i = 20;
	}

	// 위에서 선언한 인스턴스 변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int i){
		this.i = 30;
	}
	
	// 위에서 선언한 인스턴스 변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2(){
		this(40);
	}
	
	// 초기화 순서 : 명시적 초기화 -> 초기화 블럭 -> 생성자
}
