package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConnect {
 public SQLConnect(String a) {

     try {
         String connectionUrl = "jdbc:sqlserver://DESKTOP-PLKGNUH\\SQLEXPRESS:1433;"
                 + "databaseName="+a+";user=sa;password=123";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         Connection connection = DriverManager.getConnection(connectionUrl);
        
     } catch (Exception e) {
         e.printStackTrace();
     }
   
 }
}
 