package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "youngwoo";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE PRODUCT SET PNM = '바나나우유' WHERE PID = 500";
			ps = con.prepareStatement(sql);
			
			int result = ps.executeUpdate();
			System.out.println(result + "개의 컬럼이 영향을 받았습니다.");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally{
			if(rs != null) try{rs.close();} catch(Exception e) {}
			if(ps != null) try{ps.close();} catch(Exception e) {}
			if(con != null) try{con.close();} catch(Exception e) {}
		}
	}

}
