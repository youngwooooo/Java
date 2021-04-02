package f_game;

public class EI_Character {

		String name;
		int hp;
		int maxHp;
		int exp;
		int level;
		int att;
		int def;
		int gold;
		EI_Item[] items;
		
		EI_Character(String name, int hp, int att, int def){
			this.name = name;
			this.maxHp = hp;
			this.hp = this.maxHp;
			this.att = att;
			this.def = def;
			this.level = 1;
			this.exp = 0;
			this.gold = 0;
			this.items = new EI_Item[100];
			}
		
		void Status(){
			System.out.println("=======================================");
			System.out.println("▶================상태창================◀");
			System.out.println("▶ 이름 : " + name);
			System.out.println("▶ 레벨 : " + level + "(" + exp + "/100)");
			System.out.println("▶ HP : " + hp + "/" + maxHp);
			System.out.println("▶ 공격력 : " + att);
			System.out.println("▶ 방어력 : " + def);
			System.out.println("▶ EXP : " + exp);
			System.out.println("▶ 골드 : " + gold);
			System.out.println("▶===============인벤토리===============◀");
			for(int i=0; i<items.length; i++){
				if(items[i] != null){
					System.out.println(items[i].itemInfo());
				}
			}
		
		}
		
		void attack(EI_Monster m){
			int damage = att - m.def;
			damage = damage <= 0 ? 1 : damage;
			m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
			System.out.println("「" + name + "」의 공격으로 " + "「" + m.name + "」에게 " + damage + "만큼 데미지를 주었습니다.");
			System.out.println(m.name + "의 남은 HP : " + m.hp);
		
		}
		
		void getExp(int exp){
			System.out.println(exp + "의 경험치를 획득하였습니다.");
			this.exp += exp;
			while(100 <= this.exp){
				levelUp();
				this.exp -= 100;
			}
		}
		
		void levelUp(){
			level++;
			maxHp += 30;
			att += 2;
			def += 2;
			hp = maxHp;
			System.out.println("LEVEL UP!!");
		}
		
		void getGold(int gold){
			this.gold += gold;
			System.out.println(gold + "골드를 획득하였습니다.");
		}
		
		void getItem(EI_Item item){
			System.out.println(item.name + "을 획득하였습니다.");
			for(int i=0; i<items.length; i++){
				if(items[i] == null){
					items[i] = item;
					break;
				}
			}
			maxHp += item.hp;
			att += item.att;
			def += item.def;
		}


}