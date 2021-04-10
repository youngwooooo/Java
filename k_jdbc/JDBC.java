package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	
	public static void main(String[] args) {
		
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc: 오라클 JDBC
		 * 
		 * JDBC 작성 단계
		 * 1. Connection 생성(DB 연결)
		 * 2. Statement 생성(쿼리 잓ㅇ)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기(생성 역순) 	
		 */
		
		// 데이터베이스 접속 정보 필요
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  // (앞부분은 고정)@(호스트이름(ip):포트:SID)
		String user = "youngwoo";
		String password = "java";
		
		// Connection, Statement, ResultSet 생성
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		// DriverManager : 데이터베이스에 접속하기 위한 드라이버(서로 다른 애들을 연결해주는 중간다리)를 관리해주는 클래스
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM MEMBER";  // String으로 쿼리 작성
			ps = con.prepareStatement(sql);
			
			//select
			rs = ps.executeQuery();
			
			//insert, update, delete
//			int result = ps.executeUpdate();  // 몇개의 행이 삽입,수정,삭제되었는지 결과를 숫자로 알려줌
			
			//추출
			//next()
			/* ResultSet이 바라보는 행을 출력해야함.
			 * next()는 조회된 결과 중 첫번째 행을 바라봄.
			 * 더이상 바라볼 행이 없을 때 next()이 false를 반환하면서 끝남.
			 */
			while(rs.next()){
				String memId = rs.getString(1); // char, varchar / 파라미터는 컬럼의 순서
				String memPass = rs.getString("MEM_PASS");  // 컬럼의 이름도 넘길 수 있다.
				System.out.println("MEM_ID :" + memId + " / " + "MEM_PASS : " + memPass);
//				rs.getInt(columnIndex);
//				rs.getDate(columnIndex);  ==> 여러가지 메소드들이 있으니 타입에 따라서 사용하면 된다.
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		
		
		
		
		
	}

}



