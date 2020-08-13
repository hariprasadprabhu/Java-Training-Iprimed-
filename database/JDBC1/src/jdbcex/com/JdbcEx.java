package jdbcex.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("done");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		System.out.println("Connection done");
		Statement stmt = con.createStatement();
		System.out.println("Ststement created");
		//stmt.execute("update my_data.student set age=25 where name='prasad'"); if you want to update
		//stmt.execute("delete from my_data.student where name='raju'"); if you want to delete
		//stmt.execute("insert into my_data.student values(8,'manju',47,10)"); if want to insert
		ResultSet rs = stmt.executeQuery("select * from my_data.student");
		
		System.out.println("executed");
		String name;
		
		while(rs.next())
		{
			name=rs.getString("NAME");
			System.out.println(name+" \t|\t "+rs.getLong("ROLL")+" \t|\t "+rs.getLong("AGE")+" \t|\t "+rs.getInt("STD"));
			System.out.println("-------------------------------------------------------");
		}
		
		con.setAutoCommit(true);
		con.commit();
		con.close();
		//con.rollback();
	}

}
