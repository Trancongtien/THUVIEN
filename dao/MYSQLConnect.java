package dao;
import java.sql.*;

public class MYSQLConnect {
 public MYSQLConnect(String a) {
	 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+a+"\"", "root", "");
			
	 }catch (Exception e) {
System.out.println(e);
	 }
 }
}
