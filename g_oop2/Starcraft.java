package g_oop2;

public class Starcraft {

	public static void main(String[] args) {
			
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		SCV scv = new SCV();
		
//		scv.repair(m);
		scv.repair(t);
		scv.repair(d);
	}

}

class Unit{
	int hp; // 현재 체력
	final int MAX_HP; // 최대 체력
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{  // 인터페이스로 Tank와 Dropship을 묶어 사용할 수 있게됨.
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

class SCV extends Unit{
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){  // 수리하기 위해 파라미터를 받아야 함. 부모(Unit)을 파라미터로 쓰면 마린(수리불가)까지 딸려와서 인터페이스를 생성해서 상속받아야한다.
		// Repairable r은 interface Repairable 안에 아무것도 내용이 없기 때문에 Repairable r 자체를 사용할 수 없기 때문에 형변환을 해줘서 사용할 수 있게 해야함 
		if(r instanceof Unit){  // instanceof -> Unit으로 형변환이 가능한지 확인 -> 가능하면 true 불가능하면 false / instanceof는 안전장치, 없어도 실행가능
			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}

interface Repairable{ 
	
}