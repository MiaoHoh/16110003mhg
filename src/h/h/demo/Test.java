package h.h.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;//连接数据库
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_test", "root", "1");
		Statement stat = null;
		stat = conn.createStatement();
		PreparedStatement stmt;
		String sql = "select * from emp";
		ResultSet rs=stat.executeQuery(sql);//查询
		while(rs.next()) {
			String empno = rs.getString("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String hiredate = rs.getString("hiredate");
			String sal = rs.getString("sal");
			System.out.println(empno);
			System.out.println(ename);
			System.out.println(job);
			System.out.println(hiredate);
			System.out.println(sal);
			
		}
		
		
		rs.close();
		stat.close();
		conn.close();
		
		
	}
}
