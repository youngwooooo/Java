package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		// 거스름돈 동전 개수
		int money = (int)(Math.random() * 500) * 10;  // 거스름돈
		int[] coin = {500, 100, 50, 10};  // 배열 5
		System.out.println("거스름돈: " + money);  // 거스름돈 출력
		
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 */
		
		for(int i = 0; i < coin.length; i++){
			int count = money / coin[i];  
			money = money % coin[i];  
			System.out.println(coin[i] + "원: " + count + "개");
		}
		
		// 그래프 그리기
		int[] arr = new int[20];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
		/*
		 * 1~5사이의 숫자가 발생된 만큼 *를 사용해 그래프를 그려주세요
		 * 
		 * [4, 3, 2, 1, 1, 1, 4, 4, 5, 5, 3, 5, 2, 3, 1, 2, 3, 1, 2, 4]
		 * 1 : ***** 5
		 * 2 : **** 4
		 * 3 : **** 4
		 * 4 : **** 4
		 * 5 : *** 3
		 */
	     int[] counts = new int[5];
	     
		 for(int i = 0; i < arr.length; i++){
			counts[arr[i] - 1]++;
			 }
		 for(int i = 0; i < counts.length; i++){
			 System.out.print(i + 1 + " : ");
			 for(int j = 0; j < counts[i]; j++){
				 System.out.print("*");
			 }
			 System.out.println(" " + counts[i]);
		 }
		 
		 // 중복되지 않는 배열
		 arr = new int[10];
		 for(int i = 0; i <arr.length; i++){
			 arr[i] = (int)(Math.random() * 5) + 1;
		 }
		 System.out.println(Arrays.toString(arr));
		 /*
		  * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		  * [4, 2, 1, 2, 5, 1, 4, 4, 2, 1]  // 중복된 값이 하나만 나오게
		  * [4, 2, 1, 5]
		  */
		 int[] temp = new int[5];
		 int count = 0;
		 for(int i = 0; i < arr.length; i++){
			 boolean flag = true;
			 for(int j = 0; j < temp.length; j++){
				 if(arr[i] == temp[j]){
					 flag = false;
				 }
			 }
			 if(flag){
				 temp[count++] = arr[i];
			 }
		 }
		 int[] result = new int[count];
		 for(int i = 0; i < result.length; i++){
			 result[i] = temp[i];
		 }
		 System.out.println(Arrays.toString(result));
		 
		 arr = new int[100];
		 for(int i = 0; i < arr.length; i++){
			 arr[i] = (int)(Math.random() * 100) + 1;
			 
		 }
		 System.out.println(Arrays.toString(arr)); 
		 /*
		  * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력해주세요
		  * 5
		  * [5, 10, 15, 20, 25, 30]
		  */
		 int[] tempArr = new int[100];
			int n = (int)(Math.random() * 4) + 2;
			count = 0;
			for(int i = 0; i < arr.length; i++){
				if(arr[i] % n == 0){
					tempArr[count++] = arr[i];
				}
			}
			
			int[] resultArr = new int[count];  // count만큼 길의의 배열 새로 생성
			for(int i = 0; i < resultArr.length; i++){
				resultArr[i] = tempArr[i];
			}
			
			for(int i  = 0; i < resultArr.length - 1; i++){  // 선택정렬로 정렬
				int min = i;
				for(int j = i + 1; j < resultArr.length; j++){
					if(resultArr[j] < resultArr[min]){
						min = j;
					}
				}
				int tmp = resultArr[i];  // 자리바꾸기
				resultArr[i] = resultArr[min];
				resultArr[min] = tmp;
			}
			System.out.println("n : " + n);
			System.out.println(Arrays.toString(resultArr));
	}

}
