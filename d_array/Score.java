package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100사이의 랜덤 값으로 생성하고 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle		Java		합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		    90			630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		    90			630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		    90			630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		    90			630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		    90			630		90.00	 1
		 * 과목합계     450		450		450		450		450		450		   450
		 * 과목평균   90.00   90.00    90.00   90.00   90.00   90.00      90.00
		 */
		String[] names = {"강유진", "강지수", "곽재우", "구본성", "권수연", "김보영", "김소희", "김지수", "백지혜", "송유경", 
				
				          "신희철", "심선주", "오수연", "윤희중", "이경준", "이석호", "이승구", "이여강", "이영민", "이영우",
				          "이용석", "이정범", "최기문", "최소은", "최윤지"};   // 우리반 학생 이름
		String[] sub = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		int[][] array = new int[25][7];  // [25] = array.length, [7] = array[i].length
	
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = (int)(Math.random() * 101);
			}
			System.out.println(Arrays.toString(array[i]));
		}
		int[] sum = new int[array.length];  // 학생의 각 과목 총 합계
		double[] avg = new double[array.length];  // 학생의 각 과목 평균
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				sum[i] += array[i][j];
			}
			avg[i] = Math.round((double)sum[i] / array[i].length * 100) / 100.0;
		} // 합계 , 평균
		
		int[] subsum = new int[array.length];  // 과목합계
		double[] subavg = new double[array.length];  // 과목평균
		
		for(int i = 0; i < array[i].length; i++){
			for(int j = 0; j < array.length; j++){
				subsum[i] += array[j][i];
			}
			subavg[i] = (double)subsum[i] / array.length;
		} // 과목합계, 과목평균
		
		int[] rank = new int[array.length];  // 석차
		
		for(int i = 0; i < array.length; i++){
			rank[i] = 1;
			for(int j = 0; j < array.length; j++)
				if(sum[i] < sum[j]){  // 
					rank[i]++;
				}
		}
		
		for(int i = 0; i < array[i].length; i++){
			System.out.print("\t" + sub[i]);
		}
		System.out.println("\t합계\t평균\t석차");
		for(int i = 0; i < array.length; i++){
			System.out.print(names[i] + "\t");
			for(int j = 0; j < array[i].length; j++){
				System.out.print(array[i][j] + "\t");
			}
			System.out.println(sum[i] + "\t" + avg[i] + "\t" + rank[i]);
		}
		
		System.out.print("과목합계\t");
		for(int i = 0; i < array[i].length; i++){
			System.out.print(subsum[i] + "\t");
		}
		System.out.println();
		
		System.out.print("과목평균\t");
		for(int i = 0; i < array[i].length; i++){
			System.out.print(subavg[i] + "\t");
		}
		
		// 출력방법 종류
//        System.out.print("줄바꿈을 하지 않는다.");
//        System.out.print("줄바꿈을 하지 않는다.\n"); // \n : 줄 바꿈
//        System.out.println("줄바꿈을\t하지 않는다."); // \t : 들여쓰기, 띄어쓰기(tap 기능)
//        System.out.printf("문자열: %s, 숫자: %d", "Hello", 10);  // printf: 출력 포맷을 따로 지정
                                                              // %@: %@를 뒤에 있는 값의 형식으로 출력
                                                              // %s : 문자열, %d : 정수
	} 
}
