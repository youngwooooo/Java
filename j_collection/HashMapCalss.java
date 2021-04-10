package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapCalss {

	public static void main(String[] args) {

		/*
		 * key는 사용자가 임의로 정한다.
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keySet() : 저장된 모든 키를 Set으로 반환한다.
		 * 순서라는 개념이 존재하지 않는다.
		 * 인덱스가 아닌 키로 저장을 한다.
		 */
		
		HashMap<String, Object> map = new HashMap<>();  // key는 보통 String타입을 사용한다.
		
		// put
		map.put("age", 10);
		map.put("name", "홍길동");
		map.put("date", new Date());
		
		System.out.println(map);  // 순서라는 개념이 없으므로 우리가 저장한 순서대로 출력되지 않는다.
		
		map.put("name", "이순신");  // 같은 키로 저장하게 되면 값을 덮어쓴다.
		
		System.out.println(map);
		
		// remove
		map.remove("age");  // 키와 값이 모두 삭제
		System.out.println(map); 
		
		// get
		Object value = map.get("name");  // 위의 HashMap 값을 Object로 정했기 때문에 Object로 꺼낸다.
		System.out.println(value);
		
		String str = (String)map.get("name");  // 다른 타입으로 값을 꺼내고 싶으면 해당되는 타입으로 형변환을 해줘야한다.
		System.out.println(str);
		
		// keySet
		Set<String> keys = map.keySet();  // 
		
			/* Set 특징 때문에 잘 사용되지 않는다.
			 * 
			 * Set 특징
			 * - 중복된 값을 허락하지 않는다.
			 * - 값을 꺼낼 수 있는 메서드가 존재하지 않는다.
			 */
		
		// 값을 꺼내는 법 : 향상된 for문 사용
		for(String key : keys){
			// 변수(오른쪽 값의 타입에 따라 변수의 타입을 정함) : 여러가지의 값(ArrayList, Set, HashMap 등등)  
			System.out.println(key + " : " + map.get(key));
		}
		
		
		// HashMap은 보통 테이블(데이터베이스)을 가져올 때 쓴다!
		// key = 컬럼명, 값 = 컬럼값
		// HashMap 하나로 테이블 한 줄을 불러올 수 있다. 그래서 HashMap을 여러 개 만들어서 ArrayList에 저장한다. 즉, ArrayList는 테이블이 된다.
		
		HashMap<String, Object> row = new HashMap<>();
		// 회원테이블 만들기

		// HashMap 한 줄 만들기
		row.put("id", "admin");
		row.put("password", "admin123");
		row.put("name", "관리자");
		row.put("tel", "010-1234-5678");
		
		// table에 회원 1명의 데이터를 추가해주세요
		HashMap<String, Object> rows = new HashMap<>();
		rows.put("id", "dlddudn02");
		rows.put("password", "1234");
		rows.put("name", "이영우");
		rows.put("tel", "010-2278-0985");
		
		// HashMap을 ArrayList에 저장
		ArrayList<HashMap<String, Object>> table = new ArrayList<>();
		table.add(row);
		table.add(rows);
		System.out.println(table);
		
		
		// lprod테이블 만들기
		ArrayList<HashMap<String, Object>> lprodtable = new ArrayList<>();
		
		HashMap<String, Object> lprodrow = new HashMap<>();
		lprodrow.put("LPROD_ID", 1);
		lprodrow.put("LPROD_GU", "P101");
		lprodrow.put("LPROD_NM", "컴퓨터제품");
		lprodtable.add(lprodrow);
		
		lprodrow = new HashMap<>();
		lprodrow.put("LPROD_ID", 2);
		lprodrow.put("LPROD_GU", "P102");
		lprodrow.put("LPROD_NM", "전자제품");
		lprodtable.add(lprodrow);
		
		lprodrow = new HashMap<>();
		lprodrow.put("LPROD_ID", 3);
		lprodrow.put("LPROD_GU", "P201");
		lprodrow.put("LPROD_NM", "여성캐주얼");
		lprodtable.add(lprodrow);
		
		lprodrow = new HashMap<>();
		lprodrow.put("LPROD_ID", 4);
		lprodrow.put("LPROD_GU", "P202");
		lprodrow.put("LPROD_NM", "남성캐주얼");
		lprodtable.add(lprodrow);
		
		lprodrow = new HashMap<>();
		lprodrow.put("LPROD_ID", 5);
		lprodrow.put("LPROD_GU", "P301");
		lprodrow.put("LPROD_NM", "피혁잡화");
		lprodtable.add(lprodrow);
		
		System.out.println(lprodtable);

		
		System.out.println("LPROD_ID\tLRPOD_GU\tLPROD_NM");
		for(int i=0; i<lprodtable.size(); i++){
			HashMap<String, Object> _row = lprodtable.get(i);
			System.out.println(_row.get("LPROD_ID") + "\t\t" + _row.get("LPROD_GU") + "\t\t" + _row.get("LPROD_NM"));
		}
		
		
		
		
		
		
	}

}


















