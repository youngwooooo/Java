package e_oop.score;

public class Score {

	public static void main(String[] args) {
		
		Student[] students = new Student[10];  // 클래스 배열 생성
		
		for(int i=0; i<students.length; i++){
			Student student = new Student();  // 클래스 선언 및 초기화
			
			student.name = "학생" + (i+1); 
			student.rank = 1; // 
			student.kor = (int)(Math.random()*101); 
			student.eng = (int)(Math.random()*101); 
			student.math = (int)(Math.random()*101);
		
			students[i] = student;  // 배열에 저장
			// 배열에 저장 된 상태
			/* students[i].name
			 * students[i].rank
			 * students[i].kor
			 * students[i].eng
			 * students[i].math
			 */
			
			
		}
		
		// 성적처리 프로그램을 완성해주세요.
		// 합계, 평균, 석차, 과목합계, 과목평균
		for(int i = 0; i < students.length; i++){
			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round(students[i].sum / 3.0 * 100) / 100.0;
		}  // 합계, 평균
		
		for(int i = 0; i < students.length; i++){
			for(int j = 0; j < students.length; j++){
				if(students[i].sum < students[j].sum){
					students[i].rank++;
				}
			}
		}  // 석차
		
		for(int i = 0; i < students.length - 1; i++){  // 0~9
			int min = i;
			for(int j = i + 1; j < students.length; j++){  // 1~10
				if(students[min].rank > students[j].rank){
					min = j;
				}
			}
			Student temp = students[min];
			students[min] = students[i];
			students[i] = temp;
		}  // 석차를 1등부터 정렬
		
		int[] subSum = new int[3];
		for(int i = 0; i < students.length; i++){
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}  // 과목 합
		
		double[] subAvg = new double[3];
		for(int i = 0; i < subAvg.length; i++){
			subAvg[i] = Math.round((double)subSum[i] / students.length * 100) / 100.0;
		} // 과목 평균
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++){
			System.out.println(students[i].name
					+ "\t" + students[i].kor
					+ "\t" + students[i].eng
					+ "\t" + students[i].math
					+ "\t" + students[i].sum
					+ "\t" + students[i].avg
					+ "\t" + students[i].rank);
		}
		System.out.print("과목합계");
		for(int i = 0; i < subSum.length; i++){
			System.out.print("\t" + subSum[i]);
		}
		System.out.print("\n과목평균");
		for(int i = 0; i < subAvg.length; i++){
			System.out.print("\t" + subAvg[i]);
		} // 출력
		
		


	}
}
