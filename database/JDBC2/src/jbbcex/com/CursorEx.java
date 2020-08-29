package jbbcex.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class CursorEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		 Class.forName("oracle.jdbc.OracleDriver");
//         String url = "jdbc:oracle:thin:@localhost:1521:xe";
//         String username = "system";
//         String pwd = "system";
//         Connection con = DriverManager.getConnection(url, username, pwd);
//         
//         Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//         
		Class.forName("oracle.jdbc.OracleDriver");
        
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

        //Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE );
        
        PreparedStatement pstmt=con.prepareStatement("select * from MY_DATA.employee", ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE );
        
        ResultSet rs=pstmt.executeQuery();
        
     ResultSetMetaData rst=rs.getMetaData();
        
        
//        System.out.println("total column "+rst.getColumnCount());
        System.out.println(rst.getColumnName(1)+"     "+rst.getColumnName(2)+"     "+rst.getColumnName(3));

//        System.out.println("column 4 name "+rst.getColumnName(4));
//        System.out.println("column 1 type name "+rst.getColumnTypeName(1));
//        
//        DatabaseMetaData db= con.getMetaData();
//        
//        System.out.println(db.getDriverName());
//        System.out.println(db.getDriverVersion());
//        
//        System.out.println(db.getUserName());
//        System.out.println(db.getDatabaseProductName());
//        System.out.println(db.getDatabaseProductVersion());
//        
//        rs.absolute(2);
//        
        rs.first();
        
//        rs.last();
        
        
        System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"   "+rs.getInt(3));
        
        
        
        System.out.println(rs.findColumn("city"));
        con.close();

	}

}
