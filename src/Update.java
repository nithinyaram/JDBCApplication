import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	Connection con;
	Statement stmt;
	public Update(Connection con, Statement stmt) {
		this.con = con;
		this.stmt=stmt;
	}
	public void UpdateValues() throws SQLException {
		String sql="update  STUDENT set branch='EEE' where id=2;";
		stmt.executeUpdate(sql);		
	}
	
}
