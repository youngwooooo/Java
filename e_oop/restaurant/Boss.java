package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		
		Alba alba = new Alba();  // 알바 고용
		
		String[] order = alba.order();
		System.out.println(Arrays.toString(order));
		
		System.out.println("요리 만드는중.... 완성!");
		String[] orderfoods = {"완성된 짜장면", "완성된 탕수육"};
		
		alba.serving(orderfoods);
		
		alba.pay(order);
		
		
		
	}

}
