package i_api;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		
		// 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요
		// 1234 => 1,234 / 1234567 => 1,234,567
		// 뒤에서 하나씩 숫자를 짤라와서 3개 가져올 때마다 콤마를 찍게하고 새로운 변수에 저장
		
//		String num = "";
//		String result = "";
//		
//		System.out.print("숫자를 입력해주세요 > ");
//		num = ScanUtil.nextLine();
//		if(num.length() > 3){
//			for(int i=0; i<num.length(); i++){
//				if(num.length() > 3){
//					result = "," + num.substring(num.length()-3, num.length());
//				}
//			}
//		}else{
//			result = num;
//			
//		}
//		System.out.println(result);
//		
		System.out.println("숫자 입력 > ");
		String num = ScanUtil.nextLine();
		String num2 = "";
		
		int count = 0;
		for(int i=num.length()-1; i>=0; i--){
			num2 = num.charAt(i) +  num2;
			count++;
			if(count % 3 == 0 && count != num.length()){
				num2 = "," + num2;
			}
		}
		System.out.println(num2);	
	}

}
