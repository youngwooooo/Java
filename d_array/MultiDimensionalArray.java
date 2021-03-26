package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {  // 배열 안의 배열 = 다차원배열

	public static void main(String[] args) {  // 배열은 다차원으로 만들 수 있지만 거의 2차원 배열을 사용함. 3차원 배열 이상은 보기 힘듬.
		// 2차원 배열
		int[][] array2;
		
		// 3차원 배열
		int[][][] array3;
		
		int[][] arr = new int[2][3];
		/*
		 * 변수 = 주소1(100번지)
		 * 
		 * 100번지
		 * {주소2(200번지), 주소3(300번지)}
		 * 
		 * 200번지
		 * {0, 0, 0}
		 * 
		 * 300번지
		 * {0, 0, 0}
		 */
		// 다른 초기화 방법
		int arr2[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
		int[] arr3[] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  // 이 방법은 선언과 초기화를 동시에
		
		int[][] arr4 = new int[3][];  // 가변 배열. 2차원 배열을 마음대로 만들 수 있다. 2차원 배열은 초기화 되지 않았음!
		arr4[0] = new int[3];  // 가변 배열의 2차원 배열 초기화
		arr4[1] = new int[4];
		arr4[2] = new int[10];
		
		System.out.println(arr[0][1]);  // 200번지의 1번 인덱스의 값 출력
		
//		arr[0] = 10;  // 1차원에는 값을 저장 할 수 없다. 
		arr[0] = new int[5];  // 1차원에는 배열을 저장해야함!!!
		arr[0][0] = 10;  // 2차원에는 값을 저장 할 수 있다.
		arr[0][1] = 20;
		arr[1][0] = 100;
		
		System.out.println(arr.length);  // 1차원 배열의 길이
		System.out.println(arr[0].length);  // 2차원 배열의 길이
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
		// 3명 학생의 5개 과목의 점수의 합계와 평균을 저장하라.
		int[][] scores = new int[3][5];  // 3명의 학생이 5과목의 점수가 있다.
		int[] sum = new int[scores.length];
		double[] avg = new double[scores.length];
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random() * 101);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		for(int i = 0; i < scores.length; i++){  // 학생을 돌리기 위함
			for(int j = 0; j < scores[i].length; j++){  // 과목을 돌리기 위함
				sum[i] += scores[i][j];
			} 
			avg[i] = (double)sum[i] / scores[i].length;
			System.out.println("합계 :" + sum[i] + " / " + "평균: " + avg[i]);
		}
		
	
		
		
		
		
	}

}
