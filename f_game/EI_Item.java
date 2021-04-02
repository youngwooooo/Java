package f_game;

public class EI_Item {
	
	String name;
	String info;
	int hp;
	int att;
	int def;
	
	
	EI_Item(String name, String info, int hp, int att, int def){
		this.name = name;
		this.info = info;
		this.hp = hp;
		this.att = att;
		this.def = def;
	}
	
	String itemInfo(){
		String info = "「" + name + "」" + " : " + this.info;  
		if(0<hp) info += "「HP+" + hp +"」";
		if(0<att) info += "「공격력+" + att + "」";
		if(0<def) info += "「방어력+" + def + "」";
		return info;
	} 
	
	

}
