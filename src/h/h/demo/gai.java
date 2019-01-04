package h.h.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Code;

public class gai {
public static void main(String[] arg) throws SQLException, ClassNotFoundException{
		
		PreparedStatement stmt;
		Connection conn = null;//连接数据库
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/job_test", "root", "1");
		
		
		Scanner input = new Scanner(System.in);
    	System.out.println("输入修改的学号");
    	int empno= input.nextInt();
    	
    	System.out.println("输入修改信息");
    	String  ename= input.next();
    	String job = input.next();
    	String hiredate = input.next();
    	String sal  = input.next();
         String sql  ="update emp set ename = ?,job = ?,hiredate= ? ,sal= ? where empno= " +empno;
        PreparedStatement pre = (PreparedStatement) conn.prepareStatement(sql);
        pre.setString(1, ename);
        pre.setString(2,job);
        pre.setString(3, hiredate);
        pre.setString(4, sal);
        int count = pre.executeUpdate();
        System.out.println(count+"条数据发生变化");
        pre.close();

	    System.out.println("操作成功");
}
}
