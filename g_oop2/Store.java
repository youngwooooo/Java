package g_oop2;

public class Store {

	public static void main(String[] args) {
		Desktop d1 = new Desktop("삼성 컴퓨터", 1000000);
		Desktop d2 = new Desktop("LG 컴퓨터", 1000000);
		
		AirCon ac1 = new AirCon("삼성 에어컨", 2000000);
		AirCon ac2 = new AirCon("LG 에어컨", 2000000);
		
		TV tv1 = new TV("삼성 TV", 3000000);
		TV tv2 = new TV("LG TV", 3000000);
		
		Customer c = new Customer();
		
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d2); // c.buy((Product)d2);  ==> 자동 형변환
		
		c.buy(tv1); // c.buy((Product)tv2);
		
		c.buy(ac2);  // c.buy((Product)ac2);
		
	}
	
}

class Product{  // 부모클래스
	String name;  // 이름
	int price;  // 가격
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	String getInfo(){
		return name + "(" + price +"원)";
	}
}



class Desktop extends Product{  // 자식클래스 1
	Desktop(String name, int price){
		super(name, price);
	}
	
	void programming(){
		System.out.println("프로그램을 만듭니다.");
	}
}


class AirCon extends Product{  // 자식클래스 2
	AirCon(String name, int price){
		super(name, price);
	}
	
	void setTemperature(){
		System.out.println("온도를 설정합니다.");
	}
}


class TV extends Product{  // 자식클래스 3
	TV(String name, int price){
		super(name, price);
	}
	
	void setChannel(){
		System.out.println("채널을 변경합니다.");
	}
}


class Customer{
	int money = 10000000;
	
	Product[] item = new Product[100];  // Product타입 배열로 만들면 다 들어갈 수 있음.
	
	void buy(Product p){  // 살 물건들을 파라미터로 받는다.
		if(money < p.price){
			System.out.println("돈이 부족합니다.");
			return;
		}
		
		money -= p.price;
		for(int i=0; i<item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo() + "를 구매했습니다.");
	}
}
