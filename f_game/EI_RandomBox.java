package f_game;

public class EI_RandomBox {
	
	
	EI_Item[] items;
	
	EI_RandomBox(EI_Item[] items){
		this.items = items;
	}
	
	EI_Item randomitem(){
		return items[(int)(Math.random() * items.length)];
	}
	

}
