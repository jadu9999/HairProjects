package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class HairDao {
	String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521/xe";
    String user = "c##himedia";
    String password = "himedia";
 
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    public int join(HairMemberVo member) {
    	int result = 0;
    	try {
    		
    		
    		connDB();
    		String query = "insert into hairMember(id,pwd,name,phone) values(?,?,?,?)";
    		
    		stmt = con.prepareStatement(query);
    		
    		stmt.setString(1, member.getId());
    		stmt.setString(2, member.getPwd());
    		stmt.setString(3, member.getName());
    		stmt.setString(4, member.getPhone());
    		
    		result = stmt.executeUpdate();
    		
    		
    		
    	}catch (Exception e) {
			e.printStackTrace();
		}
    	
    	return result;
    }
    
    
    public void connDB() {
        try {
            Class.forName(driver);
            System.out.println("jdbc driver loading success.");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("oracle connection success.");
            // stmt = con.createStatement();
            System.out.println("statement create success.");
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
