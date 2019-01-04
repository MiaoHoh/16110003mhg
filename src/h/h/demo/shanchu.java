package h.h.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class shanchu {
	public static void main(String[] arg) throws SQLException, ClassNotFoundException{
		
		PreparedStatement stmt;
		Connection conn = null;//连接数据库
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_test", "root", "1");
		String sql = "delete from emp where empno = ?";
		PreparedStatement ptmt = (PreparedStatement) conn.prepareStatement(sql);
		ptmt.setInt(1, 2);
        ptmt.execute();
        System.out.println("操作成功");
	}
}
