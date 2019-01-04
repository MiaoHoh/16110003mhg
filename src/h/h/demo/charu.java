package h.h.demo; 
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	 
	
	public class charu {
		public static void main(String[] arg) throws SQLException, ClassNotFoundException{
			
			PreparedStatement stmt;
			Connection conn = null;//连接数据库
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_test", "root", "1");
			String sql = "insert into emp values (?,?,?,?,?)";
			try {
				
				stmt = (PreparedStatement) conn.prepareStatement(sql);
				stmt.setInt(1, 9945);
				stmt.setString(2, "e");
				stmt.setString(3, "kingS");
				stmt.setString(4,"2017-12-08");
				stmt.setInt(5,65466);
				stmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}catch (ClassCastException e) {
				// TODO: handle exception
			}
			System.out.println("操作成功");
		}
	 
	}

