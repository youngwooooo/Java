package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러 개의 값을 하나의 변수에 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 정하고 시작하기 때문에 길이를 변경할 수 없다.		
		 */
		
		int[] array;  // int array[];도 가능하나 보통 타입 뒤에 쓴다.
		array = new int[5];  // int 5개를 저장할 수 있는 공간이 만들어졌고(배열의 길이), 값의 주소가 array에 저장이 된다.
		// int[5]; == > 0이 5개가 들어있는 상태가 됨.
				/* 
		 * 변수 = 주소
		 * 
		 * 100번지 ==> 첫 번째 값의 주소
		 * (0, 0, 0, 0, 0) ==> (100번지, 101, 102, 103, 104)
		 */
		 
		// 추가적인 초기화 방법
		array = new int[]{1, 2, 3, 4, 5}; // 기본 값이 {}에 있는 것으로 바뀜!
		
//		array = {1, 2, 3, 4, 5}; ==> 초기화만 할 수 없음, 컴파일 에러가 뜸!
		int[] array2 = {1, 2, 3, 4, 5}; // ==> 선언과 초기화를 동시에 해야함!
		
		System.out.println(array[0]);  // array[n] ==> 인덱스, 인덱스는 0부터 시작해서 1씩 증가한다.
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for(int i = 0; i < array.length; i++){  // 배열 for문 작성법
			System.out.println(array[i]);
		}
		
		for(int i = 0; i < array.length; i++){
			array[i] = (i + 1) * 10;
		}
		
		// 10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] arr = new int[10];
		
		// 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		arr[0] = (int)(Math.random() * 100) + 1;
		arr[1] = (int)(Math.random() * 100) + 1;
		arr[2] = (int)(Math.random() * 100) + 1;
		arr[3] = (int)(Math.random() * 100) + 1;
		arr[4] = (int)(Math.random() * 100) + 1;
		arr[5] = (int)(Math.random() * 100) + 1;
		arr[6] = (int)(Math.random() * 100) + 1;
		arr[7] = (int)(Math.random() * 100) + 1;
		arr[8] = (int)(Math.random() * 100) + 1;
		arr[9] = (int)(Math.random() * 100) + 1;
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		// 배열에 저장된 모든 값의 합계와 평균을 출력해주세요
//		int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7] + arr[8] + arr[9];
//		int avg = (arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7] + arr[8] + arr[9]) / 10;
//		System.out.println("배열 값의 합계: " + sum);
//		System.out.println("배열 값의 평균: " + avg);
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		
		double avg = (double)sum / arr.length;
		System.out.println("sum : " + sum + " / " + "avg : " + avg);
		
		// 배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		System.out.println(Arrays.toString(arr));
		
		// arr[0] ~ arr[9]까지 가면서 새로운 최솟/최대값이 나올때마다 수정됨. 
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++){
			if(max < arr[i]){  
				max = arr[i];  // arr[i]이 최대값 보다 크면 max에 저장
			}
			if(min > arr[i]){  
				min = arr[i];  // arr[i]이 최소값 보다 작으면 min에 저장
			}
			System.out.println("최대값 : " + max + " / " + "최소값 : " + min);
		}
		
		int[] shuffle = new int[10];
		
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));
		// 0~9까지 랜덤한 인덱스를 발생시켜서 발생된 값이 인덱스 0번자리와  자리가 바뀐다.
		for(int i = 0; i < shuffle.length; i++){
		int ran = (int)(Math.random() * shuffle.length);
		int temp = shuffle[0];
		shuffle[0] = shuffle[ran];
		shuffle[ran] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		// 1~10사이의 랜덤값을 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		// 1~10까지 각 숫자가 발생된 횟수를 출력( 1 = n번...)
		int[] counts = new int[10];
		
		for(int i = 0; i < 500; i++){
			int random = (int)(Math.random() * 10) + 1;
			
//			if(random == 1) counts[0]++;
//			if(random == 2) counts[1]++;
//			.
//			.
//			.
			counts[random - 1]++;
		}
		System.out.println(Arrays.toString(counts));
		
		
			
			
		
		
			
		
	
	
	
	
	
	
	
	
	
	}			
		
		
}



















