package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactDAO {
	static Connection con;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact_details","root","sql@123");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public int getContact(ContactDTO d1)
	{
		
	    int count=0;
		PreparedStatement pstmt;
		
	
		String query="insert into contact_table values(?,?,?,?)";
		
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, d1.getContact_name());
			pstmt.setString(2, d1.getContact_mail());
			pstmt.setString(3, d1.getContact_subject());
			pstmt.setString(4, d1.getContact_message());
			count=pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		return count;
	

}
}
