package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * Collections Framework
		 * - 다수의 데이터를 다루기 위한 표준 방식
		 * - List
		 * - Map
		 * - Set
		 * - List, Map, Set은 interface다.
		 */
		
		/*
		 * ArrayList의 주요메서드 - 처음 길이는 0, 저장을 할 수록 길이가 점점 늘어남. 값을 삭제하면 길이가 줄어듬  ==> 즉 저장한 개수만큼을 유지한다.
		 * - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가한다. 기존의 길이를 벗어난 곳에 인덱스를 저장할 수는 없다. 인덱스를 밀어냄 => 인덱스 한 칸씩 뒤로 감
		 * - Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다. 인덱스를 덮어 씀
		 * - Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * - int size() : 저장된 객체의 수를 반환한다.
		 * - Object remove(int index) : 지정된 위치의 객체를 제거한다. 제거한 인덱스 뒤에 있던 인덱스들이 앞으로 한 칸씩 땡겨진다.
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		// 저장은 어떤 타입도 가능하지만 인덱스를 꺼냈을 때 예측할 수가 없다!
		
		ArrayList<Integer> list = new ArrayList<>();
		// collections 뒤에 <>(제네릭)을 붙일 수 있다. <> 안에는 ArrayList에 저장할 수 있는 타입을 지정해 줄 수 있음.
		list.add(new Integer(10));
//		list.add("abc");
		list.add(20);
		/*
		 * 래퍼 클래스 		: 자동 형변환을 해줌, <>안에 들어가는 클래스
		 * - byte 		: Byte
		 * - short		: Short
		 * - int		: Integer
		 * - long		: Long
		 * - float		: Float
		 * - double		: Double
		 * - boolean	: Boolean
		 * - char		: Character
		 */
		
		System.out.println(list);
		
		list.add(1, 30);
		System.out.println(list);
		
		int before = list.set(2, 40);  // set은 return 값이 있다. return값 = 기존에 있던 값
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));  // get은 해당 인덱스의 값을 불러옴.
		System.out.println(list);
		
		// int size -> ArrayList의 길이를 말함. for문에서 자주 사용
		for(int i=0; i<list.size(); i++){
			System.out.println(i + " : " + list.get(i));
		}
		
		// Object remove
		list.remove(1);  // 1번 인덱스 제거
		System.out.println(list);  // 3번 인덱스였던 40이 2번 인덱스로 땡겨짐. int size = 2
		
		// for문에서 remove를 사용하려면 for문을 거꾸로 돌려야함!
		for(int i=list.size()-1; i>=0; i--){
			list.remove(i);
		}
		System.out.println(list);
		
		
		
		// list에 1~100사이의 랜덤값을 10개 저장해주세요
		for(int i=0; i<10; i++){
			int random = (int)(Math.random()*100)+1;
			list.add(random);
		}
		System.out.println(list);
		
		// list에 저장된 값의 합계와 평균을 구해주세요
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<list.size(); i++){
			sum += list.get(i);
		}
		avg = (double)sum / list.size();  // 둘다 int기 떄문에 한 쪽을 double로 형 변환해줘야함!
		System.out.println("합계 : " + sum + " / " + "평균 : " + avg);
		
		// 최소값과 최대값을 구해주세요
		int min = list.get(0);
		int max = list.get(0);

		for(int i=0; i<list.size(); i++){
			if(list.get(i) < min){
				min = list.get(i);
			}
			if(list.get(i) > max){
				max = list.get(i);
			}		
		}
		System.out.println("최소값 : " + min + " / " + "최대값 : " + max);
		
		// list를 오름차순으로 정렬해주세요.
		for(int i=0; i<list.size()-1; i++){
			min = i;
			for(int j=i+1; j<list.size(); j++){
				if(list.get(j) < list.get(min)){
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));  // 수정하는 것이기 때문에 set을 사용할 것!
			list.set(min, temp);
		}
		System.out.println(list);
		
		// ArrayList 2차원 배열 만드는법
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		
		list2.add(list3);  // list3이라는 변수가 아닌 list3에 들어있는 ArrayList를 저장한 것임!
		System.out.println(list2);
		
		list3 = new ArrayList<>();  // 새로운 ArrayList 만듬
		list3.add(40);
		list3.add(50);
		
		list2.add(list3);
		System.out.println(list2);
		
		for(int i=0; i<list2.size(); i++){
			ArrayList<Integer> list4 = list2.get(i);
			for(int j=0; j<list4.size(); j++){
				System.out.print(list4.get(j) + "\t");
			}
			System.out.println();
//				for(int j=0; j<list2.get(i).size(); j++){
//				System.out.println(list2.get(i).get(j));
//			}
		}
	}	
	
}
















