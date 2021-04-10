package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
			
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "youngwoo";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps= null;
//		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
//			String sql = "INSERT INTO PRODUCT VALUES (500, '초코우유')";
			String sql = "INSERT INTO PRODUCT VALUES (?, ?)";
			ps = con.prepareStatement(sql);
			ps.setObject(1, 500);
			ps.setObject(2, "초코우유");
			
			
			int result = ps.executeUpdate();
			System.out.println(result + "개의 행이 영향을 받았습니다.");
			
			// 날짜 넣는법
			// 글자에 빗금이 쳐져있는데 이런건 사용을 권장하지 않는다는 것!
//			java.util.Date date = new java.util.Date();
//			date.setYear(2021);
//			date.setMonth(3);  // 월은 0부터 시작 => 1월:0 ~ 12월:11
//			date.setDate(9);
//			date.setHours(16);
//			date.setMinutes(42);
//			date.setSeconds(30);
//			ps.setDate(1, new Date(date.getTime()));
			
//			ps.setDate(1, Date.valueOf("2021-04-09")); => 요런식으로 넣자. 시간은 문제가 있어서 안됨.
							
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally{
//			if(rs != null) try{rs.close();} catch(Exception e) {}
			if(ps != null) try{ps.close();} catch(Exception e) {}
			if(con != null) try{con.close();} catch(Exception e) {}
		}
	}

}
