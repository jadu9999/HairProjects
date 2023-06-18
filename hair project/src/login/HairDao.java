package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    		
    		
    		connDB(); //db연결
    		String query = "insert into hairMember(id,pwd,name,phone) values(?,?,?,?)";
    		
    		stmt = con.prepareStatement(query);
    		
    		//물음표에 값채워넣기
    		stmt.setString(1, member.getId()); 
    		stmt.setString(2, member.getPwd());
    		stmt.setString(3, member.getName());
    		stmt.setString(4, member.getPhone());
    		
    		result = stmt.executeUpdate(); //실질적으로 쿼리실행 
    		
    		
    		
    	}catch (Exception e) {
			e.printStackTrace();
		}
    	
    	return result;
    }
    
    public HairMemberVo loginCheck(HairMemberVo member) {
    	int result = 0;
    	HairMemberVo myMember = new HairMemberVo();
    	try {
    		
    		connDB();
        	String query = "select * from hairMember where id = ? and pwd = ?";
        	
        	stmt = con.prepareStatement(query);
        	
        	stmt.setString(1, member.getId());
        	stmt.setString(2, member.getPwd());
        	
        	rs  = stmt.executeQuery(); //셀렉문 결과값이 1나면 1을반환 int값으로 반환됨
        	
        	while(rs.next()) {
        		myMember.setId(rs.getString("id"));
            	myMember.setPwd(rs.getString("pwd"));
            	myMember.setName(rs.getString("name"));
            	myMember.setPhone(rs.getString("phone"));
            	myMember.setRank(rs.getString("ranks"));
            	myMember.setPoint(rs.getInt("point"));
            	myMember.setPositions(rs.getString("positions"));          	
        	}
        	
        	
    	}catch (Exception e) {
			e.printStackTrace();
		}
     	
    	return myMember;
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
