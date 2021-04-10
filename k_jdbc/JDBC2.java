package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "youngwoo";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * "
					+    "FROM CART "
					+    "WHERE CART_MEMBER = ? "
					+    "AND CART_QTY >= ?";
			
			// PreparedStatement와 Statement의 차이점 
			// PreparedStatement : 물음표(?)를 사용할 수 있다.  ==> 이걸 자주 사용함.
			// Statement : 물음표(?)를 사용할 수 없다.
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001");  // 첫 번째 물음표에 "a001"을 넣겠다.
			ps.setInt(2, 10); // 두 번째 물음표에 10을 넣겠다.
			
			rs = ps.executeQuery();
			
			// 컬럼을 일일이 적지않고 한 번에 다 출력할 수 있다.
			ResultSetMetaData metaData = rs.getMetaData();  // 메타데이터: 데이터에 대한 데이터(정보)
			int columCount = metaData.getColumnCount();  // 컬럼의 수
			
			for(int i=1; i<=columCount; i++){
				System.out.print(metaData.getColumnName(i) + "\t");
			}
			System.out.println();
			
			while(rs.next()){
				for(int i=1; i<=columCount; i++){
					Object value = rs.getObject(i);  // get
					System.out.print(value + "\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null) try{rs.close();} catch(Exception e) {}
			if(ps != null) try{ps.close();} catch(Exception e) {}
			if(con != null) try{con.close();} catch(Exception e) {}
		}
		
	}

}
