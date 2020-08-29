package jdbcex.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;		
import java.sql.SQLException;

public class Jdbcdemo2 {

        static Connection getConnect() throws ClassNotFoundException, SQLException {
                Class.forName("oracle.jdbc.OracleDriver");
                String url = "jdbc:oracle:thin:@localhost:1521:xe";
                String username = "system";
                String pwd = "system";
                Connection con = DriverManager.getConnection(url, username, pwd);
                return con;
        }

        public static void main(String[] args) throws Exception {
                do {
                        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println(
                                        "enter the option  :\n 1 insert\n 2 delete\n 3 read\n 4 display\n 5 update\n 6 drop\n 7 create table\n");
                        System.out.println("enter:::");
                        int a = Integer.parseInt(rd.readLine());
                        switch (a) {
                        case 5:
                                update();
                                break;
                        case 2:
                                delete();
                                break;
                        case 3:
                                read();
                                break;
                        case 4:
                                display();
                                break;
                        case 1:
                                insert();
                                break;
                        case 6:
                                drop();
                                break;
                        case 7:
                                createTable();
                                break;
                        }
                } while (true);

        }

        public static void update() throws Exception {
                Connection con = getConnect();
                String query = "update MY_DATA.employee set name=?, age=? where id=?";
                PreparedStatement pstmt = con.prepareStatement(query);
                BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter id :");
                int id = Integer.parseInt(rd.readLine());
                System.out.println("enter name :");
                String name = rd.readLine();
                System.out.println("enter age :");
                int age = Integer.parseInt(rd.readLine());
                pstmt.setString(1, name);
                pstmt.setInt(2, age);
                pstmt.setInt(3, id);
                int res = pstmt.executeUpdate();
                System.out.println(res + " row updated");
                con.close();
        }

        public static void delete() throws Exception {
                Connection con = getConnect();
                String query = "delete from MY_DATA.employee where id=?";
                PreparedStatement pstmt = con.prepareStatement(query);
                BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter id :");
                int id = Integer.parseInt(rd.readLine());
                pstmt.setInt(1, id);
                int res = pstmt.executeUpdate();
                System.out.println(res + " row deleted");
                con.close();
        }

        public static void read() throws Exception {
                Connection con = getConnect();
                String query = "select * from MY_DATA.employee where id=?";
                PreparedStatement pstmt = con.prepareStatement(query);
                BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter id :");
                int id = Integer.parseInt(rd.readLine());
                pstmt.setInt(1, id);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                        System.out.println("----------------------------------------------------------");
                        System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4)
                                        + "\t" + rs.getString(5));
                }
                con.close();
        }

        public static void display() throws Exception {
                Connection con = getConnect();
                String query = "select * from MY_DATA.employee";
                PreparedStatement pstmt = con.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery(query);// 1st row of the table
                while (rs.next()) {
                        System.out.println("----------------------------------------------------------");
                        System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4)
                                        + "\t" + rs.getString(5));
                }
                con.close();
        }

        public static void insert() throws Exception {
                Connection connect = getConnect();
                BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
                String query = "select * from MY_DATA.employee";
                PreparedStatement pstmt = connect
                                .prepareStatement("insert into MY_DATA.employee values(MY_DATA.INC1.nextval,?,?,?,?)");
                do {
                        System.out.println("enter name :");
                        String name = rd.readLine();
                        System.out.println("enter age :");
                        int age = Integer.parseInt(rd.readLine());
                        System.out.println("enter email :");
                        String email = rd.readLine();
                        System.out.println("enter location :");
                        String location = rd.readLine();
                        pstmt.setString(1, name);
                        pstmt.setInt(2, age);
                        pstmt.setString(3, email);
                        pstmt.setString(4, location);
                        int i = pstmt.executeUpdate();
                        System.out.println(1 + "---row  inserted ---");
                        System.out.println("Do you want to continue : (y/n)");
                        String agree = rd.readLine();
                        if (agree.startsWith("n") || agree.startsWith("N")) {
                                break;
                        }
                } while (true);
                connect.close();
        }

        public static void drop() throws Exception {
                Connection con = getConnect();
                String query = "drop table MY_DATA.employee";
                PreparedStatement pstmt = con.prepareStatement(query);
                int rs = pstmt.executeUpdate();// 1st row of the table
                System.out.println("table droped");
                con.close();
        }

        public static void createTable() throws Exception {
                Connection con = getConnect();
                String query = "create table MY_DATA.employee" + "(id number(10) primary key," + " name varchar2(10),"
                                + " age number(30)," + " email varchar2(30)," + " city varchar2(10))";
                PreparedStatement pstmt = con.prepareStatement(query);
                int rs = pstmt.executeUpdate();// 1st row of the table
                System.out.println("table created");
                con.close();
        }
}


