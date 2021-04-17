import java.sql.*;
import java.util.ArrayList;

class MysqlCon {
	ArrayList<String[]> data;
	
	public MysqlCon(){
		this.data = new ArrayList<String[]>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chess?autoReconnect=true", "chess", "123456");
			//here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");
			
			while(rs.next()) {
				String[] aux = {
					rs.getString(1), //ID
					rs.getString(2), //handle
					rs.getString(3), //password
					rs.getString(4), //Display Name
				};
				
				data.add(aux);
			}
			con.close();
		} catch(Exception e){
			System.out.println(e);
		}
	}
	
	public ArrayList<String[]> getData() {
		return this.data;
	}
}