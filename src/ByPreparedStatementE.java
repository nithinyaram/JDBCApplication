import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ByPreparedStatementE {
	Connection con;
	PreparedStatement stmt;

	public ByPreparedStatementE(Connection con) {
		this.con = con;
	}


	public void Create() throws SQLException {
		String sql="insert into Student(Name,College,Branch) values(?,?,?)";
		stmt=con.prepareStatement(sql);
		stmt.setString(1,"Raju");
		stmt.setString(2,"BVRIT");
		stmt.setString(3,"EEE");
		stmt.executeUpdate();
	}
	
}
