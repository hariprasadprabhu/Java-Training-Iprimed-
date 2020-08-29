package assesment.com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Solution {
	static BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
	public static  Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "system";
        String pwd = "system";
        Connection con = DriverManager.getConnection(url, username, pwd);
        return con;
	}
	static void drop() throws SQLException, NumberFormatException, IOException, ClassNotFoundException
	{
		Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement("drop table my_data.employee");
        pstmt.execute();
        System.out.println("Droped");
	}
	static public void insert() throws ClassNotFoundException, SQLException, NumberFormatException, IOException, ParseException
	{
		Connection con = getConnection();
        PreparedStatement pstmt = con.prepareStatement("insert into MY_DATA.employee values(my_data.INC12.nextval,?,?,?,?,?)");
        SimpleDateFormat inSDF = new SimpleDateFormat("yyyy/mm/dd");
       SimpleDateFormat outSDF = new SimpleDateFormat("dd-mm-yyyy");
        System.out.println("enter name:");
     	String name=rd.readLine();

     	System.out.println("enter password :");
     	String pass=rd.readLine();
     	
     	System.out.println("enter designation :");
     	String desig=rd.readLine();
     	
     	System.out.println("enter date in YYYY/MM/DD form :");
     	String date1=rd.readLine();
     	Date date = inSDF.parse(date1);
        String outDate = outSDF.format(date);
     	String email=null;
     	while(true)
     	{
     	System.out.println("enter email :");
     	email=rd.readLine();
     	if(Pattern.matches("[a-zA-Z0-9]+123@[a-zA-Z0-9]+.com", email))
     			break;
     	else
     		System.out.println("provide a proper email");
     	}    	
     	pstmt.setString(1, name);
     	pstmt.setString(2, pass);
     	pstmt.setString(3, desig);
     	pstmt.setString(4, outDate);
     	pstmt.setString(5, email);
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
	
	 static public void update() throws ClassNotFoundException, SQLException, NumberFormatException, IOException, ParseException
     {
		 SimpleDateFormat inSDF = new SimpleDateFormat("yyyy/mm/dd");
	       SimpleDateFormat outSDF = new SimpleDateFormat("dd-mm-yyyy");
		 Connection con =getConnection();
		 String query = "update my_data.employee set NAME=?, password=?,desig =?,hiredate=?,email=? where ID=?";
         PreparedStatement pstmt = con.prepareStatement(query);
         System.out.println("enter Id who details want to change :");
       	int id=Integer.parseInt(rd.readLine());
       	
         System.out.println("enter name :");
      	String name=rd.readLine();

      	System.out.println("enter password :");
      	String pass=rd.readLine();
      	
      	System.out.println("enter designation :");
      	String desig=rd.readLine();
      	
      	System.out.println("enter date in YYYY/MM/DD form :");
      	String date1=rd.readLine();
      	Date date = inSDF.parse(date1);
        String outDate = outSDF.format(date);
      	String email=null;
      	while(true)
      	{
      	System.out.println("enter email :");
      	email=rd.readLine();
      	if(Pattern.matches("[a-zA-Z0-9]+123@[a-zA-Z0-9]+.com", email))
      			break;
      	else
      		System.out.println("provide a proper email");
      	}    	
      	pstmt.setString(1, name);
      	pstmt.setString(2, pass);
      	pstmt.setString(3, desig);
      	pstmt.setString(4, outDate);
      	pstmt.setString(5, email);
      	pstmt.setInt(6, id);
         pstmt.executeUpdate();
         con.commit();
         System.out.println("Updated");
     }
	 static public void display() throws SQLException, ClassNotFoundException, ParseException
     {
		 Connection con =getConnection();
		 String query = "select * from MY_DATA.employee";
         PreparedStatement pstmt = con.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery(query);
         SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
         SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy/MM/dd");
         System.out.println("-------------------------------------------------------------------------------------------");
    	 System.out.println("ID\tName\tDesignation   \tHire Date   \tEmai");
         System.out.println("-------------------------------------------------------------------------------------------");
         while (rs.next()) {
        	 
             String dateInString = rs.getString(5).substring(0, 10);
             Date date = formatter1.parse(dateInString);
             String d1=formatter1.format(date);
             Date date1 = formatter1.parse(d1);
                 System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(4) + "\t\t" + formatter2.format(date1)
                                 + "\t" + rs.getString(6));
                 System.out.println("-------------------------------------------------------------------------------------------");
         }
     }

	public static void main(String[] args) throws NumberFormatException, ClassNotFoundException, SQLException, IOException, ParseException {
		Connection c=getConnection();
		while(true)
		{
			System.out.println("enter user name (email):");
			String name= rd.readLine();
			System.out.println("enter password:");
			String pass= rd.readLine();
			String qry = "select * from my_data.employee";
			PreparedStatement pstmt = c.prepareStatement(qry);
	        ResultSet rs = pstmt.executeQuery();
	        int flag=1;
	        while(rs.next())
	        {
	        	if(rs.getString(6).equals(name) && rs.getString(3).equals(pass)) {
	        		System.out.println("loggin success:::");
	        		flag=0;
	        		break;
	        	}
	        }
	        if(flag==0)
	        	break;
	        System.out.println("Sorry Please enter a valid name and password");
			
		}
		while(true) {
			System.out.println("press \n1-->Insert\n2-->Update\n3-->Delete\n4-->Display\n5-->Exit");
			int ch=Integer.parseInt(rd.readLine());
			switch(ch)
			{
			case 1:insert();
				break;
			case 2:update();
				break;
			case 3:delete();
				break;
			case 4:display();
				break;
			case 5:System.out.println("........thank you........");
				System.exit(0);
			default :System.out.println("not valid choice");
				
			}
		}

	}

}
