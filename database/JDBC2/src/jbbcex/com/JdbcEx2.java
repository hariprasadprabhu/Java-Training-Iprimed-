package jbbcex.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx2 {
	static BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	static String tname;
	public static  Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String pwd = "system";
        Connection con = DriverManager.getConnection(url, username, pwd);
        return con;
	}

	public static void main(String[] args) throws Exception {
		//************************** Prepared Statement Example *******************************************
		/*Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("registered");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		System.out.println("Connected");*/
		
		
		/*// updation
		 * PreparedStatement ps =
		 * con.prepareStatement("update my_data.student set NAME=? where ROLL =?");
		 * ps.setNString(1, "manjunath"); ps.setInt(2, 8); ps.execute();
		 * System.out.println("Done1");
		 */
		
		
		/*//insertion
		 * PreparedStatement ps =
		 * con.prepareStatement("insert into my_data.student values(?,?,?,?)");
		 * ps.setInt(1, 12); ps.setNString(2, "Romesh"); ps.setInt(3, 29); ps.setInt(4,
		 * 16); int a= ps.executeUpdate(); System.out.println(a+" "+"Done2");
		 */
		
		
		/*//select and display
		 * PreparedStatement ps = con.prepareStatement("select * from my_data.student");
		 * ResultSet rs= ps.executeQuery(); System.out.println("Done1");
		 * 
		 * while(rs.next()) {
		 * System.out.println(rs.getInt("ROLL")+"\t"+rs.getString("NAME")+"\t"+rs.getInt
		 * ("AGE")+"\t"+rs.getInt("STD")); }
		 */
		
		
		/*//reading from user
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * PreparedStatement ps =
		 * con.prepareStatement("delete from  my_data.student where ROLL=?");
		 * System.out.println("Enter roll number to be deleted"); int roll =
		 * Integer.parseUnsignedInt(br.readLine()); ps.setInt(1, roll); ps.execute();
		 * System.out.println("Deleted"); con.commit();
		 */
		//***********************************************************************************
	while(true) {
		System.out.println("press \n1-->create\n2-->insert\n3-->update\n4-->delete\n5-->disply\n6-->drop table and exit\n7-->exit");
		int ch=Integer.parseInt(rd.readLine());
		switch(ch)
		{
		case 1:create();
			break;
		case 2:insert();
			break;
		case 3:update();
			break;
		case 4:delete();
			break;
		case 5:display();
			break;
		case 6:drop();
			break;
		case 7:System.exit(0);
		default :System.out.println("not valid choice");
			
		}
	}

	}
	static void create() throws ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement("create table my_data.employee(id number(10),name varchar(20),age number(10),email varchar(20),city varchar(20))");
        pstmt.execute();
        System.out.println("Created");
        con.commit();
	}
	static void drop() throws SQLException, NumberFormatException, IOException, ClassNotFoundException
	{
		Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement("drop table my_data.employee");
        pstmt.execute();
        System.out.println("Droped");
	}
	static public void insert() throws ClassNotFoundException, SQLException, NumberFormatException, IOException
	{
		Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement("insert into MY_DATA.employee values(?,?,?,?,?)");
        System.out.println("enter id :");
     	int id=Integer.parseInt(rd.readLine());

     	System.out.println("enter name :");
     	String name=rd.readLine();

     	System.out.println("enter age :");
     	int age=Integer.parseInt(rd.readLine());
     	
     	System.out.println("enter email :");
     	String email=rd.readLine();
     	
     	System.out.println("enter city :");
     	String city=rd.readLine();
        
     	pstmt.setString(2, name);
     	pstmt.setInt(3, age);
     	pstmt.setInt(1, id);
     	pstmt.setString(4, email);
     	pstmt.setString(5, city);
        pstmt.execute();
        con.commit();
        System.out.println("Inserted");
	}
	
	static public void delete() throws NumberFormatException, IOException, ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
		System.out.println("enter id you want to delete :");
     	int id=Integer.parseInt(rd.readLine());
     	PreparedStatement pstmt = con.prepareStatement("delete from my_data.employee where id=?");
     	pstmt.setInt(1, id);
     	pstmt.execute();
     	con.commit();
     	System.out.println("Deleted");
     	
	}
	
	 static public void update() throws ClassNotFoundException, SQLException, NumberFormatException, IOException
     {
		 Connection con =getConnection();
		 String query = "update my_data.employee set NAME=?, AGE=? where ID=?";
         PreparedStatement pstmt = con.prepareStatement(query);
         System.out.println("enter id :");
     	int id=Integer.parseInt(rd.readLine());

     	System.out.println("enter name :");
     	String name=rd.readLine();

     	System.out.println("enter age :");
     	int age=Integer.parseInt(rd.readLine());
     	
     	pstmt.setString(1, name);
     	pstmt.setInt(2, age);
     	pstmt.setInt(3, id);
        pstmt.execute();
        con.commit();
        System.out.println("Updated");
     }
	 static public void display() throws SQLException, ClassNotFoundException
     {
		 Connection con =getConnection();
		 String query = "select * from MY_DATA.employee";
         PreparedStatement pstmt = con.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery(query);// 1st row of the table
         while (rs.next()) {
                 System.out.println("----------------------------------------------------------");
                 System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4)
                                 + "\t" + rs.getString(5));
         }
         System.out.println("----------------------------------------------------------");
     }
		
}