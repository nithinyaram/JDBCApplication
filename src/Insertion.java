import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertion {

	Connection con;
	Statement stmt;

	public Insertion(Connection con, Statement stmt) {
		this.con = con;
		this.stmt=stmt;
	}

	public void InsertValues() throws SQLException {
		String sql="insert into Student(Name,College,Branch) values('YaramNithin','KLU','CSE')"	;
		stmt.executeUpdate(sql);
	}
	
	
}
