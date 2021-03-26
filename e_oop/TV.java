package e_oop;

public class TV {
 // TV 전원, 채널, 볼륨
 // 숫자를 입력해서 채널변경 , 채널을 올리는 메소드, 채널을 내리는 메소드, 볼륨업 메소드, 볼륨다운 메소드, 전원ON 메소드, 전원 OFF 메소드
	boolean power;
	int channul;
	int volume;
	
	// 리모콘 기능
	void power(){
		if(power){
			System.out.println("전원이 켜집니다.");
		}else{
			System.out.println("전원이 꺼집니다.");
		}
	}
	
	int channul(int a){
		System.out.println(a + "번 채널로 변경되었습니다.");
		return a;
	}
	
	void channulup(){
		channul++;
		System.out.println("다음채널로 변경되었습니다.");
	}
	
	void chaenuldown(){
		channul--;
		System.out.println("이전채널로 변경되었습니다.");
	}
	
	void volumeup(){
		volume++;
	}
	
	void volumdown(){
		volume--;
	}
	
	public static void main(String[] args) {
		TV tv = new TV();
		
	}
}
