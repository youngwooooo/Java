package f_game;

public class EI_Monster {
	
	String name;
	int hp;
	int maxHp;
	int att;
	int def;
	EI_Item[] items;
	

	EI_Monster(String name, int hp, int att, int def, EI_Item[] items){
		this.name = name;
		this.maxHp = hp;
		this.hp = this.maxHp;
		this.att = att;
		this.def = def;
		this.items = items;
	
	}
	
	
	
	void attack(EI_Character c){
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp = c.hp < damage ? c.hp - c.hp : c.hp - damage;
		System.out.println("「" + name + "」가 공격으로 " + "「" + c.name + "」에게 " + damage + "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 HP : " + c.hp);
	}
	
	EI_Item randomitem(){
		return items[(int)(Math.random() * items.length)];
	}
}
