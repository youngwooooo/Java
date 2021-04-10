package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC_Board {

	public static void main(String[] args) {
		// 오라클 데이터베이스에 생성한 게시판 테이블을 이용해 게시판 프로그램을 만들기
		// AS OF TIMESTAMP(SYSTIMESTAMP - INTERVAL '10' MINUTE)로 10분 전의 테이블로 돌릴 수 있다
		while(true){
			Board();
			break;
		}
		
		
		
	}

	static void Board(){
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "youngwoo";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT *" 
					+ "FROM TB_JDBC_BOARD";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
		
			ResultSetMetaData metaData = rs.getMetaData();
			int columCount = metaData.getColumnCount();
				
				for(int i=1; i<=columCount; i++){
					System.out.print(metaData.getColumnName(i) + "\t");
				}
				System.out.println();
			
			while(rs.next()){
				for(int i=1; i<=columCount; i++){
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally{
			if(rs != null) try{rs.close();} catch(Exception e) {}
			if(ps != null) try{ps.close();} catch(Exception e) {}
			if(con != null) try{con.close();} catch(Exception e) {}
		}
	}
}
