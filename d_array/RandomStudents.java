package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudents {

	public static void main(String[] args) {
		// 입력한 숫자만큼 우리반 학생들 중 랜덤으로 뽑아서 출력하는 프로그램을 만들어주세요.
		// 사용자한테 숫자를 하나 입력받고. 숫자는 1 ~ 25, 사용자가 5를 입력하면 5명을 랜덤으로 뽑아서 출력, 중복 x
//		Scanner sc = new Scanner(System.in);
//		
//		int[] stu = new int[25];  // 배열의 길이 25	, 0~24
//		
//		
//		for(int i = 0; i < stu.length; i++){ // 1~25
//			stu[i] = i + 1;
//		}
//		for(int i = 0; i < stu.length; i++){ // 배열을 랜덤값으로 설정
//			stu[i] = (int)(Math.random() * stu.length);
//		}

		// 교수님 풀이
		/*1. 방법을 먼저 찾아라
		 * - 25명을 이름 순으로 넣고, 섞어서, 앞에서 n명만 뽑기
		 * - 25명을 넣어놓고 중복되지 않게 뽑기
		 */
		String[] students = {"최기문", "이경준", "최윤지", "오수연"};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("몇 명을 뽑을까요?");
		int count = Integer.parseInt(s.nextLine());
		
		String[] pick = new String[count];
		int pickCount = 0;
		
		do{
			int random = (int)(Math.random() * students.length);
			
			boolean flag = true;
			for(int i = 0; i < pick.length; i++){
				if(students[random].equals(pick[i])){  // 같은 사람이 있는 경우 flag = false로 바꾼다.
					flag = false;
				}
			}
			
			if(flag){
				pick[pickCount++] = students[random];
			}
		}while(pickCount < count);
		
		System.out.println(Arrays.toString(pick));
		
 }

}
