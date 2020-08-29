package assignmnet.com;

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
	
	static public void insertBook() throws ClassNotFoundException, SQLException, NumberFormatException, IOException, ParseException
	{
		Connection con = getConnection();
        
        System.out.print("Enter Book Name:");
     	String name=rd.readLine();

     	System.out.print("Enter book Price :");
     	int price=Integer.parseInt(rd.readLine());
     	
    	PreparedStatement pstmt=con.prepareStatement("select * from MY_DATA.author");
    	ResultSet rs;
    	int flag=1;
    	int a_num=0;
    	while(true) {
    	System.out.println("select the name of Author from below list who wrote this book or press N/n to create a new Author");
    	rs=pstmt.executeQuery();
    	while(rs.next())
    	{
    		System.out.println(rs.getString(2));
    	}
    	String Aname=rd.readLine();
    	a_num=0;
    	if(Aname.equalsIgnoreCase("n"))
    	{
    		insertAuthor();
    	}
    	else {
    		ResultSet rs1=pstmt.executeQuery();
    		while(rs1.next())
    		{
    			if(rs1.getString(2).equalsIgnoreCase(Aname))
    				{
    					a_num=rs1.getInt(1);
    					flag=0;
    					break;
    				}
    		}
    		if(a_num==0)
    		{
    			System.out.println("Entered name not matching any authors");
    		}
    	}
    	if(flag==0)
    		break;
    	}
    	pstmt = con.prepareStatement("insert into MY_DATA.book values(my_data.ISBN.nextval,?,?)");	
    	pstmt.setString(1, name);
    	pstmt.setLong(2, price);
    	pstmt.execute();
    	 con.commit();
    	PreparedStatement pstmt1=con.prepareStatement("select * from MY_DATA.book");
    	ResultSet rs1=pstmt1.executeQuery();
    	long bISBN=0;
    	while(rs1.next())
		{
			if(rs1.getString(2).equalsIgnoreCase(name))
				{
					
					bISBN=rs1.getLong(1);
					break;
				}
		}
    	 con.commit();
    	pstmt = con.prepareStatement("insert into MY_DATA.book_author values(?,?)");	
    	pstmt.setLong(1, bISBN);
    	pstmt.setInt(2, a_num);
    	pstmt.execute();
    	
    	
        con.commit();
        System.out.println("Inserted book successfully");
	}
	static public void insertAuthor() throws ClassNotFoundException, SQLException, NumberFormatException, IOException, ParseException
	{
		Connection con = getConnection();
		PreparedStatement pstmt;
		System.out.println("Please Enter Below Details");
        System.out.print("Enter First name:");
     	String fName=rd.readLine();

     	System.out.print("Enter Middle name ( Enter * if Nothing to Fill) :");
     	String mName=rd.readLine();
     	
     
     	
     	System.out.print("Enter Last name :");
     	String lName=rd.readLine();
     	
     	System.out.print("Enter Phone number :");
     	String phonNo=rd.readLine();
     	
     	if(mName.equals("*"))
     	{
         	pstmt = con.prepareStatement("insert into MY_DATA.author(id,firstName,lastName ,phNo) values(my_data.INC2.nextval,?,?,?)");
         	pstmt.setString(1, fName);
         	pstmt.setString(2, lName);
         	pstmt.setString(3, phonNo);
     	}
     	else
     	{
     		pstmt = con.prepareStatement("insert into MY_DATA.author values(my_data.INC2.nextval,?,?,?,?)");
     		pstmt.setString(1, fName);
         	pstmt.setString(2, mName);
         	pstmt.setString(3, lName);
         	pstmt.setString(4, phonNo);
     	}
        pstmt.execute();
        con.commit();
        System.out.println("New authors details inserted");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException, ParseException {
		while(true) {
			System.out.println("Enter \n1-->create new author\n2-->insert a book\n3-->Update price for books\n4-->Display books\n5-->Exit");
			int ch=Integer.parseInt(rd.readLine());
			switch(ch)
			{
			case 1:insertAuthor();
				break;
			case 2:insertBook();
				break;
			case 3:incPriceByName();
				break;
			case 4:booksOfAuther();
				break;
			case 5:System.out.println("........thank you........");
				System.exit(0);
			default :System.out.println("not valid choice");
				
			}
		}

	}

	private static void incPriceByName() throws ClassNotFoundException, SQLException, IOException {
		Connection con = getConnection();
    	PreparedStatement pstmt=con.prepareStatement("select * from MY_DATA.author");
    	ResultSet rs;
    	int flag=1;
    	int a_num=0;
    	while(true) {
    	System.out.println("Enter the name of Author from below list whos book's price should be updated");
    	rs=pstmt.executeQuery();
    	while(rs.next())
    	{
    		System.out.println(rs.getString(2));
    	}
    	String Aname=rd.readLine();
    	a_num=0;
    	
    		ResultSet rs1=pstmt.executeQuery();
    		while(rs1.next())
    		{
    			if(rs1.getString(2).equalsIgnoreCase(Aname))
    				{
    					a_num=rs1.getInt(1);
    					flag=0;
    					break;
    				}
    		}
    		if(a_num==0)
    		{
    			System.out.println("Entered name not matching any authors");
    		}
    	if(flag==0)
    		break;
    	}
    	System.out.println("Enter the amount you want to set for all the books of this authoer");
    	int price=Integer.parseInt(rd.readLine());
    	PreparedStatement pstmt1=con.prepareStatement("select * from MY_DATA.book_author");
    	ResultSet rs1=pstmt1.executeQuery();
    	while(rs1.next())
    	{
    		if(rs1.getInt(2)==a_num)
    		{
    			PreparedStatement pstmt11=con.prepareStatement("update MY_DATA.book set price=? where ISBN =?");
    			pstmt11.setInt(1, price);
    			pstmt11.setLong(2, rs1.getLong(1));
    			pstmt11.executeUpdate();
    			con.commit();
    		}
    	}
    	System.out.println("Price updated");
	}

	private static void booksOfAuther() throws ClassNotFoundException, SQLException, IOException {
		Connection con = getConnection();
    	PreparedStatement pstmt=con.prepareStatement("select * from MY_DATA.author");
    	ResultSet rs;
    	int flag=1;
    	int a_num=0;
    	while(true) {
    	System.out.println("select the name of Author from below list whos books you want to see");
    	rs=pstmt.executeQuery();
    	while(rs.next())
    	{
    		System.out.println(rs.getString(2));
    	}
    	String Aname=rd.readLine();
    	a_num=0;
    	
    		ResultSet rs1=pstmt.executeQuery();
    		while(rs1.next())
    		{
    			if(rs1.getString(2).equalsIgnoreCase(Aname))
    				{
    					a_num=rs1.getInt(1);
    					flag=0;
    					break;
    				}
    		}
    		if(a_num==0)
    		{
    			System.out.println("Entered name not matching any authors");
    		}
    	if(flag==0)
    		break;
    	}
    	PreparedStatement pstmt1=con.prepareStatement("select * from MY_DATA.book_author");
    	ResultSet rs1=pstmt1.executeQuery();
    	ResultSet resset=null;;
    	System.out.println("---------------------------");
    	System.out.println("Name\t\tprice");
    	System.out.println("---------------------------");
    	while(rs1.next())
    	{
    		if(rs1.getInt(2)==a_num)
    		{
    			PreparedStatement pstmt11=con.prepareStatement("select * from MY_DATA.book where ISBN =?");
    			pstmt11.setLong(1, rs1.getLong(1));
    			resset=pstmt11.executeQuery();
    			while(resset.next())
    	    	{
    	    		System.out.println(resset.getString(2)+"\t\t"+resset.getInt(3));
    	    	}
    		}
    	}
    	System.out.println();
    	
    	
		
	}

}
