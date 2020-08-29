package jbbcex.com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetadataEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("oracle.jdbc.OracleDriver");
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String username = "system";
         String pwd = "system";
         Connection con = DriverManager.getConnection(url, username, pwd);
         
         PreparedStatement ps =con.prepareStatement("select * from my_data.employee");
         ResultSet rs = ps.executeQuery();
         ResultSetMetaData rm = rs.getMetaData();
         
         System.out.println(rm.getColumnCount());
         System.out.println("column 1 name "+rm.getColumnName(1)+" type is "+rm.getColumnTypeName(1));
         System.out.println("column 2 name "+rm.getColumnName(2)+" type is "+rm.getColumnTypeName(2));
         System.out.println("column 3 name "+rm.getColumnName(3)+" type is "+rm.getColumnTypeName(3));
         System.out.println("column 4 name "+rm.getColumnName(4)+" type is "+rm.getColumnTypeName(4));
         System.out.println("column 5 name "+rm.getColumnName(5)+" type is "+rm.getColumnTypeName(5));
         System.out.println();
         
         
         DatabaseMetaData db = con.getMetaData();
         System.out.println(db.getDriverName());
         System.out.println(db.getDriverVersion());
         System.out.println(db.getDatabaseProductName());
         System.out.println(db.getUserName());
         System.out.println(db.getDatabaseProductVersion());
         

	}

}
