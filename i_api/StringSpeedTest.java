package i_api;

public class StringSpeedTest {

	public static void main(String[] args) {
		
		// String 특징
		// 문자열에 변경이 가해지면 기존 문자열이 수정되는 것이 아니고 다른 '새로운 객체'가 생성되어 저장을 함
		// ex) "abc"(기존 문자열) + "d" => "abcd"(새로운 객체)
		
//		String str = "a";
//		
//		long start = System.currentTimeMillis();
//		for(int i=0; i<200000; i++){
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start + "ms");
		
		// 문자열을 많이 변경해야할 경우 StringBuffer를 사용하자
		StringBuffer sb = new StringBuffer("a");
		
		long start = System.currentTimeMillis();
		for(int i=0; i<200000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	}

}
