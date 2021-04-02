package f_game;

import java.util.Random;

import e_oop.ScanUtil;

public class EscapeIsland {
	
	EI_Character c;
	EI_Item[] items;
	EI_Monster m;
	EI_RandomBox rb;

	
	EscapeIsland(){
		c = new EI_Character("이영우", 100, 20, 30);  // 이름, hp, 공격력, 방어력
		
		items = new EI_Item[20];
		items[0] = new EI_Item("날이 빠진 검", " : 쓸모없어 보이는 검이다.", 0, 0, 0);
		items[1] = new EI_Item("숏소드", " : 쓸만한 짧은 검이다.", 0, 50, 0);
		items[2] = new EI_Item("양손검", " : 무겁고 묵직한 검이다." , 50, 100, 0);
		items[3] = new EI_Item("양손대검", " : 매우 크고 강해보이는 검이다." , 100, 200, 0);
		items[4] = new EI_Item("황금 도끼", " : 황금으로 만든 도끼. 강해보인다." , 200, 500, 0);
		items[6] = new EI_Item("영웅의 검", " : 무엇이든 벨 수 있을 것 같다." , 500, 1000, 0);
		items[7] = new EI_Item("망가진 갑옷", " : 안 입는게 나을 것 같다." , 0, 0, 0);
		items[8] = new EI_Item("가죽 갑옷", " : 가죽으로 만든 갑옷이다." , 50, 0, 10);
		items[9] = new EI_Item("철 갑옷", " : 철로 만든 갑옷이다." , 100, 0, 30);
		items[10] = new EI_Item("은 갑옷", " : 은으로 만든 갑옷이다." , 200, 0, 50);
		items[11] = new EI_Item("황금 갑옷", " : 황금으로 만든 갑옷이다." , 500, 0, 200);
		items[12] = new EI_Item("영웅의 갑옷", " : 무엇이든 막을 수 있을 것 같다." , 500, 0, 500);
		items[13] = new EI_Item("오크 킹의 증표", " : 오크 킹의 영혼이 깃들어있다." , 0, 0, 0);
		items[14] = new EI_Item("트롤 킹의 증표", " : 트롤 킹의 영혼이 깃들어있다." , 0, 0, 0);
		items[15] = new EI_Item("오우거 킹의 증표", " : 오우거 킹의 영혼이 깃들어있다." , 0, 0, 0);
		
		
	
		
		
		
	}

	public static void main(String[] args) {
		System.out.println("【 당신은 이름모를 섬에 떨어졌습니다. 시스템을 이용하여 성장할 수 있습니다. 】");
		System.out.println("【 보스몬스터에게 도전하여 승리해 보스몬스터의 증표를 모아 섬을 탈출하세요! 】");
		System.out.println();
		new EscapeIsland().start();
	}
	
private void start() {
		
		int input = 0;
		while(true){
			System.out.println("1.내정보\t2.사냥\t3.상점\t4.보스몬스터\t5.탈출");
			input = ScanUtil.nextInt();
			
			switch(input){
			
			case 1:
				c.Status();
				break;
			case 2:
				hunt();
				break;
			case 3:
				buyitem();
				break;
			case 4:
				bosshunt();
				break;
			case 5:
				potal();
			System.out.println("《 포탈이 열립니다! 》");
			System.out.println("《 GAME CLEAR!! 》");
			System.exit(0);
			break;
			}
		}
		
	}

