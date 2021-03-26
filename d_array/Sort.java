package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * 1. 석차구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 *           ex) 시험을 봤을 때, 나의 점수를 찾기위해서는 모든 사람와 비교를 해야함, 비교하기 전엔 1등임, 비교를 할 때 내 점수보다 높은 사람이 있으면 2,3등 내려감. 모든사람이 다 돌았을 때 내 점수가 구해진다.
		 * 2. 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * 3. 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * 4. 삽입정렬 : 두 번째 숫자부터 앞의 숫자들과 비교해서 큰수를 뒤로 밀고 중간에 삽입하는 방식
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		// 3. 버블 정렬
		for(int i = 0; i < arr.length - 1; i++){  // 선택정렬과 마찬가지로 9회차를 돌면 10번째에는 가장 큰 수가 있다.
			boolean flag = true;
			for(int j = 0; j < arr.length - 1 - i; j++){ // 바깥쪽 for문이 1회차 돌았을때 마지막은 결정이 된다. i는 위치가 확정된 인덱스의 개수(마지막에 결정된 값)를 비교해줄 필요가 없으므로 빼준다.
				if(arr[j] > arr[j+1]){  // 1번째 값이 2번째값 보다 크다면(조건)
					int temp = arr[j];  // 임시변수에 인덱스 1번째 값이 저장되어있고
					arr[j] = arr[j+1];  // 1번째 인덱스는 가장 작은 값이 되야하므로 2번쨰 인덱스 값보다 더 큰 1번째 값은 뒤로 보내져야해서 더 작은 2번째 값을 1번째 인덱스 값에 저장해준다.
					arr[j+1] = temp;    // temp는 인덱스 1번째 숫자이 저장된 변수로 즉 2번째 인덱스의 값이 1번째 인덱스의 값으로 된다.
					flag = false;       // 
				}
		
			}
			if(flag){
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
//		// 1. 석차구하기
//		int[] rank = new int[arr.length];
//		for(int i = 0; i < arr.length; i++){
//			rank[i] = 1; // 1등부터 시작해야함
//		}
//		
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0; j < arr.length; j++){
//				if(arr[i] < arr[j]){  // arr[i]의 등수를 알고 싶음
//					rank[i]++;  // arr[i]가 arr[j]보다 작은 경우 rank[i]를 1씩 증가시킨다.
//					
//				}
//			}
//		}
//		for(int i = 0; i < arr.length; i++){
//			System.out.println(arr[i] + " : " + rank[i] + "등");
//	}
	
		
		// 2. 선택정렬
		// 최솟값과 맨 앞 수랑 자리를 바꾸기 = 첫 번째 정렬 끝, 다음 최소값을 두 번째 값이랑 자리를 바꾼다. = 두 번째 정렬 끝. .......
		// 첫 번째 정렬이 끝나면 첫번째정렬은 건들필요없이 두번째부터 다시 돌아야함
//		int min = arr[0];
//	   
//	   for(int i = 0; i < arr.length; i++){
//			   if(arr[i] < min){  // 배열의 최솟값
//				   min = arr[i];
//			   	}
//			   	int temp = min;
//			   	arr[0] = min;
//			   	min = temp;  // 최솟값을 arr[0]이랑 바꿈
//			   }
//			  System.out.println(Arrays.toString(arr));
//			  System.out.println(min);
		// 풀이
		for(int i = 0; i < arr.length - 1; i++){  // 배열 - 1인 이유 : 9회차까지 돌면 10번째는 오름차순으로 정렬이 되있음! 10회차를 돌릴 이유가 없다, 즉 9회차(10-1=9)까지 돌리면 된다.
			int min = i; // 최소값을 찾지말고 최소값의 위치를 찾아라, 최솟값의 위치를 맨 앞으로 옮기기 때문에! 최소값 인덱스를 찾지말고 최소값 인덱스가 들어가 있는 위치! 처음 값을 최소값으로 가정한다.
			for(int j = i + 1; j < arr.length; j++){  
				// j = i인 이유 : 1번째 값이 최소값이라고 가정을 하기 때문에 2번째 값부터 비교를 하기 위함임!
				// 여기는 왜 배열이 10인가? 2번째 값부터 배열 끝까지 돌아서 더 작은 값을 찾아야하기 때문에!
				if(arr[j] < arr[min]){  // j를 2~10번째 까지 돌렸을 때 가장 작은 값이 1번째보다 작으면 min의 값을 j로 바꾼다. 
					min = j;
				}
			}
			// min = j라는걸 만족하면 안쪽 for문을 빠져나와서 자리를 1번째 배열로 바꿔준다!
			int temp = arr[i];  // temp라는 임시변수에 최소값으로 가정한 1번째 인덱스값이 저장되어있다.
			arr[i] = arr[min];  // 1번째 인덱스 값을 for문을 돌려서 찾은 최소값으로 바꿔준다.
			arr[min] = temp;  // temp = 인덱스 첫번째 값(arr[i])이 최소값으로 저장된 변수이니까 그걸 찾은 최소값 인덱스에 저장한다.
		}
			System.out.println(Arrays.toString(arr));
		
			
		// 4. 삽입정렬 ==> 중간 결과를 물어본다.
			for(int i = 1; i < arr.length; i++){ // 두번 째 인덱스부터 앞의 숫자들과 비교해야하기 때문에 0이 아닌 1부터 시작!
				int temp = arr[i];  // 빠져나온 값을 임시로 저장할 변수
				int j;              // j라는 변수 선언
				for(j = i - 1; j >= 0; j--){
					if(temp < arr[j]){
						arr[j + 1] = arr[j]; 
					}else{
						break;
					}
				}
				arr[j + 1] = temp;
			}
			System.out.println(Arrays.toString(arr));
	}

}
