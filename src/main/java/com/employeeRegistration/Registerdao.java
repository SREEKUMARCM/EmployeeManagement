package com.employeeRegistration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Registerdao {
	private String dbURL = "jdbc:mysql://localhost:3306/employee";
    private String userName = "root";
    private String password = "passOMKV4545";
	private String dbDriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(dbURL,userName,password);
		}catch(SQLException e) {
			e.printStackTrace();
		 }
		return con;
		
	}
	public String insert(Member member) {
		loadDriver(dbDriver);
		Connection con=getConnection();
		String result="data entered successfully";
		String sql="insert into employeedetails values(?,?,?)";
		PreparedStatement ps;
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,member.getUname());
			ps.setString(2,member.getPassword());
			ps.setString(3,member.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 result="data is not entered";
			
		}
		
		return result;
	}
	public List<Member> getAllMembers() {
	    List<Member> memberList = new ArrayList<>();

	    loadDriver(dbDriver);
	    Connection con = getConnection();
	    String sql = "SELECT * FROM employeedetails";
	    PreparedStatement ps;
	    ResultSet rs;

	    try {
	        ps = con.prepareStatement(sql);
	        rs = ps.executeQuery();

	        while (rs.next()) {
	            String uName = rs.getString("eName");
	            String password = rs.getString("epassword");
	            String email = rs.getString("emailId");
	            Member member = new Member(uName, password, email);
	            memberList.add(member);
	        }

	        rs.close();
	        ps.close();

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    System.out.println("+++++++++++++++++");
        System.out.println(memberList);
	    return memberList;
	}

}