	void hunt(){
		int num = 0;
		System.out.println("숲에서 몬스터를 발견하였습니다. 싸울 몬스터를 선택해주세요.");
		System.out.println("1.오크(공격력 = 20↑)\t2.트롤(공격력 = 100↑)\t3.오우거(공격력 = 300↑)");
		num = ScanUtil.nextInt();
		
		switch(num){
		case 1:
		if(num == 1){
			m = new EI_Monster("오크", 50, 10, 10, null);
			System.out.println(m.name + "를(을) 만났습니다. 전투를 시작합니다.");

		}
		case 2:
		if(num == 2){
			m = new EI_Monster("트롤", 500, 150, 60, null);
			System.out.println(m.name + "를(을) 만났습니다. 전투를 시작합니다.");
		}
			
		case 3:
		if(num == 3){
			m = new EI_Monster("오우거", 1000, 300, 200, null);
			System.out.println(m.name + "를(을) 만났습니다. 전투를 시작합니다.");
		}
	}
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			int input = ScanUtil.nextInt();
			switch(input){
			case 1:
			c.attack(m);
			if(m.hp <= 0){
				System.out.println(m.name + "을 처치하였습니다.");
				if(m.name == "오크"){
				c.getExp(10000);
				c.getGold(10000);
				break battle;
				}
				if(m.name == "트롤"){
					c.getExp(100);
					c.getGold(300);
					break battle;
					}
				if(m.name == "오우거"){
					c.getExp(200);
					c.getGold(500);
					break battle;
				}
			}
			m.attack(c);
			if(c.hp <= 0){
				System.out.println("당신은 죽었습니다.");
				c.hp = c.maxHp;
				System.out.println("섬 중앙에서 부활합니다.");
				break battle;
			}
			break;
			case 2:
				System.out.println(m.name + "으로부터 도망쳤습니다.");
				break battle;
			}
		}	
	}
	
	void buyitem(){
		int num = 0;
		System.out.println("상점에 입장하였습니다.");
		System.out.println("1.포션구매\t2.장비뽑기\t3.상점나가기");
		num = ScanUtil.nextInt();
		
		switch(num){
			case 1:
				System.out.println("1.HP증가 포션(HP+200, 1000골드)\t2.공격력증가 포션(공격력+100, 2000골드)\t3.방어력증가 포션(방어력+100, 2000골드)");
				num = ScanUtil.nextInt();
						
				if(num == 1 && c.gold >= 1000){
					System.out.println("HP증가포션을 구입하였습니다.");
					System.out.println("체력이 200만큼 증가합니다.");
					c.gold -= 1000;
					c.maxHp += 200;
					break;
				}else if(num == 1 && c.gold <= 1000){
					System.out.println("골드가 부족합니다.");
					break;
				}
				
				if(num == 2 && c.gold >= 2000){
					System.out.println("공격력증가 포션을 구입하였습니다.");
					System.out.println("공격력이 100만큼 증가합니다.");
					c.gold -= 1000;
					c.att += 100;
					break;
				}else if(num == 2 && c.gold <= 2000){
					System.out.println("골드가 부족합니다.");
					break;
				}
				
				if(num == 3 && c.gold >= 2000){
					System.out.println("방어력증가 포션을 구입하였습니다.");
					System.out.println("방어력이 100만큼 증가합니다.");
					c.gold -= 1000;
					c.def += 100;
					break;
				}else if(num == 3 && c.gold <= 2000){
					System.out.println("골드가 부족합니다.");
					break;
				}
			case 2:
				System.out.println("1.랜덤박스(3000골드)");
				System.out.println("《 행운의 랜덤박스! 3000골드로 인생역전에 도전하세요!》");
				num = ScanUtil.nextInt();
				
				if(num == 1 && c.gold >= 3000){
					c.gold -= 3000;
					rb = new EI_RandomBox(new EI_Item[]{items[0], items[1], items[2], items[3], items[4], items[5], items[6], items[7], items[8], items[9], items[10], items[11], items[12]});
					c.getItem(rb.randomitem());
				}
				else if(num == 1 && c.gold < 2000){
					System.out.println("골드가 부족합니다.");
				}
		}
		
	}
	
	void bosshunt(){
		int num = 0;
		System.out.println("보스몬스터에게 도전합니다! 보스몬스터를 선택해주세요.");
		System.out.println("1.오크 킹(공격력 = 1000↑)\t\t2.트롤 킹(공격력 = 2000↑)\t\t3.오우거 킹(공격력 = 3000↑)");
		num = ScanUtil.nextInt();
		
		switch(num){
		case 1:
		if(num == 1){
			m = new EI_Monster("오크 킹", 10000, 500, 400, new EI_Item[]{items[13]});
			System.out.println(m.name + "를(을) 만났습니다. 전투를 시작합니다.");
		}
		
		case 2:
		if(num == 2){
			m = new EI_Monster("트롤 킹", 20000, 700, 600, new EI_Item[]{items[14]});
			System.out.println(m.name + "를(을) 만났습니다. 전투를 시작합니다.");
		}
			
		case 3:
		if(num == 3){
			m = new EI_Monster("오우거 킹", 35000, 1000, 800, new EI_Item[]{items[15]});
			System.out.println(m.name + "를(을) 만났습니다. 전투를 시작합니다.");
		}
	}
		battle : while(true){
			System.out.println("1.공격\t2.도망");
			int input = ScanUtil.nextInt();
			switch(input){
			case 1:
			c.attack(m);
			if(m.hp <= 0){
				System.out.println(m.name + "을 처치하였습니다.");
				if(m.name == "오크 킹"){
				c.getExp(1000);
				c.getGold(5000);
				c.getItem(m.randomitem());
				break battle;
				}
				if(m.name == "트롤 킹"){
					c.getExp(2000);
					c.getGold(10000);
					c.getItem(m.randomitem());
					break battle;
					}
				if(m.name == "오우거 킹"){
					c.getExp(3000);
					c.getGold(50000);
					c.getItem(m.randomitem());
					break battle;
					}
			}
			m.attack(c);
			if(c.hp <= 0){
				System.out.println("당신은 죽었습니다.");
				c.hp = c.maxHp;
				System.out.println("섬 중앙에서 부활합니다.");
				break battle;
			}
			break;
			case 2:
				System.out.println(m.name + "으로부터 도망쳤습니다.");
				break battle;
			}
		}	
	}
	
	void potal(){
		String excape;
		String compose;
		
		System.out.println("증표 조합이 가능합니다. 조합하시겠습니까?(Y/N)");
		System.out.print("▶ ");
		compose = ScanUtil.nextLine();
		if(compose == "Y" || compose == "y"){
		System.out.println("증표가 찬란한 빛과 함께 합쳐집니다.");
		}
		System.out.println("포탈을 생성할 수 있습니다.(입력: 포탈생성)");
		System.out.print("▶ ");
		excape = ScanUtil.nextLine();
		
		
	}

	
	
	

		
	}



